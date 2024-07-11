package fr.afpa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        Label labelForm = new Label("Form ");
        Label labelInput = new Label("Enter user");
        Label labelCopy = new Label("Copy of entry");
        Button buttonCopy = new Button("Recopier");
        Button buttonClear = new Button("To erase");
        Button buttonExit = new Button("Exit");
        TextField textInput = new TextField();
        TextField textOutpout = new TextField();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        // gridPane.add(labelForm, 2, 0);
        gridPane.add(labelInput, 0, 0, 2, 1);
        gridPane.add(textInput, 1, 0);
        gridPane.add(buttonCopy, 2, 0);
        gridPane.add(buttonClear, 2, 1);
        gridPane.add(labelCopy, 0, 2);
        gridPane.add(buttonExit, 2, 2);
        gridPane.add(textOutpout, 1, 2);

        VBox vbox = new VBox(labelForm, gridPane);
        VBox buttonBox = new VBox(10);
        buttonBox.setAlignment(Pos.TOP_RIGHT);
        buttonBox.getChildren().addAll(buttonCopy, buttonClear, buttonExit);

        // Ajout du VBox au GridPane
        gridPane.add(buttonBox, 2, 0, 1, 3);
        GridPane.setHalignment(buttonBox, HPos.RIGHT);


        
        

        buttonExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Error");
                stage.close(); // Ferme la fenêtre
            }
        });
        buttonCopy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textOutpout.setText(textInput.getText());
            }
        });
        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textInput.clear();
                textOutpout.clear();
            }
        });

        // vbox.getChildren().addAll(label, exitButton);
        
        // VBox vboxDisplay = new VBox(vbox);

        Scene scene = new Scene(vbox, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Application JavaFX");
        stage.show();
    }
}
