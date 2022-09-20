package com.wenjing.recursion;

/**
 * Base Case
 * Recursion Relation
 */
public class Recursion {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    /**
     * 1 + 2 + 3 ... + n
     */
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     * factorial(1) → 1
     * factorial(2) → 2 // 2*(2-1)  n*(n-1)
     * factorial(3) → 6 // 3*(3-1)
     * 4*(4-1) = 12
     */
    public static int count1(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * (num - 1);
        }
    }

    /**
     * sumDigits(126) → 9
     * sumDigits(49) → 13
     * sumDigits(12) → 3
     * <p>
     * 1111 -> 4
     * <p>
     * 10110 -> 3
     */

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    /**
     * count7(717) → 2
     * count7(7) → 1
     * count7(123) → 0
     */
    public int count7(int n) {
        if (n == 7) {
            return 1;
        } else if (n == 8 || n == 9 || n < 7) {
            return 0;
        } else {
            if (n % 10 == 8 || n % 10 == 9) {
                return 0 + count7(n / 10);
            } else {
                return n % 10 / 7 + count7(n / 10);
            }
        }
    }

    /**
     * count8(8) → 1
     * count8(818) → 2
     * count8(8818) → 4
     */
    public int count8(int n) {
        if (n == 8) {
            return 1;
        } else if (n == 9 || n < 8) {
            return 0;
        } else {
            if (n % 10 == 8 && n / 10 % 10 == 8) {
                return 2 + count8(n / 10);
            } else {
                if (n % 10 < 8 || n % 10 == 9) {
                    return 0 + count8(n / 10);
                } else {
                    return 1 + count8(n / 10);
                }
            }
        }
    }
}
