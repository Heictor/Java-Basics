/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepackage;

/**
 *
 * @author heict
 */
public class Math {
    
    public static void main(String[] args){
        
        System.out.println("6 + 7 = "+(6+7));
        System.out.println("6 - 7 = "+(6-7));
        System.out.println("6.0 - 7.0 = "+(6.0+7.0));
        System.out.println("6 * 7 = "+(6*7));
        System.out.println("6 / 7 = "+(6/7));
        System.out.println("6.8 + 7.2 = "+(6.8+7.2));
        System.out.println("6 % 7 = "+(6%7));
        
        int lilNumbr = 0;
        System.out.println("lilNumb: "+(lilNumbr++)); //Will print the variable and then add "1"
        System.out.println("lilNumb: "+(++lilNumbr)); //Will add "1" to the variable and then print its value 
        
        lilNumbr += 10; /*is the same thins as*/ lilNumbr = lilNumbr +10;
    }

    static int random() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
