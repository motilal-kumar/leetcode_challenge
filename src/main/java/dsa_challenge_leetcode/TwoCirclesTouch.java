package dsa_challenge_leetcode;

public class TwoCirclesTouch {



    public static void main(String[] args)
    {
        int a1 = -10, b1 = 8;
        int a2 = 14, b2 = -24;
        int r1 = 30, r2 = 10;

        checkTwoCirclesTouchEachOtherOrNot(a1, b1, a2, b2, r1, r2);
    }

   public  static void checkTwoCirclesTouchEachOtherOrNot(int a1, int b1, int a2, int b2,
                       int r1, int r2)
    {
        double d = Math.sqrt((a1 - a2) * (a1 - a2)
                + (b1 - b2) * (b1 - b2));

        if (d <= r1 - r2) {
            System.out.println("Circle B is inside A");
        }
        else if (d <= r2 - r1) {
            System.out.println("Circle A is inside B");
        }
        else if (d < r1 + r2) {
            System.out.println("Circle intersect"
                    + " to each other");
        }
        else if (d == r1 + r2) {
            System.out.println("Circle touch to"
                    + " each other");
        }
        else {
            System.out.println("Circle not touch"
                    + " to each other");
        }
    }

}
