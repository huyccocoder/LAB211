package ultis;

import java.util.Scanner;

public class GetInputData {

    Scanner sc = new Scanner(System.in);

    /**
     * @param msg
     * @param min
     * @param max
     * @param baseIn
     * @return
     */
    public int getBase(String msg, int min, int max, int baseIn) {
        int choice;
        int base = -1;
        String input;

        do {
            System.out.print(msg);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("The choice could not be empty");
                continue;
            } else {
                try {
                    choice = Integer.parseInt(input);
                    if (choice >= min && choice <= max) {
                        switch (choice) {
                            case 1:
                                base = 2;
                                break;
                            case 2:
                                base = 10;
                                break;
                            case 3:
                                base = 16;
                                break;
                            case 4:
                                System.exit(0);
                                break;
                        }
                        // Check value of variable baseIn with the base is chosen by user
                        if (base == baseIn) {
                            System.out.println("Base output could not same base input");
                            continue;
                        } else {
                            return base;
                        }
                    } else {
                        System.out.println("Choice must between " + min + " and " + max);
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Choice must be integer");
                }
            }
        } while (true);
    }

    public String getInput(String msg, int baseInput) {
        String input;
        String regexBase = "";
        switch (baseInput) {
            case 2:
                // Accept input of digits 0 or 1 unlimited length
                regexBase = "^[0-1]+$";
                break;
            case 10:
                // Accept input of digits 0 to 9 unlimited length
                regexBase = "^[0-9]+$";
                break;
            case 16:
                // Accept input is a to z both UpperCase and LowerCase
                // and 0 to 9
                regexBase = "^[a-fA-F0-9]+$";
                break;
        }
        do {
            System.out.print(msg);
            input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Input could not be empty. Please input string non-empty!!!");
            }
            else{
                // Check variable 'input' whether correct format by regex or not
                if (!input.matches(regexBase)) {
                    System.out.println("Input is wrong format " + regexBase);
                    continue;
                }
                else{
                    return input.toUpperCase();
                }
            }
        } while (true);
    }

}