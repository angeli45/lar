package ru.lar.praktika6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;


import javax.swing.*;
import java.io.IOException;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage primayStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;
    private Scene dopscene1;

    @Override
    public void start(Stage stage) throws IOException {
        primayStage = stage;
        scene1 = createScrine1();
        scene2 = createScrine2();
        scene3 = createScrine3();
        scene4 = createScrine4();
        dopscene1 = createdopscrin1();
        primayStage.setTitle("Практическая работа 6");
        primayStage.setScene(scene1);
        primayStage.show();
    }

    private Scene createScrine1() {
        Label zLable = new Label("Задание 1");
        zLable.setStyle("-fx-font-size:20px; -fx-front-weight:bolt;");
        TextField aTextField = new TextField();
        TextField bTextField = new TextField();
        TextField cTextField = new TextField();
        Button BTN = new Button("Найти");
        Label RezultLable = new Label();

        BTN.setOnAction(www -> {
            try {
                int a = Integer.parseInt(aTextField.getText());
                int b = Integer.parseInt(bTextField.getText());
                int c = Integer.parseInt(cTextField.getText());
                int V = a * b * c;
                int S = 2 * (a * b + b * c + a * c);
                RezultLable.setText("V= " + V + "; S=" + S);
            } catch (NumberFormatException e) {
                RezultLable.setText("Некорректные данные");
            } finally {
                JOptionPane.showMessageDialog(null, "Значение вычеслено");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("1.1");
        btn1.setOnAction(event -> primayStage.setScene(scene1));
        btn2.setOnAction(event -> primayStage.setScene(scene2));
        btn3.setOnAction(event -> primayStage.setScene(scene3));
        btn4.setOnAction(event -> primayStage.setScene(scene4));
        btn5.setOnAction(event -> primayStage.setScene(dopscene1));
        HBox root2 = new HBox(10, btn1, btn2, btn3, btn4, btn5);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), aTextField, new Label("b= "), bTextField, new Label("c= "), cTextField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, zLable, root1, BTN, RezultLable, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root);
    }

    private Scene createScrine2() {
        Label zLable = new Label("Задание 2");
        zLable.setStyle("-fx-font-size:20px; -fx-front-weight:bolt;");
        TextField X1TextField = new TextField();
        X1TextField.setPromptText("X1");
        TextField X2TextField = new TextField();
        X2TextField.setPromptText("X2");
        TextField Y1TextField = new TextField();
        Y1TextField.setPromptText("Y1");
        TextField Y2TextField = new TextField();
        Y2TextField.setPromptText("Y2");
        Button BTN = new Button("Найти");
        Label RezultLable = new Label();

        BTN.setOnAction(www -> {
            try {
                int x1 = Integer.parseInt(X1TextField.getText());
                int x2 = Integer.parseInt(X2TextField.getText());
                int y1 = Integer.parseInt(Y1TextField.getText());
                int y2 = Integer.parseInt(Y2TextField.getText());
                double a = abs(x2 - x1);
                double b = abs(y2 - y1);
                double P = 2 * (a + b);
                double S = a * b;
                RezultLable.setText("P= " + P + "; S=" + S);
            } catch (NumberFormatException e) {
                RezultLable.setText("Некорректные данные");
            } finally {
                JOptionPane.showMessageDialog(null, "Значение вычеслено");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("1.1");
        btn1.setOnAction(event -> primayStage.setScene(scene1));
        btn2.setOnAction(event -> primayStage.setScene(scene2));
        btn3.setOnAction(event -> primayStage.setScene(scene3));
        btn4.setOnAction(event -> primayStage.setScene(scene4));
        btn5.setOnAction(event -> primayStage.setScene(dopscene1));
        HBox root2 = new HBox(10, btn1, btn2, btn3, btn4, btn5);
        root2.setAlignment(Pos.CENTER);
        VBox vBox1 = new VBox(10, X1TextField, X2TextField);
        VBox vBox2 = new VBox(10, Y1TextField, Y2TextField);

        HBox root1 = new HBox(10, vBox1, vBox2);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, zLable, root1, BTN, RezultLable, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root);
    }

    private Scene createScrine3() {
        Label zLable = new Label("Задание 3");
        zLable.setStyle("-fx-font-size:20px; -fx-front-weight:bolt;");
        TextField shocKG = new TextField();
        shocKG.setPromptText("вес");
        TextField IrisKG = new TextField();
        IrisKG.setPromptText("вес");
        TextField ShocRUB = new TextField();
        ShocRUB.setPromptText("цена");
        TextField IrisRUB = new TextField();
        IrisRUB.setPromptText("цена");
        Button BTN = new Button("Найти");
        Label RezultLable1 = new Label();
        Label RezultLable2 = new Label();

        BTN.setOnAction(www -> {
            try {
                double x = Double.parseDouble(shocKG.getText());
                double y = Double.parseDouble(IrisKG.getText());
                double a = Double.parseDouble(ShocRUB.getText());
                double b = Double.parseDouble(IrisRUB.getText());
                double s = a / x;
                double i = b / y;
                RezultLable1.setText("1 кг шоколадных = " + s + ", 1 кг ирисок = " + i + ", в " + s / i + " раз шоколадные конфеты дороже ирисок");
                RezultLable2.setText("в " + s / i + " раз шоколадные конфеты дороже ирисок");
            } catch (NumberFormatException e) {
                RezultLable1.setText("Некорректные данные");
            } finally {
                JOptionPane.showMessageDialog(null, "Значение вычеслено");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("1.1");
        btn1.setOnAction(event -> primayStage.setScene(scene1));
        btn2.setOnAction(event -> primayStage.setScene(scene2));
        btn3.setOnAction(event -> primayStage.setScene(scene3));
        btn4.setOnAction(event -> primayStage.setScene(scene4));
        btn5.setOnAction(event -> primayStage.setScene(dopscene1));
        HBox root2 = new HBox(10, btn1, btn2, btn3, btn4, btn5);
        root2.setAlignment(Pos.CENTER);
        HBox hBox1 = new HBox(10, new Label("Шоколадные конфеты"), shocKG, ShocRUB);
        HBox hBox2 = new HBox(10, new Label("Ириски: "), IrisKG, IrisRUB);
        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
        VBox root1 = new VBox(10, hBox1, hBox2);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, zLable, root1, BTN, RezultLable1, RezultLable2, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root);
    }
    private Scene createScrine4() {
        Label zLable = new Label("Задание 4");
        zLable.setStyle("-fx-font-size:20px; -fx-front-weight:bolt;");
        TextField xTextField = new TextField();
        TextField bTextField = new TextField();
        Button BTN = new Button("Найти");
        Label RezultLable = new Label();

        BTN.setOnAction(www -> {
            try {
                double x = Double.parseDouble(xTextField.getText());
                double b = Double.parseDouble(bTextField.getText());
                double z = pow(x,2) + pow(b,2);
                double a= (pow(x,6)+cbrt(z*pow(x,4)+cos(x+z)))/log(abs(x+z));
                RezultLable.setText("a = "+ a);
            } catch (ArithmeticException e) {
                RezultLable.setText("Деление на ноль");
            } finally {
                JOptionPane.showMessageDialog(null, "Значение вычеслено");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("1.1");
        btn1.setOnAction(event -> primayStage.setScene(scene1));
        btn2.setOnAction(event -> primayStage.setScene(scene2));
        btn3.setOnAction(event -> primayStage.setScene(scene3));
        btn4.setOnAction(event -> primayStage.setScene(scene4));
        btn5.setOnAction(event -> primayStage.setScene(dopscene1));
        HBox root2 = new HBox(10, btn1, btn2, btn3, btn4, btn5);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x="), xTextField, new Label("b= "), bTextField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, zLable, root1, BTN, RezultLable, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root);
    }
    private Scene createdopscrin1() {
        Label zLable = new Label("Дополнительное задание");
        zLable.setStyle("-fx-font-size:20px; -fx-front-weight:bolt;");
        TextField A1 = new TextField();
        A1.setPromptText("A1");
        TextField A2 = new TextField();
        A2.setPromptText("A2");
        TextField B1 = new TextField();
        B1.setPromptText("B1");
        TextField B2 = new TextField();
        B2.setPromptText("B2");
        TextField C1 = new TextField();
        C1.setPromptText("C1");
        TextField C2 = new TextField();
        C2.setPromptText("C2");
        Button BTN = new Button("Найти");
        Label RezultLable1 = new Label();
        Label RezultLable2 = new Label();

        BTN.setOnAction(www -> {
            try {
                int a1 = Integer.parseInt(A1.getText());
                int a2 = Integer.parseInt(A2.getText());
                int b1 = Integer.parseInt(B1.getText());
                int b2 = Integer.parseInt(B2.getText());
                int c1 = Integer.parseInt(C1.getText());
                int c2 = Integer.parseInt(C2.getText());

                double d = a1 * b2 - a2 * b1;
                double x = (c1 * b2 - c2 * b1) / d;
                double y = (a1 * c2 - a2 * c1) / d;
                if (d != 0) {
                    RezultLable1.setText(String.valueOf(x));
                    RezultLable2.setText(String.valueOf(y));
                }
                else {
                    RezultLable1.setText("Нет решения.");
                    RezultLable2.setText("Нет решения.");
                }
            } catch (ArithmeticException e) {
                RezultLable1.setText("Деление на ноль");
            } finally {
                JOptionPane.showMessageDialog(null, "Значение вычеслено");
            }
        });
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("1.1");
        btn1.setOnAction(event -> primayStage.setScene(scene1));
        btn2.setOnAction(event -> primayStage.setScene(scene2));
        btn3.setOnAction(event -> primayStage.setScene(scene3));
        btn4.setOnAction(event -> primayStage.setScene(scene4));
        btn5.setOnAction(event -> primayStage.setScene(dopscene1));
        HBox root2 = new HBox(10, btn1, btn2, btn3, btn4, btn5);
        root2.setAlignment(Pos.CENTER);
        HBox hBox1 = new HBox(10, A1,A2);
        HBox hBox2 = new HBox(10, B1,B2);
        HBox hBox3 = new HBox(10, C1,C2);
        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
        hBox3.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, zLable, hBox1, hBox2, hBox3, BTN, RezultLable1, RezultLable2, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root);
    }


    public static void main(String[] args) {
        launch();
    }
}