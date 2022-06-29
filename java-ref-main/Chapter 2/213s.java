/* Chapter 2.13 Reading Keyboard Input

	--> When the user types, the keystrokes are stored in an area of memory, sometimes called the keyboard buffer
	--> Pressing the enter key causes a newline character to be stored in the keyboard buffer

*/

import java.util.Scanner;

/** Mixing calls to nextLine with calls to other Scanner methods*/
public class s213 {               

	/** This program can have a problem reading input*/
    public static void main(String[] sth) {
        String name;
        int age;
        double income;

        Scanner inputKeys = new Scanner(System.in);

        System.out.print("What's your age? "); //Get the user's age
        age = inputKeys.nextInt(); 
        /*if the user inputs e.g. 24 and presses enter, the nextInt method reads the value 24 from the keyboard buffer
          but stops when it encounters the newline character, which remains in the buffer */
                                  
        System.out.print("What's your annual income? "); //Get the user's income
        income = inputKeys.nextDouble();
        /*if the user types e.g. 5000.00 and presses enter, the nextDouble method first encounters the newline character 
          left behind, but is designed to skip it anyway. It then reads the value 5000.00 from the keyboard buffer and then 
          stops reading when it encounters the next newline character, which is left in the keyboard buffer */
        
        inputKeys.nextLine(); /*this statement would solve a problem here; by consuming the remaining newline character;
        the method's return value isn't assigned to any variable, as we don't intend to keep it*/

        System.out.print("What's your name? "); //Get the user's name
        name = inputKeys.nextLine();
        /* The nextLine method is not usually designed to skip over an initial newline character, and if that's the character
           it encounters first, nothing will be read. Instead, it will immediately terminate and the user is not given a 
           chance to enter a value */

        System.out.println("Hello, " + name + ". Your age is " + age + " and your income is $" + income);
            
    }
}
