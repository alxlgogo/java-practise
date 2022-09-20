package com.wenjing.recursion;

/**
 * Base Case
 * Recursion Relation
 */
public class Recursion {
    public static void main(String[] args) {

        String s = "x";
//        System.out.println(s.substring(s.length() - 1, s.length()));
        System.out.println(s.substring(0, 0));
        System.out.println(s.substring(0, 1));
        System.out.println(s.substring(0, 0).equals(""));


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


    /**
     * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
     * powerN(3, 1) → 3
     * powerN(3, 2) → 9
     * powerN(3, 3) → 27
     * base * powerN(base, n - 1)
     */
    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            return base * powerN(base, n - 1);
        }
    }


    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     * <p>
     * 1. length()
     * 2. str.substring(str.length() - 1, str.length())
     * 3. subString(0,0) return "" , subString(0,1) return "x"
     */
    public int countX(String str) {
        if (str.length() == 0 || str.length() == 1 && !str.equals("x")) {
            return 0;
        } else {
            if (str.substring(str.length() - 1, str.length()).equals("x")) {
                return 1 + countX(str.substring(0, str.length() - 1));
            } else {
                return 0 + countX(str.substring(0, str.length() - 1));
            }
        }
    }


    /**
     * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
     * countHi("xxhixx") → 1
     * countHi("xhixhix") → 2
     * countHi("hi") → 1
     */
    public int countHi(String str) {
        if (str.length() < 2 || str.length() == 2 && !str.equals("hi")) {
            return 0;
        } else {
            if (str.substring(str.length() - 2, str.length()).equals("hi")) {
                return 1 + countHi(str.substring(0, str.length() - 2));
            } else {
                return 0 + countHi(str.substring(0, str.length() - 1));
            }
        }
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
     * changeXY(" codex ") → "codey"
     * changeXY("xxhixx") → "yyhiyy"
     * changeXY("xhixhix") → "yhiyhiy"
     */
//    public String changeXY(String str) {
//
//    }

}
