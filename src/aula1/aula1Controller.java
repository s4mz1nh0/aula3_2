/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author lusst
 */
public class aula1Controller implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Label labelSurpresa;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Você me clicou!");
        
        //Recebendo o texto armazenado em um label
        String m = label.getText();
        
        label.setText(m + " Ola Mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void surpresa(ActionEvent event) {
        System.out.println("Vc ganhou 10 pontos!");
        
        labelSurpresa.setText("Vc ganhou 10 pontos!");
    }
    
}
