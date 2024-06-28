package com.example.spo_task2;

import com.example.spo_task2.impl.BNFVisitorImpl;
import com.example.spo_task2.parser.BNFLexer;
import com.example.spo_task2.parser.BNFParser;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import com.jfoenix.controls.JFXTextArea;

import java.util.stream.Collectors;

public class HelloController {
    //todo перелопатить парсер и настроить иную обработку ошибок
    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    public void displayVariable(String varName, Double value) {
        long integerPart = value.longValue();
        double fractionalPart = value - integerPart;
        String octalIntegerPart = Long.toOctalString(integerPart);
        String octalFractionalPart = "";
        if (fractionalPart > 0) {
            octalFractionalPart = ".";
            while (fractionalPart > 0) {
                fractionalPart *= 8;
                int digit = (int) fractionalPart;
                octalFractionalPart += Integer.toOctalString(digit);
                fractionalPart -= digit;
            }
        }
        String octalValue = octalIntegerPart + octalFractionalPart;
        outputTextArea.appendText(varName + " = " + octalValue + "\n");
    }



    //    public void onStartClicked(ActionEvent actionEvent) {
//        String inputText = inputTextArea.getText();
//        CharStream charStream = CharStreams.fromString(inputText);
//        BNFLexer lexer = new BNFLexer(charStream);
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//        BNFParser parser = new BNFParser(tokenStream);
//        parser.removeErrorListeners();
//        parser.addErrorListener(new BaseErrorListener() {
//            @Override
//            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
//                outputTextArea.setText("Error at line " + line + ", position " + charPositionInLine + ": " + msg);
//            }
//
//        });
//        ParseTree tree = parser.language();
//        if (parser.getNumberOfSyntaxErrors() > 0) {
//            return;
//        }
//        BNFVisitorImpl visitor = new BNFVisitorImpl();
//        try {
//            Double result = visitor.visit(tree);
//            if (result != null) {
//                String octalResult = Integer.toOctalString(result.intValue());
//                outputTextArea.setText(octalResult);
//            } else {
//                outputTextArea.setText("Error: Invalid expression");
//            }
//        } catch (Exception ex) {
//            outputTextArea.setText("Error: " + ex.getMessage());
//        }
//    }
//    public void onStartClicked(ActionEvent actionEvent) {
//        inputTextArea.setStyle("");
//        String inputText = inputTextArea.getText();
//        CharStream charStream = CharStreams.fromString(inputText);
//        BNFLexer lexer = new BNFLexer(charStream);
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//        BNFParser parser = new BNFParser(tokenStream);
//        parser.removeErrorListeners();
//        parser.addErrorListener(new BaseErrorListener() {
//            @Override
//            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
//                if (e != null) {
//                    int startIndex = e.getOffendingToken().getStartIndex();
//                    int stopIndex = e.getOffendingToken().getStopIndex();
//                    inputTextArea.setStyle("-fx-highlight-fill: red; -fx-highlight-text-fill: white;");
//                    inputTextArea.selectRange(startIndex, stopIndex + 1);
//                    outputTextArea.setText("Error at line " + line + ", position " + charPositionInLine + ": " + msg);
//                } else {
//                    outputTextArea.setText("Error at line " + line + ", position " + charPositionInLine + ": " + msg);
//                }
//            }
//
//        });
//        ParseTree tree = parser.language();
//        if (parser.getNumberOfSyntaxErrors() > 0) {
//            return;
//        }
//        BNFVisitorImpl visitor = new BNFVisitorImpl();
//        try {
//            Double result = visitor.visit(tree);
//            if (result != null) {
//                String octalResult = Integer.toOctalString(result.intValue());
//                outputTextArea.setText(octalResult);
//            } else {
//                outputTextArea.setText("Error: Invalid expression");
//            }
//        } catch (Exception ex) {
//            outputTextArea.setText("Error: " + ex.getMessage());
//        }
//    }

    public void onStartClicked(ActionEvent actionEvent) {
//        outputTextArea.clear();
//        String inputText = inputTextArea.getText();
//        CharStream charStream = CharStreams.fromString(inputText);
//        BNFLexer lexer = new BNFLexer(charStream);
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//        BNFParser parser = new BNFParser(tokenStream);
//        parser.removeErrorListeners();
//        parser.addErrorListener(new BaseErrorListener() {
//            @Override
//            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
//                if (e != null) {
//                    int startIndex = e.getOffendingToken().getStartIndex();
//                    int stopIndex = e.getOffendingToken().getStopIndex();
//                    inputTextArea.setStyle("-fx-highlight-fill: red; -fx-highlight-text-fill: white;");
//                    inputTextArea.selectRange(startIndex, stopIndex +1);
//                    outputTextArea.setText("Error at line " + line + ", position " + charPositionInLine + ": " + msg);
//                } else {
//                    outputTextArea.setText("Error at line " + line + ", position " + charPositionInLine + ": " + msg);
//                }
//            }
//        });
//        ParseTree tree = parser.language();
//        if (parser.getNumberOfSyntaxErrors() > 0) {
//            return;
//        }
//        BNFVisitorImpl visitor = new BNFVisitorImpl(this);
//        try {
//            Double result = visitor.visit(tree);
//            if (result == null){
//                outputTextArea.setText("Error: Invalid expression");
//            }
//        } catch (Exception ex) {
//            outputTextArea.setText("Error: " + ex.getMessage());
//        }
        outputTextArea.clear();
        inputTextArea.setStyle("");

        String inputText = inputTextArea.getText();
        CharStream charStream = CharStreams.fromString(inputText);
        BNFLexer lexer = new BNFLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        BNFParser parser = new BNFParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener(inputTextArea, outputTextArea));
        ParseTree tree = parser.language();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            return;
        }
        BNFVisitorImpl visitor = new BNFVisitorImpl(this);
        try {
            Double result = visitor.visit(tree);
            if (result != null) {
                outputTextArea.appendText("Result: " + result + "\n");
            } else {
                outputTextArea.setText("Error: Invalid expression");
            }
        } catch (Exception ex) {
            outputTextArea.setText("Error: " + ex.getMessage());
        }
    }





    public void onExitClicked(ActionEvent actionEvent) {
        Platform.exit();
    }
}
