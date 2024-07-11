package fr.afpa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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

        Label form= new Label("Form ");
        Label enterUser = new Label("Enter user");
        Label copyEnterUser  = new Label ("Copy of entry");
        Button copy = new Button ("Recopier");
        Button erase = new Button ("To erase");
        Button exitButton = new Button("Exit");
        TextField textInput = new TextField();
        TextField textOutpout = new TextField();

       GridPane gridPane = new GridPane();
       gridPane.add(form, 2, 0);
       gridPane.add (enterUser, 0,1);
       gridPane.add(copyEnterUser, 0,3);
       gridPane.add(copy, 4,1);
       gridPane.add(erase, 4, 2);
       gridPane.add(exitButton, 4,3);
       gridPane.add(textInput, 1, 1);
       gridPane.add(textOutpout, 1, 3);
     




       
       exitButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Error");
            stage.close(); // Ferme la fenêtre
        }
    });
    copy.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            textOutpout.setText(textInput.getText());
        }
    });
    erase.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            textInput.clear();
            textOutpout.clear();
        }
    });

        
        
        VBox vbox = new VBox(gridPane);

        // vbox.getChildren().addAll(label, exitButton);

        Scene scene = new Scene(vbox, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Application JavaFX");
        stage.show();
    }
}
