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
public class Question30 {
    public static void main(String[] args){
        double salB,salL,inss,vd;
        vd = Double.parseDouble(JOptionPane.showInputDialog("Valor de vendas: "));
        salB = (1500+(vd*0.05));
        inss = (salB*0.08);
        salL = salB-inss;
        JOptionPane.showMessageDialog(null,"O total vendido no mês foi: "+vd+"\n"+
                "O salário bruto é de: "+salB+"\n"+"O valor retirado pelo INSS foi de: "+
                inss+"\n"+"O salário líquido é: "+salL);
    }
}
