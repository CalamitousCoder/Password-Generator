/********************************************************************************
 *@file PasswordGenerator.java
 *@brief This program lets the user customize and generate a random password
 *@author Destiny Hale
 ********************************************************************************/
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class PasswordGenerator {

        // Method to grab letters from alphabet

        static char getLetter() {

            // Make alphabet in array
            char[] alphabet =
                    "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

            //Generates a random letter

            double randomNumber = Math.random() * ((51 - 0) + 0);
            int letter = (int) randomNumber;

            //return that letter
            return alphabet[letter];

        }
        static char getSymbol() {

            // Make alphabet in array
            char[] symbols =
                    "!@#$^*?".toCharArray();

            //generate a random letter

            double index = Math.random() * ((7 - 0) + 0);
            int randomSymbol = (int) index;

            //return that letter
            return symbols [randomSymbol];

        }

        public static void main(String[] args) {
            Scanner inputChar = new Scanner(System.in);
            Scanner symbolUse = new Scanner(System.in);
            int characters;
            boolean useSymbol;


            // Prompts User
            System.out.println("Let's generate a password!");
            System.out.println("");
            System.out.println("How many characters?");

            // Gets user input
            characters = inputChar.nextInt();


          //Asks user if using Symbols
            System.out.println("");
            System.out.println("Use Special Symbols?");
            System.out.println("");
            System.out.println("Y or N");
            System.out.println("");
            String symbols = symbolUse.nextLine();

            if (symbols.equals("Y")) {
                useSymbol = true;
            } else {
                useSymbol = false;
            }

            // make array to store password

            char[] passwordArray = new char[characters];

            // set array size to number of characters -1

            if (useSymbol) {
                for (int i = 0; i < characters - 1; i++) {

// Randomize between filling with letters and symbols
                    double randomizer = Math.random();
                    if (randomizer < 0.71) {
                        passwordArray[i] = getLetter();
                    }  else {
                        passwordArray[i] = getSymbol();
                    }
                }
// Ensure at least one symbol at end
                passwordArray[characters - 1] = getSymbol();

                // Otherwise just fill password with random letters
            } else {
                for (int i = 0; i < characters; i++) {
                    passwordArray[i] = getLetter();
                }


            }
            //print password
            System.out.println("");
            System.out.println("Here's your password!");

            System.out.println("");
            for (int i = 0; i < characters; i++) {
                System.out.print(passwordArray[i]);
            }
        }
    }

