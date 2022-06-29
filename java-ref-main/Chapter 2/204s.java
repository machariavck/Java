/* Chapter 2.4 - Primitive Data Types

  --> primitive data types for numeric data - byte(1 byte), short(2), int(4), long(8), float(4, 7 digits) and double(8,15).
  --> The word 'primitive' is used since they cannot be used to create objects
  --> Unicode characters occupy two bytes of memory i.e. A is represented as [0065]

*/

public class Simple23 {               
        public static void main(String[] sth) {
                boolean isValid;
                isValid = true;
                char letter;
                letter = 65; //this similar to letter = 'A'
                int checking = -20;
                byte miles = 105;
                short minutes = 120;
                long days = 18900L;
                float price, tax, total;
                price = 29.75F;
                tax = 1.76F;
                total = price + tax;
                System.out.println("We have made a journey of " + miles + " miles. " +
                            "And it took us " + minutes + " minutes whilst owing a debt of $" +
                            checking + "for lasting " + days + " days since overdue date.");
                System.out.println("The price of the item is " + price + " and tax is " + tax +
                            ". Thus total is " + total + ". Is that " + coin + "?");
        }
}
/*  
	--> integer literals are treated as long by suffixing with the letter 'L' or 'l' i.e. days = 18900L
	--> floating-point literals are treated as float instead of double by suffixing with the letter 'F' or 'f'
	--> E notation of 47,982.25 is 4.798225E4( using lowercase 'e' will work too), scientific notation 4.798225 x 10(4)
*/
