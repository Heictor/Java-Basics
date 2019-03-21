package Questions;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author Heictor Costa
 */
public class Question07 {
    public static void main(String[] args){
        double n1,n2,Pn1,Pn2,sum;
        
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog("Type the first number: "));
        n2 = Double.parseDouble(
                JOptionPane.showInputDialog("Type the second number: "));
        Pn1 = Math.pow(n1,2);
        Pn2 = Math.sqrt(n2);
        sum = Qn1+Qn2;
        JOptionPane.showMessageDialog(null,n1+"\n"+n2+"\n"+Pn1+"\n"+Pn2+"\n"+sum);
    }    
}
