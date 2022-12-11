package com.example.calculator;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApplication extends Application {

    public double num1;
    public double num2;
    public String operator;
    public double ans;
    public String input = "0";
    public boolean newEquation = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField tf = new TextField();
        tf.setEditable(false);
        tf.setText(input);
        BorderPane root = new BorderPane();
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10.0);
        gp.setVgap(10.0);
        root.setTop(tf);

        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiply = new Button("*");
        Button buttonDivide = new Button("/");
        Button buttonEquals = new Button("=");

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(newEquation == true) {
                   newEquation = false;
                   input = "";
               }

               input += "1";
               tf.setText(input);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "2";
                tf.setText(input);
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "3";
                tf.setText(input);
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "4";
                tf.setText(input);
            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "5";
                tf.setText(input);
            }
        });

        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "6";
                tf.setText(input);
            }
        });

        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "7";
                tf.setText(input);
            }
        });

        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "8";
                tf.setText(input);
            }
        });

        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "9";
                tf.setText(input);
            }
        });

        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(newEquation == true) {
                    newEquation = false;
                    input = "";
                }
                input += "0";
                tf.setText(input);
            }
        });

        buttonPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input += " + ";
                operator = "+";
                tf.setText(input);
            }
        });

        buttonMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input += " - ";
                operator = "-";
                tf.setText(input);
            }
        });

        buttonMultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input += " * ";
                operator = "*";
                tf.setText(input);
            }
        });

        buttonDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input += " / ";
                operator = "/";
                tf.setText(input);
            }
        });

        buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                input += " = ";
                Scanner scan = new Scanner(input);
                num1 = scan.nextDouble();
                scan.next();
                num2 = scan.nextDouble();
                switch (operator) {
                    case "+" -> ans = num1 + num2;
                    case "-" -> ans = num1 - num2;
                    case "*" -> ans = num1 * num2;
                    case "/" -> ans = num1 / num2;
                }
                input+=ans;
                tf.setText(input);
                newEquation = true;
            }
        });


        gp.add(button1, 0, 0);
        gp.add(button2, 1, 0);
        gp.add(button3, 2, 0);
        gp.add(button4, 3, 0);
        gp.add(button5, 4, 0);

        gp.add(button6, 0, 1);
        gp.add(button7, 1, 1);
        gp.add(button8, 2, 1);
        gp.add(button9, 3, 1);
        gp.add(button0, 4, 1);

        gp.add(buttonPlus, 0, 2);
        gp.add(buttonMinus, 1, 2);
        gp.add(buttonMultiply, 2, 2);
        gp.add(buttonDivide, 3, 2);
        gp.add(buttonEquals, 4, 2);

        root.setCenter(gp);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
