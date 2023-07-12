/*
測試運算符的使用4: 邏輯運算符

1.  &	&&	|	||	!(非)	^(異)
2.	說明
	>邏輯運算符針對的都是boolean類型的變量進行操作
	>邏輯運算符運算的結果也是boolean類型
	>邏輯運算符常使用在條件判斷結構、循環結構中

*/

class LogicTest 
{
	public static void main(String[] args) 
	{

		/*
		區分: &	&&
		
		1.相通點:	表達的都是"且"的關係，只有當符號左右兩邊的類型值均為true時，結果才為true。
		
		2.執行過程差異:  
			1) 如果符號左邊是true，則 &	&& 都會執行符號右邊的操作
			2) 如果符號左邊是false，則 & 會執行符號右邊的操作，而 && 不會執行符號右邊的操作

		3. 開發中，我們推薦使用 &&
		*/

		//練習1
		//當 && 符號左邊條件為false 則不執行符號右邊的操作，跳過後繼續執行條件判斷

		boolean b1 = true;
		b1 = false; //改成false測試
		int num1 = 10;

		if(b1 & (num1++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德剛");
		}
		System.out.println("num1 = "+ num1); 

		//***

		boolean b2 = true;
		b2 = false; //改成false測試
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德剛");
		}
		System.out.println("num2 = "+ num2); 

		//***************************************************************
		/*
		區分: |	和  ||
		
		1.相通點:	表達的都是"或"的關係，只要符號兩邊存在true的情況時，結果就為true。
		
		2.執行過程差異:  
			1) 如果符號左邊是false，則 |	||  都會執行符號右邊的操作
			2) 如果符號左邊是true，則 | 會繼續執行符號右邊的操作，而 || 不會執行符號右邊的操作

		3. 開發中，我們推薦使用 ||
		*/

		//練習2
		boolean b3 = false;
		b3 = true; //改成true測試
		int num3 = 10;

		if(b3 | (num3++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德剛");
		}
		System.out.println("num3 = "+ num3); 

		//***

		boolean b4 = false;
		b4 = true; //改成true測試
		int num4 = 10;
		if(b4 || (num4++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德剛");
		}
		System.out.println("num4 = "+ num4);
	}
}
