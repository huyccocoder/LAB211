package controller;

import java.math.BigInteger;
import java.util.HashMap;

public class Convert {

    final String valueHex = "0123456789ABCDEF";

    public String convertValue(String inputValue, int inputBase, int ouputBase) {
        String result = "";
        switch (inputBase) {
            case 2:
                result = convertBinaryToOther(inputValue, ouputBase);
                break;
            case 10:
                result = convertDecimalToOther(inputValue, ouputBase);
                break;
            case 16:
                result = convertHexaToOther(inputValue, ouputBase);
                break;
        }
        return result;
    }

    /**
     * @param inputValue
     * @param ouputBase
     * @return
     */
    public String convertDecimalToOther(String inputValue, int ouputBase) {
        BigInteger numberIn = new BigInteger(inputValue);
        BigInteger outputBase_String = new BigInteger(Integer.toString(ouputBase));
        StringBuilder result = new StringBuilder();
        do {
            BigInteger remain = numberIn.remainder(outputBase_String);
            char hexValue = valueHex.charAt(remain.intValue());

            if (!numberIn.equals(new BigInteger("0"))) {
                result.append(hexValue);
                numberIn = numberIn.divide(outputBase_String);
            } else {
                break;
            }
        } while (true);
        return result.reverse().toString();
    }

    public String convertBinaryToOther(String inputValue, int ouputBase) {
        BigInteger inputBase = new BigInteger("2");
        String result = "";

        switch (ouputBase) {
            case 10:
                BigInteger resultByConvert = new BigInteger("0");
                // loop use to acess each character from the b
                for (int i = 0; i < inputValue.length(); i++) {
                    String digit = Character.toString(inputValue.charAt(i));
                    BigInteger coeffect = new BigInteger(digit);
                    // Fix
                    resultByConvert = resultByConvert.add(coeffect.multiply(inputBase.pow(inputValue.length() - i - 1)));
                }
                result = resultByConvert.toString();
                break;
            case 16:
                HashMap<String, String> binToHex = new HashMap<String, String>();
                binToHex.put("0000", "0");
                binToHex.put("0001", "1");
                binToHex.put("0010", "2");
                binToHex.put("0011", "3");
                binToHex.put("0100", "4");
                binToHex.put("0101", "5");
                binToHex.put("0110", "6");
                binToHex.put("0111", "7");
                binToHex.put("1000", "8");
                binToHex.put("1001", "9");
                binToHex.put("1010", "A");
                binToHex.put("1011", "B");
                binToHex.put("1100", "C");
                binToHex.put("1101", "D");
                binToHex.put("1110", "E");
                binToHex.put("1111", "F");
                // check remain of length of valueInput divided by 4 equal 0 or not
                while (inputValue.length() % 4 != 0) {
                    inputValue = "0" + inputValue;
                }
                for (int i = 0; i < inputValue.length(); i += 4) {
                    String index = inputValue.substring(i, i + 4);
                    result += binToHex.get(index);
                }
                break;
        }
        return result;
    }

    public String convertHexaToOther(String inputValue, int ouputBase) {
        BigInteger inputBase = new BigInteger("16");
        String result = "";

        switch (ouputBase) {
            case 2:
                HashMap<String, String> hexToBin = new HashMap<String, String>();
                hexToBin.put("0", "0000");
                hexToBin.put("1", "0001");
                hexToBin.put("2", "0010");
                hexToBin.put("3", "0011");
                hexToBin.put("4", "0100");
                hexToBin.put("5", "0101");
                hexToBin.put("6", "0110");
                hexToBin.put("7", "0111");
                hexToBin.put("8", "1000");
                hexToBin.put("9", "1001");
                hexToBin.put("A", "1010");
                hexToBin.put("B", "1011");
                hexToBin.put("C", "1100");
                hexToBin.put("D", "1101");
                hexToBin.put("E", "1110");
                hexToBin.put("F", "1111");

                for (int i = 0; i < inputValue.length(); i++) {
                    String hex = Character.toString(inputValue.charAt(i));
                    result += hexToBin.get(hex);
                }
                break;
        
            case 10:
                BigInteger resultConvert = new BigInteger("0");
                for (int i = 0; i < inputValue.length(); i++) {
                    int digit = valueHex.indexOf(Character.toString(inputValue.charAt(i)));
                    BigInteger hecToDec = new BigInteger(Integer.toString(digit));
                    resultConvert = resultConvert.add(hecToDec.multiply(inputBase.pow(inputValue.length() - i - 1)));
                }
                result = resultConvert.toString();
                break;
        }
        return result;
    }
}
