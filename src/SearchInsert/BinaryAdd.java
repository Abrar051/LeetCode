package SearchInsert;

import java.math.BigInteger;

public class BinaryAdd {

    /*public static int binaryToDec (String a)
    {

    }*/

    public static String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a,2);
        BigInteger num2 = new BigInteger(b,2);
        BigInteger num3 = num1.add(num2);
        String s3 = num3.toString(2);
        return s3;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1111","1010"));

    }
}
