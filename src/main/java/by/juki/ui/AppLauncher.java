package by.juki.ui;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

public class AppLauncher extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getClassLoader().getResourceAsStream("mainScene.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("TP_LAB_1");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
