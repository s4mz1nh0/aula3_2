/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author lusst
 */
public class Aula2Controller implements Initializable {

    @FXML
    private CheckBox checkBoxpoo1;
    @FXML
    private CheckBox checkBoxBD1;
    @FXML
    private CheckBox checkBoxAEDs1;
    @FXML
    private CheckBox checkBoxES1;
    @FXML
    private Label labelResultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //marcando o checkbox por padrão
        checkBoxBD1.setSelected(true);
        
    }    

    @FXML
    private void pegarInformacoes(ActionEvent event) {
        String info = "";
        
        //Com o elemento checkbox nos temos
        //que verificar individualmente
        //se o mesmo está ou não selecionado
        
        //O método isSelected() diz se o 
        //checkbox está ou não selecionado
        if(checkBoxpoo1.isSelected()){
            //getText retorna o text do checkbox
            info += checkBoxpoo1.getText();
        }
        
        if(checkBoxBD1.isSelected()){
            info += checkBoxBD1.getText();
        }
        
        if(checkBoxES1.isSelected()){
            info += checkBoxES1.getText();
        }
        
        if(checkBoxAEDs1.isSelected()){
            info += checkBoxAEDs1.getText();
        }
        
        //jogar o info no label
        labelResultado.setText(info);
        
    }
    
}
