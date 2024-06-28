package com.example.spo_task2.impl;

import com.example.spo_task2.HelloController;
import com.example.spo_task2.parser.BNFBaseVisitor;
import com.example.spo_task2.parser.BNFParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.Map;

public class BNFVisitorImpl extends BNFBaseVisitor<Double> {

    private Map<String, Double> variables = new HashMap<>();

    private HelloController controller;

    public BNFVisitorImpl(HelloController controller) {
        this.controller = controller;
    }

    @Override
    public Double visitOper(BNFParser.OperContext ctx) {
        String varName = ctx.perem().getText();
        Double value = visit(ctx.rightPart());
        variables.put(varName, value);
        controller.displayVariable(varName, value);
        return value;
    }


    @Override
    public Double visitLanguage(BNFParser.LanguageContext ctx) {
        Double result = null;
        for (BNFParser.OperContext operCtx : ctx.oper()) {
            result = visitOper(operCtx);
        }
        return result;
    }

    @Override
    public Double visitRightPart(BNFParser.RightPartContext ctx) {
        double result = visit(ctx.part1(0));
        for(int i = 1; i < ctx.part1().size(); i++){
            String op = ctx.getChild(i*2 - 2).getText();
            double value = visit(ctx.part1(i));
            if (op.equals("+")) {
                result += value;
            } else if (op.equals("-")) {
                result -= value;
            } else {
                throw new IllegalArgumentException("Unexpected operator: " + op);
            }
        }
        return result;
    }


    @Override
    public Double visitNumb(BNFParser.NumbContext ctx) {
        String text = ctx.getText();
        int value = Integer.parseInt(text, 7);
        return (double) value;
    }

    @Override
    public Double visitPart1(BNFParser.Part1Context ctx) {
        double result = visit(ctx.part2(0));
        for (int i = 1; i < ctx.part2().size(); i++) {
            if (ctx.getChild(i * 2 - 1).getText().equals("*")) {
                result *= visit(ctx.part2(i));
            } else {
                result /= visit(ctx.part2(i));
            }
        }
        return result;
    }

    @Override
    public Double visitPart2(BNFParser.Part2Context ctx) {
        double result = visit(ctx.part3(0));
        for (int i = 1; i < ctx.part3().size(); i++) {
            if (ctx.getChild(i * 2 - 1).getText().equals("&")) {
                result = (result != 0 && visit(ctx.part3(i)) != 0) ? 1 : 0;
            } else {
                result = (result != 0 || visit(ctx.part3(i)) != 0) ? 1 : 0;
            }
        }
        return result;
    }

    @Override
    public Double visitPart3(BNFParser.Part3Context ctx) {
        double result = visit(ctx.part4(0));
        if (ctx.getChildCount() > 1 && ctx.getChild(0).getText().equals("не")) {
            result -= 2*result;
        }
        return result;
    }

    //todo Реализовать вычисление отрицательных чисел в правой части
    @Override
    public Double visitPart4(BNFParser.Part4Context ctx) {
        if (ctx.numb() != null) {
            return Double.parseDouble(ctx.numb().getText());
        } else if (ctx.perem() != null) {
            String varName = ctx.perem().getText();
            if (variables.containsKey(varName)) {
                return variables.get(varName);
            } else {
                throw new IllegalArgumentException("Undefined variable: " + varName);
            }
        } else if (ctx.func() != null) {
            double result = visit(ctx.func().getChild(ctx.func().getChildCount() - 1));
            for (int i = ctx.func().getChildCount() - 2; i >= 0; i -= 2) {
                String opName = ctx.func().getChild(i).getText();
                double arg = result;
                result = switch (opName) {
                    case "sin" -> Math.sin(arg);
                    case "cos" -> Math.cos(arg);
                    case "tg" -> Math.tan(arg);
                    default -> throw new UnsupportedOperationException("Unknown function: " + opName);
                };
            }
            return result;
        }
        return null;
    }
}

