package by.juki.ui;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;

public class AppLauncher extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //create scene
        Label helloWorldLabel = new Label("Hello world!");
        helloWorldLabel.setAlignment(Pos.CENTER);
        helloWorldLabel.setFont(javafx.scene.text.Font.font(Font.SANS_SERIF));
        helloWorldLabel.setMinHeight(20);
        Scene primaryScene = new Scene(helloWorldLabel);

        //configure stage
        stage.setTitle("TP_LAB_1");
        stage.setWidth(1000);
        stage.setHeight(600);
        stage.setScene(primaryScene);
        stage.show();
    }
}
