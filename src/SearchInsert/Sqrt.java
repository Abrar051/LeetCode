package SearchInsert;

public class Sqrt {
    public static int mySqrt(int x) {
        int counter = 1;
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else if (x < 0) {
            return 0;
        } else {
            int firstPoint = counter, lastPoint = x, midPoint;
            while (x / firstPoint >= firstPoint) {
                if (x / firstPoint == firstPoint) {
                    break;
                } else {
                    midPoint = (firstPoint + lastPoint) / 2;
                    lastPoint = midPoint;
                    firstPoint++;
                }
            }
            return x/firstPoint;
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(18));
        System.out.println(mySqrt(50));
    }
}
