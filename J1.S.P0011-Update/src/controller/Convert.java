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

    String stringValueHex = "0123456789ABCDEF";

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
                result = hexadecimalConvertIntoOther(outputBase, inputString);
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
                for (int i = 0; i < valueString.length(); i += 4) {
                    String tmp = valueString.substring(i, i + 4);
                    value += binToOther.get(tmp);
                }
                break;
        }
        return value;
    }

    public String decimalConvertIntoOther(int outputBase, String valueString) {
        BigInteger numberIn = new BigInteger(valueString);
        BigInteger ouputBase_String = new BigInteger(Integer.toString(outputBase));
        StringBuilder result = new StringBuilder();

        while (true) {
            if (!numberIn.equals(new BigInteger("0"))) {
                BigInteger remainder = numberIn.remainder(ouputBase_String);
                char number = stringValueHex.charAt(remainder.intValue());

                result.append(number);
                numberIn = numberIn.divide(ouputBase_String);
            } else {
                return result.reverse().toString();
            }
        }
    }

    public String hexadecimalConvertIntoOther(int outputBase, String valueString) {
        String result = "";
        BigInteger baseIn = new BigInteger("16");

        switch (outputBase) {
            case 2:
                HashMap<String, String> hexToOther = new HashMap<String, String>();

                hexToOther.put("0", "0000");
                hexToOther.put("1", "0001");
                hexToOther.put("2", "0010");
                hexToOther.put("3", "0011");
                hexToOther.put("4", "0100");
                hexToOther.put("5", "0101");
                hexToOther.put("6", "0110");
                hexToOther.put("7", "0111");
                hexToOther.put("8", "1000");
                hexToOther.put("9", "1001");
                hexToOther.put("A", "1010");
                hexToOther.put("B", "1011");
                hexToOther.put("C", "1100");
                hexToOther.put("D", "1101");
                hexToOther.put("E", "1110");
                hexToOther.put("F", "1111");

                for (int i = 0; i < valueString.length(); i++) {
                    result += hexToOther.get(Character.toString(valueString.charAt(i)));
                }
                break;
            case 10:
                BigInteger value = new BigInteger("0");
                for (int i = 0; i < valueString.length(); i++) {
                    int number = stringValueHex.indexOf(Character.toString(valueString.charAt(i)));
                    System.out.println(number + " " + i);
                    BigInteger numberIn = new BigInteger(Integer.toString(number));

                    value = value.add(numberIn.multiply(baseIn.pow(valueString.length() - i - 1)));
                    System.out.println(value);
                }
                result = value.toString();
                break;
        }
        return result;
    }
}
