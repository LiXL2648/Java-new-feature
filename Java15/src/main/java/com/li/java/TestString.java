package com.li.java;

public class TestString {

    public static void main(String[] args) {
        String text1 = "hello\n" +
                "world";
        System.out.println(text1);
        System.out.println(text1.length());

        // \表示取消换行，\s 表示空格
        String text2 = """
                hello\s\
                world\
                """;
        System.out.println(text2);
        System.out.println(text2.length());
    }
}
