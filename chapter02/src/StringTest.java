/*
基本數據類型與String的運算

一、關於String的理解
	1. String類，屬於引用數據類型，俗稱字串。
	2. String類型的變量，可以使用一對""的方式進行賦值。
	3. Sring聲明的字串內部，可以包含0個、1個或多個字符。

二、String與基本數據類型變量間的運算
	1.這的基本數據類型是包含boolean在內的8種。
	2.String與基本數據類型變量間只能做連接運算，使用"+"表示。
	3.運算的結果只能是String類型
*/

class StringTest 
{
	public static void main(String[] args) 
	{
		String str1 = "Hello World";
		System.out.println(str1);

		String str2 = "";
		String str3 = "a"; //char c1 = 'a'; 沒有相同點

		//測試連接運算
		int num1 = 10;
		boolean b1 = true;
		String str4 = "hello";

		System.out.println(str4 + b1); //result: hellotrue

		String str5 = str4 + b1;
		String str6 = str4 + b1 + num1;

		System.out.println(str5); //result: hellotrue
		System.out.println(str6); //result: hellotrue10

		//String str7 = b1 + num1 + str4; 編譯不通過
		//等號右邊運算由左至右，若String沒有在最左邊，此時的"+"代表加法，而非連接。
		//如此時b1在最左邊，會是基於boolean去進行加法運算。

		//如何將String類型的變量轉換為基本數據類型?
		String str8 = "abc"; //不能考慮轉換為基本數據類型的。

		int num2 = 10;
		String str9 = num2+ ""; //"10"
		//int num3 = (int)str9; 編譯不拖過
		
		//如何實現呢?  使用Integer類
		int num3 = Integer.parseInt(str9);
		System.out.println(num3+1);


	}
}
