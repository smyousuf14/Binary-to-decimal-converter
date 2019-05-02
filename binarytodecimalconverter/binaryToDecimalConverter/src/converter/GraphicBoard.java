/*
 * This is the graphic board class which provides a graphic framework for the 
 */
package converter;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

/**
 *
 * @author Syed Yousuf
 */
public class GraphicBoard 
{
    // Instance Variables
    private Converter convert;
    private String input;
    private boolean isBinary; // Default is that the conversion is from binary to decimal
    
    /*
    * Default Constructor
    */
    public GraphicBoard()
    {
        convert = new Converter();
        input = "";
        isBinary = true;
        
        // Now create the buttons
        JLabel textField = new JLabel("0");
        JLabel result = new JLabel("");
        textField.setOpaque(true);
        textField.setForeground(Color.blue);
        textField.setBackground(Color.lightGray);
        textField.setBounds(0,0,500,50);
        result.setForeground(Color.blue);
        result.setBackground(Color.lightGray);
        result.setBounds(0,70,500,50);
        
        /*Create the frame*/
        JFrame f = new JFrame("Binary to Decimal Converter");
        
        /*Create the textfield*/
        
        /*Create the operation buttons*/
        JButton convertB = new JButton("CONVERT");
        JButton swap = new JButton("SWAP");
        
        convertB.setBounds(350,300,150,100);
        swap.setBounds(350,200,100,100);
        
        convertB.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(isBinary)
                {
                    convert.binaryToDecimal(input);
                    
                    result.setText("" + convert.getDecimalValue());
                }
                
            }
        
        });
        
        
        swap.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(isBinary)
                {
                    isBinary = false;
                }
                else
                {
                    isBinary = true;
                }
                
            }
        
        });
        
        /*Create the numbers buttons*/
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        
        zero.setBounds(50,350,150,50);
        one.setBounds(50,300,50,50);
        two.setBounds(100,300,50,50);
        three.setBounds(150,300,50,50);
        four.setBounds(50,250,50,50);
        five.setBounds(100,250,50,50);
        six.setBounds(150,250,50,50);
        seven.setBounds(50,200,50,50);
        eight.setBounds(100,200,50,50);
        nine.setBounds(150,200,50,50);
        
        zero.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add zero to the register*/
                input += "0";
                textField.setText(input);
            }
        });
        
        one.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                input += "1";
                textField.setText(input);
       
            }
        });
        
        two.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add two to the register*/
                input += "2";
                textField.setText(input);
       
            }
        });
        
        three.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
               input += "3";
               textField.setText(input);
       
            }
        });
        
        four.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                input += "4";
               textField.setText(input);
                
       
            }
        });
        
        five.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                input += "4";
               textField.setText(input);
               
       
            }
        });
        
        six.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                input += "5";
               textField.setText(input);
                
       
            }
        });
        
        
        seven.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                input += "6";
               textField.setText(input);
                
       
            }
        });
        
        eight.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                input += "7";
               textField.setText(input);
                
       
            }
        });
        
        nine.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                input += "8";
               textField.setText(input);
                
       
            }
        });
       
        /*Set the frame properties*/
        f.add(zero);
        f.add(convertB);
        f.add(swap);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        f.add(textField);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        
        
    }
    
    /*
    * The main method
    */
    public static void main(String[]args)
    {
        GraphicBoard b1 = new GraphicBoard();
       
    }
            
    
    
}
