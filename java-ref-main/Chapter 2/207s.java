/*	Chapter 2.7 Conversion between Primitive data types

    --> Double has the highest data type ranking - followed by float, long, int, short and byte the lowest
    --> Cast operators enable manual conversion of a value, even if it means a narrowing conversion will take place (where the value becomes truncated)
    ***The result of an arithmetic operation using only a mixture of byte, short or int will always be an int.

*/

public class Simple27 {               
    public static void main(String[] sth) {
        double numJ = 23;
        int numG = 4;
        int numK = 10;
        numJ = numG;    //performs a widening conversion
        numG = numJ;    //performs a narrowing conversion, potential data loss, not performed automatically
        numG = (int)numJ; //returns the value in numJ, converted to an int by truncating
        double digits = numK / numG; // the value of digits is 2.0
        double digitz = (double)(numK / numG);  //the value of digitz is 2.0
        double digite = (double)numK / numG; //the value of digite is 2.5
        System.out.println(digite);
        short firstNumber = 10, secondNumber = 20, thirdNumber;
        thirdNumber = firstNumber + secondNumber;        //this causes an error, corrected by using cast operator
        thirdNumber = (short)(firstNumber + secondNumber);  //this is the correct way, else make thirdNumber an int
    }
}

/* Mixed Mathematical Expressions i.e. a = b + c
    --> if b is double, c is int, then c is made double, and the value of a will be double, so a should be double
    --> if b is short, c is float, then b is made float, and the value of a is float, so a should be double or float
    --> if b is long, c is short, then c is made long, and the value of a is long, so a should be long, float or double
*/
