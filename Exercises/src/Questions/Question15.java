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
public class Question15 {
    public static void main(String[] args){
        double n1, n2, n3, n4, media, pesos;
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o número 1: "));
        n2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o número 2: "));
        n3 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o número 3: "));
        n4 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o número 4: "));
        pesos = 1+2+3+4;
        media = (n1*1+n2*2+n3*3+n4*4)/(pesos);
        JOptionPane.showMessageDialog(null,"Número1: "+n1+"\n"+"Número2: "+n2+
                "\n"+"Número3: "+n3+"\n"+"Número4: "+n4+"\n"+media);
        JOptionPane.showMessageDialog(null,n1*1+n2*2+n3*3+n4*4+"\n"+pesos);
    }    
}
