/* Chapter 2.5 Arithmetic Operators

	--> unary operators e.g. negation operator        
	--> binary operators e.g. assignment operator
	--> only one ternary operator exists in java
	--> variables inside a method should always be initialized before they can be used

*/

public class Simple25 {               
    public static void main(String[] sth) {
        double numberRandom;
        numberRandom = 5 / 2;         //value assigned to numberRandom is 2
        numberRandom = 5.0 / 2;       //value assigned to numberRandom is 2.5
        numberRandom = 2 * Math.pow(4.0, 2.0);  //result is 32
        System.out.println(Math.sqrt(9.0));     //result is 3
    }
}

/* Precedence of arithmetic operators (highest to lowest)
  		 				Highest precedence      - (unary negation)
             			          		    * / %
							Lowest precedence       + -

	--> Parentheses can be used to force some operations be performed before others
	--> Combined assignment operators i.e. balance -= withdrawal, balance += deposit
*/
