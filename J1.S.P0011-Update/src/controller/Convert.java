/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.math.BigInteger;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Convert {

    String stringValue = "0123456789ABCDEF";

    public String convert(int inputBase, int outputBase, String inputString) {
        String result = "";
        switch (inputBase) {
            case 2:
                result = binaryConvertIntoOther(outputBase, inputString);
                break;
            case 10: 
                result = decimalConvertIntoOther(outputBase, inputString);
                break;
            case 16:
                break;
            
        }
        return result;
    }

    public String binaryConvertIntoOther(int outputBase, String valueString) {
        BigInteger binaryBase = new BigInteger("2");
        BigInteger result = new BigInteger("0");
        String value = ""; 

        switch (outputBase) {
            case 10:
                for (int i = 0; i < valueString.length(); i++) {
                    BigInteger index = new BigInteger(Character.toString(valueString.charAt(i)));
                    result = result.add(index.multiply(binaryBase.pow(valueString.length() - i - 1)));
                }
                value = result.toString();
                break;
            case 16:
                HashMap<String, String> binToOther = new HashMap<String, String>();

                binToOther.put("0000", "0");
                binToOther.put("0001", "1");
                binToOther.put("0010", "2");
                binToOther.put("0011", "3");
                binToOther.put("0100", "4");
                binToOther.put("0101", "5");
                binToOther.put("0110", "6");
                binToOther.put("0111", "7");
                binToOther.put("1000", "8");
                binToOther.put("1001", "9");
                binToOther.put("1010", "A");
                binToOther.put("1011", "B");
                binToOther.put("1100", "C");
                binToOther.put("1101", "D");
                binToOther.put("1110", "E");
                binToOther.put("1111", "F");

                while (valueString.length() % 4 != 0) {
                    valueString = "0" + valueString;
                }
                for (int i = 0; i < valueString.length(); i+=4) {
                    String tmp = valueString.substring(i, i + 4);
                    value += binToOther.get(tmp);
                }
                break;
        }
        return value;
    }
    
    public String decimalConvertIntoOther(int outputBase, String valueString){
        
    }
}
