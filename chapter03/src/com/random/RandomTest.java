package com.random;

/**
 * ClassName: RandomTest
 * Package: com.random
 * Description: 如何獲取一個隨機數
 *
 * @Author 黃弘熙
 * @Create 2023/7/19 下午 12:57
 * @Version 1.0
 */

/*
* 1.可以使用Java提供的 API: Math類 的 random()方法
*
* 2.random()調用以後，會返回一個[0.0,1.0)範圍的double類型的隨機變數
*
* 3.如何獲取一個[0,100]範圍的隨機整數?
*   如何獲取一個[0,100]範圍的隨機整數?
*
* 4.需求: 獲取一個[a,b]範圍的隨機整數?
*   (int)(Math.random() * (b - a + 1)) + a;
* */
public class RandomTest {
    public static void main(String[] args) {

        double d1 = Math.random();

        System.out.println("d1 = " + d1);

        int num1 = (int)(Math.random() * 100);
        //[0.0,1.0) --> [0.0,101.0) -->[0,100]
        System.out.println("num1 = " + num1);

        int num2 = (int)(Math.random() * 99) + 1;
        //[0.0,1.0) --> [0.0,101.0) --> [0,99] --> [1,100]
        System.out.println("num2 = " + num2);
    }
}
