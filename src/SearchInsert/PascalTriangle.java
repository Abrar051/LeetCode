package SearchInsert;

import java.util.*;

public class PascalTriangle {

    public static int factorial(int n) {
        if (n == 1 || n==0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int ncr(int n, int r) {
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        return ncr;
    }

    public List<List<Integer>> generate(int numRows) {
        List<Integer> sublist = new ArrayList<>();
        List<List<Integer>> listOfList = new ArrayList<>();
        int i,j;
        for (i = 0; i <= numRows; i++) {
            for (j = 0; j <= i; j++) {
                //System.out.print(" "+ ncr(i, j));
                sublist.add(ncr(i,j));
            }
            listOfList.add(sublist);
        }
        List<List<Integer>> res = new ArrayList<>();

        for(int line=1;line<=numRows;line++){
            int c = 1;
            ArrayList<Integer> ans = new ArrayList<>();
            for( i =1;i<=line;i++){
                ans.add(c);
                c = c*(line-i)/i;
            }
            res.add(ans);
        }
        return listOfList;
    }

    public static void printPascal (int n)
    {
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" "+ ncr(i, j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello");
        System.out.println(factorial(5));
        System.out.println(ncr(5, 2));
        printPascal(6);

        System.out.println(str.reverse());
    }
}
