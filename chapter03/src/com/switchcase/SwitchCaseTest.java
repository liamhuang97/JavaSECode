package com.switchcase;

/**
 * ClassName: SwitchCaseTest
 * Package: com.switchcase
 * Description: 分支結構 switch-case的使用 (選擇結構)
 *
 * @Author 黃弘熙
 * @Create 2023/7/19 下午 01:20
 * @Version 1.0
 */

/*
* 1. 語法格式
*
* switch(表達式){
*       case 常量 1:
*           //執行語句 1
*           //break;
*       case 常量 2:
*           //執行語句 2
*           //break;
*      ...
*      default:
*           //執行語句 n+1
*           //break;
* }
*
* 2. 執行過程:
* 根據表達式中的值，依次匹配case語句，一旦與某一個case中的常量相等，那麼就執行此case中的執行語句。
* 執行完此執行語句之後----
*       情況1>>
*           遇到break，則執行break後，跳出當前的switch-case結構
*       情況2>>
*           沒遇到break，則繼續執行其後其他的case中的執行語句 ----> case 穿透
*           ...
*           直到遇到break，或者執行完後面所有的case及default中的語句後，退出當前的switch-case結構
*
* 3. 說明:
*   1)  switch中的表達式只能是特定的數據類型。
*   如下: byte \ short \ char \ int \ 枚舉(JDK5.0新增) \ String(JDK7.0新增)
*   2) case後都是跟著常量，使用表達式與這些常量做相等的判斷，不能進行範圍的判斷。
* */
public class SwitchCaseTest {
    public static void main(String[] args) {

        int num = 1;
        switch(num){

            case 0:
                System.out.println("Zero");
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Other");
        } // result: One Two Three Other 未跳出當前switch-case結構

        //********************************************************

        switch(num) {

            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
                break;//default 加不加break都可以
        } //result: One  完成選擇後，break跳出當前switch-case結構

        //另例: Sting
        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花開");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高氣爽");
                break;
            case "winter":
                System.out.println("冬雪皚皚");
                break;
            default:
                System.out.println("季節輸入有誤");
                break;  //break防止穿透
        }

        /*錯誤的例子: 編譯不通過!
        int number = 20;
        switch(number){
            case number > 0: (此判斷式為布林值)
                System.out.println("正數");
                break;
            case number < 0:
                System.out.println("負數");
                break;
            default:
                System.out.println("零");
                break;
        }
         */
    }
}
