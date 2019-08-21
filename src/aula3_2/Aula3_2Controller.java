/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula3_2Controller implements Initializable {

    @FXML
    private RadioButton radioButton1;
    @FXML
    private ToggleGroup periodo;
    @FXML
    private RadioButton radioButton3;
    @FXML
    private RadioButton radioButton5;
    @FXML
    private RadioButton radioButton7;
    @FXML
    private Label dados;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarDados(ActionEvent event) {
        
        String m="";
        //Para verificar se um raio button está selecionado, ultiliza-se 
        //o metodo isselected()
    if(radioButton1.isSelected()){
        m=radioButton1.getText();
    }
    if(radioButton3.isSelected()){
        m=radioButton3.getText();
    }
    if(radioButton5.isSelected()){
        m=radioButton5.getText();
    }
    if(radioButton7.isSelected()){
        m=radioButton7.getText();
    }
    dados.setText(m);
    }
    
}
