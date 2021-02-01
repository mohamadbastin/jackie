package org.example.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.example.GUI;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


public class SplashScreen {
    public void clicked(ActionEvent actionEvent) throws IOException {

        System.out.println("done with splash going to mainView");
        Scene TestScene = new Scene(FXMLLoader.<Parent>load(new File(GUI.path_to_here + "ui/MainView.fxml").toURI().toURL()));
        GUI.window.setScene(TestScene);
    }

}
