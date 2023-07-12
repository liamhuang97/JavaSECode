/*
測試字符類型與布林類型的使用

*/

class VariableTest2 
{
	public static void main(String[] args) 
	{
	//1.字符類型: char(2個位元組)

		//表示形式1: 使用一對''表示，內部"有"且"僅有一個字符"。
		char c1 = 'a';
		char c2 = '台';
		char c3 = '1';
		char c4 = '%';
		char c5 = 'γ';

		//編譯不通過
		//char c6 = '';
		//char c = 'ab';

		//表示形式2: 直接使用Unicode值來表示字符常量。
		char c8 = '\u0036'; //十六進制中對應字符6
		System.out.println(c8);

		//表示形式3: 使用轉義字符
		char c9 = '\n';
		char c10 = '\t';
		System.out.println("hello" + c9 + "world");

		//表示形式4: 使用具體字符對應的數值 (比如ASCII碼)
		char c11 = 97;
		System.out.print(c11); //result: a  (ASCII碼的字符集) a > 97 ; A > 65 ; 0 > 48

		char c12 = '1';
		char c13 = 1; //兩者對應不同

	//2.布林類型: boolean
		//(1)只有兩個取值: true、false

		boolean bo1 = true;
		boolean bo2 = false;

		//編譯不通過
		//boolean bo3 = 0;

		//(2)常使用在流程控制語句中，比如: 條件判斷、循環結構。
		boolean isMarried = true;

		if(isMarried)
		{
			System.out.println("很遺憾不能參加單身派對了!"); //true分支 (1)
		}
		else
		{
			System.out.println("可以多談幾個女朋友了"); //false分支 (0)
		}

		//(3)了解: 我們不談布林類型占用的內存空間大小。
		//但是，真正在內存中分配的話，使用的是4個位元組(等同int 0 , 1)。

	}
}
