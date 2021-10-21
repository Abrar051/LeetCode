package SearchInsert;
import java.util.*;

public class MaximumSubArray {


    //run sub array cutting function


    public static String[] subarray (String[] array , int first , int last)
    {
        int arrayLength = last-first+1;
        String[] subarray = new String[last-first+1];
        for (int i=0;i<(last-first+1);i++)
        {
            subarray[i]=array[first+i];
        }
        return subarray;
    }



    //convert string into character array

    public static char[] charArray (String str)
    {
        char[] ch = new char[str.length()];
        for (int i=0;i<str.length();i++)
        {
            ch[i]= str.charAt(i);
        }
        return ch;
    }

    public static Object[] defineLastWord (String str)
    {
        char[] ch = charArray(str);
        char[] ch2 = new char[str.length()];
        int firstIndex=0,lastIndex=0;
        Stack<Character> stk = new Stack<>();
        Stack<Character> space = new Stack<>();
        Stack<Character> string = new Stack<>();
        for (int i=0;i<str.length();i++)
        {
            stk.push(ch[i]);
        }

        return stk.toArray();
    }


    public static int arrayToInt (int[] array)
    {
        int len = array.length;
        int sum=0;
        for (int i=0;i<array.length;i++)
        {
            array[i]= (int) (array[i]*Math.pow(10,(array.length-i-1)));
            sum=sum+array[i];
        }
        return sum;
    }

    public static int[] intToArray (int num)
    {
        int[] array = new int[1];
        int counter=0;
        while (num!=0)
        {
            array[counter]=num%10;
            num=num/10;
            counter++;
            if (num==0)
            {
                break;
            }
            array=Arrays.copyOf(array,array.length+1);
        }
        StringBuilder reversed = new StringBuilder();

        for (int i = array.length; i > 0; i--) {
            reversed.append(array[i - 1]).append(" ");
        };

        String[] reversedArray = reversed.toString().split(" ");
        int[] ints = Arrays.stream(reversedArray).mapToInt(Integer::parseInt).toArray();
        return ints;
    }



    public static int[] plusOne(int[] digits) {
        int result = arrayToInt(digits) + 1;
        return intToArray(result);
    }


    public static void main(String[] args) {
        String[] array = {" "," ","h","e","l","l","o"," ","w","o","r","l","d"," "};
        int first = 1,last=3;
        int[] num = {1,2,3,4,5,4};
        //System.out.println(Arrays.toString(subarray(array,first,last)));
        //System.out.println(defineLastWord(array.toString()));
        //System.out.println(Arrays.toString(array));
        //System.out.println(defineLastWord(array.toString()));
        System.out.println(Arrays.toString(plusOne(num)));
    }
}
