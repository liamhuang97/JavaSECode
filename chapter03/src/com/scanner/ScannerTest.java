package com.scanner;

import java.util.Scanner;

/**
 * ClassName: ScannerTest
 * Package: com.scanner
 * Description:
 *
 * @Author 黃弘熙
 * @Create 2023/7/18 上午 08:58
 * @Version 1.0
 */

/*
* 如何從鍵盤獲取不同類型(基本數據類型、String類型)的變量: 使用Scanner類
*
* 1. 使用Scanner獲取不同類型的步驟
* 步驟1: 導包 import java.util.Scanner
* 步驟2: 提供(或創建)一個Scanner類的實例
* 步驟3: 調用Scanner類中的方法，獲取指定類型的變量
* 步驟4: 關閉資源，調用Scanner類的close()
*
* 2. 案例: 小明註冊某交友網站，要求錄入個人相關信息。如下：
*
* 請輸入你的網名、你的年齡、你的體重、你是否單身、你的性別等情況。
*
* 3. Scanner類中提供了獲取 byte / short / int / long / float / double / boolean / String
*    類型變量的方法。
*    注意: 沒有提供獲取 char 類型變量的方法，需要使用 next().charAt(0) 獲取字串中的第一個字符。
* */

public class ScannerTest {
    public static void main(String[] args) {

        //步驟2: 提供(或創建)一個Scanner類的實例
        Scanner scan = new Scanner(System.in);

        System.out.println("歡迎來到你來我往交友網!");

        System.out.print("請輸入你的網名: ");
        //步驟3: 調用Scanner類中的方法，獲取指定類型的變量
        String name = scan.next();

        System.out.print("請輸入你的年齡: ");
        int age = scan.nextInt();
        System.out.print("請輸入你的體重: ");
        double weight = scan.nextDouble();
        System.out.print("是否為單身(單身-true，非單身-false): ");
        boolean isSingle = scan.nextBoolean();
        System.out.print("請輸入你的性別(男 / 女): ");
        char gender = scan.next().charAt(0);


        System.out.println("網名 = " + name);
        System.out.println("年齡 = " + age);
        System.out.println("體重 = " + weight);
        System.out.println("是否單身 = " + isSingle);
        System.out.println("性別 = " + gender);

        System.out.println("註冊完成，歡迎!");

        //步驟4: 關閉資源，調用Scanner類的close()
        scan.close();
    }
}
