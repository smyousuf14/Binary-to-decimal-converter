/*
 * A converter class that converts binary to decimal.
 */
package converter;

import java.lang.Math;
import java.util.*;
/**
 *
 * @author Syed Yousuf
 */
public class Converter 
{
    /*Instance Variables*/
    private int binaryValue;
    private int decimalValue;
    
    /*Default Constructor*/
    public Converter()
    {
        // Blank 
    }
    
    /*
    * Get the binaryValue
    * 
    *@return binaryValue
    */
    public int getBinaryValue()
    {
        return binaryValue;
    }
    
    /*
    * Get the decimalValue
    *
    *@return decimalValue
    */
    public int getDecimalValue()
    {
        return decimalValue;
    }
    
    /*
    * Convert binary to decimal
    *
    *@param binary The binary value
    */
    public void binaryToDecimal(String binary) throws IllegalArgumentException
    {
        // Set the binary value
        binaryValue = Integer.parseInt(binary);
        
        // Local Variables
        int sum = 0;
        int size;
        int counter;
        String number = String.valueOf(binaryValue);
        int indiNum; // The individual number     
        int powerNum = 0;
        
        // Determine the decimal value
        size = number.length();
        
        for(counter = 0; counter < size; counter++)
        { 
            try
            {
                indiNum = Character.digit(number.charAt(size - counter - 1),10);
                sum += indiNum * java.lang.Math.pow(2,counter);
                if(indiNum == 0 || indiNum == 1)
                {
                    
                }
                else
                {
                    // Throw an exception
                    throw new IllegalArgumentException("Binary num must be 1 or 0");
                }
                
            }
            catch(StringIndexOutOfBoundsException e)
            {
                // Do nothing
            }
        }
        
        decimalValue = sum;
    }
    
    /*
    * Convert decimal to binary
    *
    *@param decimal The decimal Value
    */
    public void decimalToBinary(String decimal)
    {
        // Local Variable
        int remainder;
        int divident;
        String result = "";
        Stack st = new Stack(); // Store the temporary binary values
        int size = 0;
        int counter;
        
        divident = Integer.parseInt(decimal);
        
        // Perform the division and mod to find the binary equivalent.
        remainder = divident % 2;
        divident = divident / 2;
        
        while(divident != 0)
        {
            
            // If there is a remainder, then add a 1, else add 0
            if(remainder == 0)
            {
                st.push("0");
            }
            else
            {
                st.push("1");
            }
            
            remainder = divident % 2;
            divident = divident / 2;
            size++;
        }
        
        // If there is a remainder, then add a 1, else add 0
            if(remainder == 0)
            {
                st.push("0");
            }
            else
            {
                st.push("1");
            }
            size++;
            
        // Now pop the stack
        for(counter = 0; counter < size; counter++)
        {
            result += st.pop();
        }
        
        binaryValue = Integer.parseInt(result);
    }
    
    
    /*
    Test method
    */
    public static void main(String[]args)
    {
        Converter c1 = new Converter();
        c1.binaryToDecimal("0110101");
        System.out.println(c1.getDecimalValue());
    }
}
