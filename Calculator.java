import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Calculator extends Application {
    Scene scene;
    HBox bottomMenu = new HBox();
    VBox vBox = new VBox();
    Label operand1, operand2, result;
    TextField op1, op2, resulted;
    Button button1, button2, button3, button4;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculator");
        operand1 = new Label("operand1: ");
        operand2 = new Label("operand2: ");
        result = new Label("result: ");
        op1 = new TextField();
        op2 = new TextField();
        resulted = new TextField();
        resulted.setEditable(false);
        button1 = new Button("+");
        button2 = new Button("-");
        button3 = new Button("*");
        button4 = new Button("/");

        button1.setOnAction(e -> {
            double num1 = Double.parseDouble(op1.getText());
            double num2 = Double.parseDouble(op2.getText());
            String result = Double.toString((num1 + num2));
            resulted.setText(result);
        });
        button2.setOnAction(e -> {
            double num1 = Double.parseDouble(op1.getText());
            double num2 = Double.parseDouble(op2.getText());
            String result = Double.toString((num1 - num2));
            resulted.setText(result);
        });
        button3.setOnAction(e -> {
            double num1 = Double.parseDouble(op1.getText());
            double num2 = Double.parseDouble(op2.getText());
            String result = Double.toString((num1 * num2));
            resulted.setText(result);
        });
        button4.setOnAction(e -> {
            double num1 = Double.parseDouble(op1.getText());
            double num2 = Double.parseDouble(op2.getText());
            String result = Double.toString((num1 / num2));
            resulted.setText(result);
        });

        bottomMenu.getChildren().addAll(button1, button2, button3, button4);
        vBox.getChildren().addAll(operand1, op1, operand2, op2, result, resulted, bottomMenu);
        scene = new Scene(vBox, 200, 160);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
