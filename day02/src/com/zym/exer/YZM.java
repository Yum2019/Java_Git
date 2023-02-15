package com.zym.exer;

import java.util.Random;

public class YZM {
        public static void main(String[] args) {
            for (int i = 0; i < 1; i++) {
                String s = verifyCode();
                System.out.println("随机验证码为：" + s);
            }
        }

        private static String verifyCode() {
            char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                    'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                    'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            Random random = new Random();
            String code = "";
            for (int i = 0; i < 6; i++) {
                //随机生成一个整数，值域 [0, arr.length)
                int index = random.nextInt(arr.length);
                code += arr[index];
            }
            return code;
        }
    }

