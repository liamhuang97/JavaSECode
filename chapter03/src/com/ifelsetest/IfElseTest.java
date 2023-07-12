package com.ifelsetest;/*
分支結構1: if-else條件判斷結構

1. 格式
	1) 格式一: 
		if(條件表達式){
			語句;
		}

	2) 格式二:  "二選一"
		if((條件表達式){
			語句1;
		}else{
			語句2;
		}
	
	3) 格式三:  "多選一"
		if((條件表達式1){
			語句1;
		}else if(條件表達式2){
			語句2;
		}else if{
		...
		}else if(條件表達式n){
			語句n;
		}else{
			語句n+1;
		}
*/

class IfElseTest 
{
	public static void main(String[] args) 
	{

		/*
		案例1: 成年人心律的正常範圍是每分鐘60-100次。
			   體檢時，如果心律不在此範圍內，則提示需要做進一步的檢查。
		*/

		int heartBeats = 60;
		//錯誤寫法 -- if(60 <= heartBeats <= 100)
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("您需要做進一步的檢查!");
		}else{
			System.out.println("體檢結束!");
		}

		//案例2: 定義一個整數，判斷是偶數還是奇數。

		int num1 = 365;
		if (num1 %2 == 0){
			System.out.println(num1 + " 是偶數");
		}else{
			System.out.println(num1 + " 是基數");
		}
	}
}
