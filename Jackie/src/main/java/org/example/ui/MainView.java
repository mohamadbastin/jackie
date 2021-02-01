package org.example.ui;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import org.example.GUI;
import javafx.scene.shape.*;

import java.io.IOException;

public class MainView {

    public Rectangle classRect;
    public Circle functionCircle;
    public Polygon varPoly;
    public Rectangle interRect;

    public void close(ActionEvent actionEvent) {
        actionEvent.consume();
        System.out.println("closing program");

        //TODO alert dialog
        GUI.window.close();
    }

    public void about(ActionEvent actionEvent) {
//        TODO about page
        System.out.println("going to about page");
    }

    public void createClass(MouseEvent mouseEvent) throws IOException {

//        System.out.println(classRect.getX());
//        System.out.println(classRect.getY());
        System.out.println(classRect.getLayoutX());
        System.out.println(classRect.getLayoutY());

        CreateClassDialog.display();

    }

    public void createFunction(MouseEvent mouseEvent) {

        System.out.println(functionCircle.getLayoutX());
        System.out.println(functionCircle.getLayoutY());

    }

    public void createVariable(MouseEvent mouseEvent) {

        System.out.println(varPoly.getLayoutX());
        System.out.println(varPoly.getLayoutY());

    }

    public void createInterface(MouseEvent mouseEvent) {

        System.out.println(interRect.getLayoutX());
        System.out.println(interRect.getLayoutY());

    }



}
