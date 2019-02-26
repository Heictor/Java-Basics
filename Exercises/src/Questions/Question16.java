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
public class Question16 {
    public static void main(String[] args){
    double base, altura, perimetro, area, diagonal, Pbase, Paltura;
    base = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor da base: "));
    altura = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor da altura: "));
    area = (base*altura);
    Pbase = Math.pow(base, 2);
    Paltura = Math.pow(altura, 2);
    diagonal = Math.sqrt((Pbase+Paltura));
    perimetro = (altura*2)+(base*2);
    JOptionPane.showMessageDialog(null,"Base: "+base+"\n"+"Altura: "+altura+"\n"+
            "Perímetro: "+perimetro+"\n"+"Área: "+area+"\n"+"Diagonal"+diagonal);
    }    
}
