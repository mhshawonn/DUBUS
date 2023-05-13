package com.example.project;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    @FXML
    private Button button;

    @FXML
    private PasswordField passcode;

    @FXML
    private TextField username;

    @FXML
    private Label wrongpassword;
    @FXML
    private ImageView exit;

    @FXML
    void userlogin(ActionEvent event) throws IOException {
        checkLogin();

    }
    private void checkLogin() throws IOException{
        Main m=new Main();
        if(username.getText().toString().equals("1234") && passcode.getText().equals("1234") ){
            wrongpassword.setText("Success!!");
            m.changeScene("Admin.fxml");
        }
       else if(username.getText().isEmpty()){
            wrongpassword.setText("Please enter your Email");
        }
       else if(passcode.getText().isEmpty()){
            wrongpassword.setText("Please enter your Password");
        }
       else if(username.getText().isEmpty() && passcode.getText().isEmpty()){
            wrongpassword.setText("Please enter your data");
        }
        else{
            wrongpassword.setText("Wrong password or Email");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
    }
}
