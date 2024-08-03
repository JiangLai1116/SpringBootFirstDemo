package com.example.springbootfirstdemo.se;

/**
 * 2024-8-3 10:44:56
 *如果接口只有一个抽象方法，它就是函数式接口(不加@FunctionalInterface注解也是)
 * Java Development Kit（JDK）推出函数式接口（Functional Interface）是为了更好地支持Java 8中引入的Lambda表达式。函数式接口有以下优点和用途：
 *
 * 简化代码：使用Lambda表达式可以简化代码，使代码更加简洁、易读。
 * 提高灵活性：Lambda表达式允许将行为作为参数传递，增强了编程的灵活性。
 * 支持函数式编程：函数式接口是实现函数式编程的基础，允许开发者使用更高级的函数式编程范式。
 * 配合Stream API：函数式接口可以与Java 8引入的Stream API很好地配合，实现数据处理的高效和简洁。
 */
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    // 1.接口中的方法默认都是abstract 2.接口中的方法不能带方法体(接口是用来定义规范的，方法的实现应该由实现类去实现具体逻辑)
    abstract int calculate(int a, int b);
}

/**
 * 在Java中，一个.java文件中只能有一个公开的（public）类或者接口(interface)，并且这个公开类或接口的名称必须与文件名相同。
 * 如果在同一个文件中定义了多个公开类或接口，编译器将会报错，因为Java编译器不允许一个源文件中有多个公开类/公开接口。
 */
 class Main {
    public static void main(String[] args) {
        // 使用Lambda表达式实现加法
        /**
         * 这里的(a, b) -> a + b是一个Lambda表达式，它实现了FunctionalInterface接口中的calculate方法。
         * add是一个FunctionalInterface类型的变量，它引用了Lambda表达式实现的接口实例
         */
        FunctionalInterface add = (a, b) -> a + b;
        System.out.println("10 + 5 = " + add.calculate(10, 5));

        // 使用Lambda表达式实现减法
        FunctionalInterface subtract = (a, b) -> a - b;
        System.out.println("10 - 5 = " + subtract.calculate(10, 5));

        //使用Lambda表达式实现乘法
        FunctionalInterface multiply = (a, b) -> a * b;
        System.out.println("10 * 5 = " + multiply.calculate(10, 5));

        // 使用Lambda表达式实现除法
        FunctionalInterface division = (a,b) -> a / b;
        System.out.println("10 / 5 = "+ division.calculate(10,5));
    }
}