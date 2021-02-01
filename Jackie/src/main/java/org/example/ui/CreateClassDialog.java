package org.example.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.GUI;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateClassDialog {

    public ComboBox<String> accessMod;
    public ComboBox<String> nonAccessMod;

    ObservableList<String> accessModOptions =
            FXCollections.observableArrayList(
                    "none",
                    "public",
                    "private",
                    "protected"
            );
    ObservableList<String> nonAccessModOptions =
            FXCollections.observableArrayList(
                    "none",
                    "final",
                    "abstract",
                    "static"
            );

    public static void display() throws IOException {
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Create New Class");
        window.setMinWidth(500);

        Scene scene = new Scene(FXMLLoader.<Parent>load(new File(GUI.path_to_here + "ui/CreateClassDialog.fxml").toURI().toURL()));
        window.setScene(scene);
        window.showAndWait();
    }

    @FXML
    public void initialize() {

        accessMod.getItems().addAll(accessModOptions);
        accessMod.getSelectionModel().select("public");

        nonAccessMod.getItems().addAll(nonAccessModOptions);
        nonAccessMod.getSelectionModel().select("none");
    }
}