package br.edu.femass.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpcaoController implements Initializable{
    @FXML
        private void QuadradoTela(ActionEvent event){
            FXMLLoader fx = new FXMLLoader(OpcaoController.class.getResource("/fxml/Quadrado.fxml"));
            try {
                Scene s = new Scene(fx.load());
                Stage st = new Stage();
                st.setTitle("Quadrado");
                st.setScene(s);
                st.show();
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

}