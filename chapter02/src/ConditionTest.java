/*
測試運算符的使用6: 條件運算符

1. (條件表達式)? 表達式1 : 表達式2;

2. 說明:
	1) 條件表達式的結果是boolean類型。
	2) 如果條件表達式的結果是true，則執行 表達式1。否則，執行 表達式2。
	3) 表達式1 和 表達式2 需要式相同類型或能兼容的類型。

3. 結論:
	>凡是可以使用條件運算符的位置，都可以改寫為if-else。
	>反之，使用if-else結構，不一定能改寫為條件運算符。因為if-else結構上可以非常複雜。
	>但若在兩者都能使用(結構簡單)的情況下，推薦使用條件運算符，因為執行效率稍高於if-else。

*/

class ConditionTest 
{
	public static void main(String[] args)
	{

		String info = (2 > 10)? "表達式1" : "表達式2";
		System.out.println(info);  //result: 表達式2

		double result = (2 > 1)? 1 : 2.0;
		System.out.println(result);  //result: 1.0
		
		//練習1 -- 獲取兩數的較大值
		int num1 = 10;
		int num2 = 20;
		int max = (num1>num2)? num1 : num2;
		System.out.println("較大值為: " + max); //result: 較大值為: 20


		//練習2

		int week = 2;

		week += 10;

		week %= 7;

		//如果week %= 7; 為0，則為週日。
		System.out.println("今天是週二，十天後是週" + ((week == 0)? "日" : week)); //這裡沒有定義變量
		//result: 今天是週二，十天後是週5
	}
}
