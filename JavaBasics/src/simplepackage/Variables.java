package simplepackage;

/**
 *
 * @author heict
 */
public class Variables {
    
    public static void main(String[] args){
        
        //Declaration of a int variable
        int Variable1 = 157;
        System.out.println("Variable1: "+Variable1);
        
        //Declaration of a float variable
        //Can be done this way
        float Variable2 = (float) 78.464;
        //Or you can split the process on declaration and designation
        float Variable3; //Declaration
        Variable3 = (float) 78.464; //Designation
        //Instead of typing "(float)"
        //you can type a "F" (Uppercased F) at the end of the number
        float Variable4 = 78.464F;
        //Print out the variable to check if its value is correct
        System.out.println("Variable2: "+Variable2);
        System.out.println("Variable3: "+Variable3);
        System.out.println("Variable4: "+Variable4);
        //Notice that varibles 2, 3 and 4 were assigned differently
        //but all of them with the same value
        //and none of them gave us a error message at the output
        
        //It is possible (also) to declare mutiple variables in on line
        //To assign values to it or not is optional
        int V1 = 4, V2 = 5 , V3 = 6, V4;
        System.out.println(V1+"\n"+V2+"\n"+V3);
        
        //Java can receive scientific notation as assigment to a variable value
        double tenThousand = 1e+4;
        System.out.println("Ten thousand: "+tenThousand);
        
        //You can use underslash to make the numbers easier to understand
        int distance = 8_4_5;
        System.out.println("The distance between our cities is "+distance+"Km");
        long giantNumber = 976_486_789;
        System.out.println("Earth population is around: "+giantNumber);
    }
    
}
