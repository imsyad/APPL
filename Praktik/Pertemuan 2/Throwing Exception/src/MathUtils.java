// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************

public class MathUtils {
//-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------

    public static int  factorial(int n) throws IllegalArgumentException{
        int fac = 1;
        
        //check wether input is negatif or out of bound
        if(n < 0)
            throw new IllegalArgumentException("Factorial can't be a negative number");
        else if (n > 16)
            throw new IllegalArgumentException("Arithmetic Overflow");
        
        //input pass the test
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
