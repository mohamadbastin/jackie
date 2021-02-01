package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.ui.SplashScreen;

import java.io.File;

public class GUI extends Application {

    public static String path_to_here = "C:/Users/Mohamad/Desktop/Uni/Pishrafte/Project/Jackie/src/main/java/org/example/";

    public static void main(String[] args) {
        launch(args);
    }
    public static Stage window;

    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Parent root = FXMLLoader.load(new File(path_to_here + "ui/SplashScreen.fxml").toURI().toURL());
        Scene splashScreenScene = new Scene(root);
        Scene TestScene = new Scene(FXMLLoader.<Parent>load(new File(path_to_here + "ui/Test.fxml").toURI().toURL()));
        window.setTitle("Jackie");
//        window.getIcons().add(new Image(path_to_here + "resources/logo.png"));
//        window.getIcons().add(new Image(path_to_here + "resources/logo.png"));
        window.setScene(splashScreenScene);
        window.show();


    }
}
