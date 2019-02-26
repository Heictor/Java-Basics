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
public class Question09 {
    public static void main(String[] args){
        double raio, area;
        raio = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor do raio: "));
        area = Math.PI*(Math.pow(raio, 2));
        JOptionPane.showMessageDialog(null,raio+"\n"+Math.PI+"\n"+Math.pow(raio, 2)+"\n"+area);
    }     
}
