/* Chapter 2.3 - Variables and Literals

--> variable - a named storage location in a computer's memory
--> literal - a value written into the code of a program usually assigned to a variable or ends up being displayed
--> identifier - a programmer-defined name that represents some element of a program

*/

public class Simple23 {               
        public static void main(String[] sth) {
                int value; //variable declaration
                value = 5; //assignment statement
                System.out.print("The value " + "of value is " + value); // '+' is a string concatenation operator
        }
}
/* FOR ALL IDENTIFIERS;
   --> $ is a legal identifier character, but is reserved for special purposes
   --> First Character can be aA - zZ or _ character or $ character
   --> The rest can be aA - zZ, _ character, 0 - 9 digits or $ character
   --> Uppercase and lowercase characters are distinct i.e. twoApples and twoapples are different entities
   --> Should not have spaces
   STANDARD PRACTICE
   --> Capitalize the first letter of the class name and also the first letter of the subsequent word it contains
   --> Variable names begin with a lowercase letter
*/
