package level1.java;

public class Power_Number {
    public static void main(String[] args) {
    	//Here number is the base and p is the exponent
        int number = 2, p = 7;
        long result = 1;
        
        //Copying the exponent value to the loop counter
        int i = p;
        for (;i != 0; --i)
        {
            result *= number;
        }
        
        //Displaying the output
        System.out.println(number+"^"+p+" = "+result);
    }
}
