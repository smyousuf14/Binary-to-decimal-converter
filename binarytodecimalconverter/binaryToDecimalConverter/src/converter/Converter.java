/*
 * A converter class that converts binary to decimal.
 */
package converter;

import java.lang.Math;
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
    public void binaryToDecimal(String binary)
    {
        // Set the binary value
        binaryValue = Integer.parseInt(binary);
        
        // Local Variables
        int sum = 0;
        int size;
        int counter;
        String number = String.valueOf(binaryValue);
        int indiNum; // The individual number
        
        // Determine the decimal value
        size = binary.length();
        
        for(counter = 0; counter < size; counter++)
        { 
            try
            {
                indiNum = Character.digit(number.charAt(counter),10);
                //indiNum = (int)number.charAt(counter);
                sum += indiNum * java.lang.Math.pow(2,counter);
            }
            catch(StringIndexOutOfBoundsException e)
            {
                // Do nothing
            }
        }
        
        decimalValue = sum;
        //decimalValue = binaryValue;
    }
    
    /*
    Test method
    */
    public static void main(String[]args)
    {
        Converter c1 = new Converter();
        c1.binaryToDecimal("0001000011");
        System.out.println(c1.getDecimalValue());
    }
}
