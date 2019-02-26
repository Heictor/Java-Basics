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
public class Question07 {
    public static void main(String[] args){
        double n1, n2,Qn1,Qn2,soma;
        
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o número 1: "));
        n2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o número 2: "));
        Qn1 = Math.pow(n1,2);
        Qn2 = Math.sqrt(n2);
        soma = Qn1+Qn2;
        JOptionPane.showMessageDialog(null,n1+"\n"+n2+"\n"+Qn1+"\n"+Qn2+"\n"+soma);
    }    
}
