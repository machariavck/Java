/*  Chapter 2.9 The String Class

    --> the String class allows creation of objects for holding strings, and has various methods for working with strings
    --> primitive-type variables hold the actual data items with which they are associated
    --> class-type or reference variables hold the memory address of the data items they are associated with

*/


public class Simple29 {               
    public static void main(String[] sth) {
        String named = "Meinertzhagen Haversack";
                //the statement declares named as a String variable
                //creates a String object with the value "Meinertzhagen Haversack" stored in it
                //assigns the object's memory address to the named variable
        String greetings = ", How are you?";
        int combinedStringSize = named.length() + greetings.length();
        System.out.println(named + greetings);
        System.out.println(combinedStringSize);
        System.out.println(named.charAt(6));
        System.out.println(named.toLowerCase());
        System.out.println(greetings.toUpperCase());
    }
}
