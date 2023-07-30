package com.scanner;

import java.util.Scanner;

/**
 * ClassName: ScannerTest2
 * Package: com.scanner
 * Description:
 *
 * @Author 黃弘熙
 * @Create 2023/7/18 上午 09:40
 * @Version 1.0
 */
/*
* 解題----
* 大家都知道，男大當婚，女大當嫁。
* 那麼女方家長要嫁女兒，當然要提出一定的條件：高：180cm以上；富：財富1千萬以上；帥：是。
* 如果這三個條件同時滿足，則：“我一定要嫁給他!!!”
* 如果三個條件有為真的情況，則：“嫁吧，沒魚蝦也好。”
* 如果三個條件都不滿足，則：“絕對不嫁！!!打死都不!!!”
*
* 提示：
* System.out.println(“身高: (cm));
* scanner.nextInt();
*
* System.out.println(“財富: (千萬));
* scanner.nextDouble();
*
* System.out.println(“帥否: (true/false));
* scanner.nextBoolean();    方法1 -- boolean類型接收
*
* System.out.println(“帥否: (是/否));
* scanner.next();   "是".equals(str)  方法2 ---- String類型接收
* !! 不使用 isHandsome == "是" ，結果會出錯(判斷為false)。 !!
* !! 使用 == 是判斷兩者是否為同一個 ， 使用.equals(str)是判斷兩者"內容"是否一致。 !!
* */
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("請輸入身高: ");
        double height = scan.nextDouble();

        System.out.print("請輸入財富(單位-百萬): ");
        double wealth = scan.nextDouble();

        /*
        方法1: boolean類型接收
        System.out.print("是否長得帥(是/否): ");
        boolean isHandsome = scan.nextBoolean();
        */

        //方法2: String類型接收
        System.out.print("是否長得帥(是/否): ");
        String isHandsome2 = scan.next();

        if (height >= 180 && wealth >= 10.0 && isHandsome2.equals("是")){
            System.out.println("我一定要嫁給他!!!");
        }else if (height >= 180 || wealth >= 10.0 || isHandsome2.equals("是")){
            System.out.println("嫁吧，沒魚蝦也好。");
        }else{
            System.out.println("絕對不嫁！!!打死都不!!!");
        }

    }
}
