/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author heict
 */
public class Question17 {
    public static void main(String[] args){
       int dias, meses, anos;
       dias = (int) Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor de dias: "));
       anos = dias/365;
       meses = dias/30;
       JOptionPane.showMessageDialog(null,"A quantidade de dias inseridos em anos é: "+anos+"\n"+
               "A quantidade de dias inseridos em meses é: "+meses+"\n"+
               "A quantidade de dias inseridos foi: "+dias);   
    }    
}
