/*	Chapter 2.10 Scope

	--> a variable's scope is the part of the program that has access to the variable
	--> a variable is visible only to statements inside the variable's scope
	--> local variables are declared inside a method
	--> a local variable's scope begins at the variable's declaration and ends at the end of the method in which it's declared
	--> that means it can't be accessed by code outside the method, or inside the method but before the variable's declaration
	--> moreso, you can't have two local variables with the same name in the same scope

*/


public class Simple210 {               
    public static void main(String[] sth) {
        String named = "Mi hauma";
        String greetings = ", How are you?";
	}
}
