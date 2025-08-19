package Challenges;

public class Ex_65 {

    public int mySqrt(int x) {
        if (x == 0) return 0;

        int left = 1, right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            }
            else if (mid > x / mid) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Ex_65 solution = new Ex_65();

        int x1 = 8;
        int x2 = 16;
        int x3 = 1;
        int x4 = 0;

        System.out.println("Square root of " + x1 + " = " + solution.mySqrt(x1));
        System.out.println("Square root of " + x2 + " = " + solution.mySqrt(x2));
        System.out.println("Square root of " + x3 + " = " + solution.mySqrt(x3));
        System.out.println("Square root of " + x4 + " = " + solution.mySqrt(x4));
    }

}
