/*
測試標識符的使用

1.什麼是標識符? Java中變量、方法、類等要素命名時使用的字符序列，稱為標識符。

	技巧: 凡是我們可以自己命名的都是標識符。比如: 類名、方法名、變量名、包名、常量名等。

2.標識符的命名規則:  (必須要遵守!! 否則，編譯不通過!)

	>由26個英文字母大小寫、0-9、 _ 或 $ 組成。
	>數字不可以開頭。
	>不能使用關鍵字和保留字，但可以包含。
	>Java中嚴格區分大小寫，無長度限制。
	>標識符不能包含空格。

3.標識符軟性的命名規範:    (建議遵守! 不遵守是可以運行，但不符合大家默認的規範)

	>包名: 多單詞組成時，所有字母都小寫。 ex: xxyyyyzzz
	例如-- java.lang , com.atguigu.bean

	>類名、接口名: 多單詞組成時，所有單詞的字首大寫。 ex: XxxYyZzzz
	例如-- HelloWorld , String , System         

	>變量名、方法名: 多單詞組成時，第一個單詞字首小寫，第二個單詞開始字首大寫。 ex:xxxYyZzzz
	例如-- age , name , userName , main , binarySearch , getName , setName

	>常量名: 所有字母都大寫。多單詞時每個單詞之間用底線連接。 ex: XXX_YYY_ZZZ
	例如-- MAX_VALUE , PI , DEFAULT_CAPACITY


說明: 在定義標識符時，要注意"見名知意"。
*/
class IdentifierTest
{
	public static void main(String[] args)
	{
		int age = 12; //age:標識符

		char gender = '男';

		//可以運行但不推薦的寫法，未依照業界默認的規範
		//int myage = 12;
		//System.out.println(myage);

		//正確寫法
		int myAge = 15;
		System.out.println(myAge);


	}
}