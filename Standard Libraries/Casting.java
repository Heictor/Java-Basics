package simplepackage;

//import java.util.*;

/**
 *
 * @author heict
 */
public class Casting {
    
    //static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        
        //Casting means convert one data type to another
        //You can always convert small data types to bigger ones
        
        int intNumber = 9;
        long longNumber = intNumber;
        
        //To convert bigger to smaller data types is a little different
        double doubleNumber = 87.46871;
        int notDoubleNumberAnymore = (int) doubleNumber;
        System.out.println(doubleNumber+"\n"+notDoubleNumberAnymore);
    }
    
}
