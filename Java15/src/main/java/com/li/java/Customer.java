package com.li.java;

// record 不可声明为 abstract，不可显示继承于其他类
public record Customer(String name, Double balance) {
    // 还可以声明构造器、静态的变量、静态方法、实例方法

    public Customer(String name) {
        this(name, null);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("LiSisi", 100.00);
        System.out.println(customer.toString());

        System.out.println(customer.name()); // 类似于 getName()
        System.out.println(customer.balance()); // 类似于 getBalance()
    }

    // 不可以在 record 中声明 实例变量，但是可以声明静态变量
}
