package com.example.project;

import javafx.event.ActionEvent;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class BUS {
    @FXML
    private Button home;
    @FXML
    private Label Name;
    @FXML
    private Label Salary;
    public void home(ActionEvent actionEvent) throws IOException {
        Main m=new Main();
        m.changeScene("Admin.fxml");
    }
}
