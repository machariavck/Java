/* Chapter 2.2 - Println, Print methods and Java API

--> Elements of a programming language; punctuation, keywords, programmer-defined names, syntax and operators.

*/

public class Simple22 {               
        public static void main(String[] sth) {
             System.out.println("Progress is added value!"); //prints the argument and advances cursor to next line
                //the text inside the parentheses is called an argument.
             System.out.print("Progress is good."); //prints the argument and cursor remains at the end of the argument
        }
}

/* ESCAPE SEQUENCES - start with a backslash character \ followed by a control character (stored as a single character)
    --> newline character \n advances cursor to the next line for subsequent printing
    --> horizontal tab \t cursor skips over to the next tab stop
    --> backspace \b cursor moves back up, or moves left, one position
    --> return \r cursor goes to the beginning of the current line
    --> backslash \\ a backslash character is printed
    --> single quote \' prints a single quotation mark character
    --> double quote \" prints a double quotation mark character
*/
