package by.juki.ui.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public MenuItem createRay;
    public MenuItem createLine;
    public MenuItem createBrokenLine;
    public MenuItem createSegment;

    public void create(String name) {
        System.out.println("creating " + name);
    }

    public void create() {
        System.out.println("creating nothing");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createRay.addEventHandler(ActionEvent.ACTION, event -> {
            create("Ray");
        });
        createLine.addEventHandler(ActionEvent.ACTION, event -> {
            create("Line");
        });
    }
}
