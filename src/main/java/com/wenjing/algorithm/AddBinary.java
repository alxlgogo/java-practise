package com.wenjing.algorithm;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "11";
        String addBinary = addBinary(a, b);
        System.out.println(addBinary);

    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;  // 从字符串a的最后一位开始
        int j = b.length() - 1;  // 从字符串b的最后一位开始
        int carry = 0;           // 进位

        // 从后往前遍历字符串，直到两个字符串都遍历完
        while (i >= 0 || j >= 0) {
            int sum = carry;  // 每次相加的初始值是上一次的进位
            if (i >= 0) {
                sum += a.charAt(i--) - '0';  // 将字符转换为整数
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';  // 将字符转换为整数
            }

            // 计算当前位的值（sum % 2）并插入到结果字符串中
            result.append(sum % 2);

            // 更新进位值（sum / 2）
            carry = sum / 2;
        }

        // 如果循环结束后仍有进位，则将进位加到结果中
        if (carry != 0) {
            result.append(carry);
        }

        // 由于结果是从低位到高位依次加入的，因此需要反转字符串
        return result.reverse().toString();
    }
}
