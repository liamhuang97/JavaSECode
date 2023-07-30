package com.ifelse;
/*
測試if-else的嵌套使用

案例:
由鍵盤輸入三個整數分別存入變量num1、num2、num3，對他們進行排序(使用 if-else if-else)，並且從小到大輸出。

拓展，你能實現從大到小的排列嗎?

從開發經驗上來說，if-else 嵌套一般不會超過三層

如果在if-else結構中，執行語句只有一句，可以省略"{}"，但不建議省略，以免後續需要擴展程式碼時忘記補上"{}"。
*/

class IfElseTest2 
{
	public static void main(String[] args) 
	{
		int num1 = 30;
		int num2 = 10;
		int num3 = 60;
		
		if(num1 >= num2){
			if(num3 >= num1){
				System.out.println(num2 + "," + num1 + "," + num3);
			} else if (num3 <= num2) {
				System.out.println(num3 + "," + num2 + "," + num1);
			}else{
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		}else {//num1 < num2
			if(num1 >= num3) {
				System.out.println(num3 + "," + num1 + "," + num2);
			}else if(num2 <= num3){
				System.out.println(num1 + "," + num2 + "," + num3);
			} else{
				System.out.println(num1 + "," + num3 + "," + num2);
			}
		}

		//********************************
		boolean b = true;
		//如果寫成if(b=false)能編譯通過嗎？如果能，結果是？
		if(b == false) 	 //建議：if(!b)
			System.out.println("a");  //true != false，不執行此行
		else if(b)
			System.out.println("b");  // b = true，執行此行
		else if(!b)
			System.out.println("c");
		else
			System.out.println("d");
		//********************************
		if(b = false) 	 //建議：if(!b)
			System.out.println("a");  // b被賦值為false，故不執行此行
		else if(b)
			System.out.println("b");  // b被賦值為false，故不執行此行
		else if(!b)
			System.out.println("c");  //執行此行
		else
			System.out.println("d");

		//如果要判斷的變量是boolean，可以直接寫 if(b) --true 與 if(!b) --false
		//條件判斷的執行與否取決於判斷句的結果為true
	}
}
