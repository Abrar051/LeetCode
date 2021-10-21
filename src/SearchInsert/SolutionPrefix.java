package SearchInsert;
import java.util.*;
import java.util.StringJoiner;
class SolutionPrefix {
    public static String longestCommonPrefix(String[] str) {
        int counter = 0;
        int prefixFirst=0;
        char[] longestPrefix= new char[1];
        char ideal;
        boolean flag=true;

        if (str.length == 0 || str == null)
        {
            return "";
        }

        String prefix = str[0];
        for(int i = 0; i < str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;

        /*Arrays.sort(str);
        String first = str[0], last = str[str.length - 1];

        //do without sorting


            String prefix=str[0];
            for(int i =1;i<str.length;i++){
                while(str[i].indexOf(prefix)!=0){
                    prefix=prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix;*/

        //first loop will increase the index of string array
        //second loop will move in string array

        /*for (int i=0;i<2;i++)
        {
            ideal=str[i].charAt(i);
            for (int j=0;j< str.length;j++)
            {
                if (str[j].charAt(i)==ideal)
                {
                    longestPrefix=Arrays.copyOf(longestPrefix,1);
                    longestPrefix[i]=ideal;
                }
                else {
                    return String.valueOf(longestPrefix);
                }
            }
        }
        return null;*/
    }

    public static void main(String[] args) {
        String[] str = new String[3];

        str[0] = "flower";
        str[1] = "flow";
        str[2] = "flight";
        System.out.println(longestCommonPrefix(str));
        System.out.println();
        //System.out.println(str.toString());
        //System.out.println(str[2].substring(1));
    }
}