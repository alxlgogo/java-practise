package com.wenjing.algorithm;

public class FrogJmp {
    public static void main(String[] args) {
        int solution = solution(10, 85, 30);
        System.out.println(solution);
    }

    public static int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }

        int left = (Y - X) % D;
        int jumps = (Y - X) / D;
        if (left > 0) {
            jumps = jumps + 1;
        }

        return jumps;
    }
}
