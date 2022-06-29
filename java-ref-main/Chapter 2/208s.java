/*  Chapter 2.8 Creating Named Constants with final

    --> Final keyword is used to make a variable a named constant (value is read only and can't change during execution)
    --> Normally these variables are written in uppercase letters
    --> These variables have to be initialized when declared
    --> The java API provides a predefined named constant, Math.PI

*/


public class Simple28 {               
    public static void main(String[] sth) {
        final double INTEREST_RATE = 6.9E-2;
        double area;
        int radius;
        area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
