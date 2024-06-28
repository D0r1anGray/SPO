package com.example.spo_task2;

import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class MyErrorListener extends BaseErrorListener {
    private final TextArea inputTextArea;
    private final TextArea outputTextArea;

    public MyErrorListener(TextArea inputTextArea, TextArea outputTextArea) {
        this.inputTextArea = inputTextArea;
        this.outputTextArea = outputTextArea;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorMessage = "Ошибка на линии " + line + ", позиция " + charPositionInLine + ": ";
        if (e != null) {
            int startIndex = e.getOffendingToken().getStartIndex();
            int stopIndex = e.getOffendingToken().getStopIndex();
            inputTextArea.selectRange(startIndex, stopIndex + 1);
            inputTextArea.setStyle("-fx-highlight-fill: red; -fx-highlight-text-fill: white;");
            if (e instanceof NoViableAltException) {
                errorMessage += "Нет альтернативы для '" + e.getOffendingToken().getText() + "'";
            } else if (e instanceof InputMismatchException) {
                String expectedToken = e.getExpectedTokens().toString(recognizer.getVocabulary());
                errorMessage += "Ожидался токен '" + expectedToken + "', но найден '" + e.getOffendingToken().getText() + "'";
//            } else if (e instanceof FailedPredicateException failedPredicateException) {
//                ParserRuleContext ctx = (ParserRuleContext) failedPredicateException.getCtx();
//                errorMessage += "rule " + ctx.getRuleIndex() + " failed predicate: {" + ctx.getPredicateText() + "}?";
            }
        }else  {
            String input = offendingSymbol.toString();
            int startIndex = input.indexOf(',') + 1;
            int endIndex = input.indexOf(':');
            String charPositionStr = input.substring(startIndex, endIndex);
            int charPosition = Integer.parseInt(charPositionStr);
            System.out.println(charPosition);
            String symbol = input.substring(input.indexOf('\'') + 1, input.lastIndexOf('\''));
            System.out.println(symbol);

            int stopIndex = charPosition + symbol.length();
            inputTextArea.selectRange(charPosition, stopIndex);
            inputTextArea.setStyle("-fx-highlight-fill: red; -fx-highlight-text-fill: white;");
            errorMessage += "Лишний ввод " + '\''+symbol+'\'' + " ожидалась переменная, цифра или функция";
        }
        outputTextArea.setText(errorMessage);
    }
}
