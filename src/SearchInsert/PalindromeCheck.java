package SearchInsert;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = " hello909       world,  ";
        System.out.println(stringBuffer(str));
    }

    public static String stringBuffer(String str) {
        str= str.trim();
        String[] split = str.split("\\W+");
        // print using for-each
        for (String s : split) {
            System.out.println(s);
        }
//        StringBuilder strBuf = new StringBuilder(str);
//        strBuf.r
//        for (int i = 0; i < strBuf.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                strBuf = strBuf.delete(i,i+1);
//            }
//        }
//        return strBuf.toString();
        return null;
    }

}
