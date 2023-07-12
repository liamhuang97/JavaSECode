/*
測試變量的基本使用

1. -內存中的一個存儲區域，該區域的數據可以在同一類型範圍內不斷變化

2. -變量的構成包含三個要素: 數據類型、變量名、存儲的值

3. -Java中變量聲明的格式: 數據類型 變量名 = 變量值

4. -Java中的變量按照數據類型來分類:
	>基本數據類型(8種):
		整型: byte \ short \ int \ long
		浮點: float \ double
		字符型: char
		布林型: boolean

	>引用數據類型:
		類(class)
		數組(array)
		接口(interface)

		枚舉(enum)
		註解(annotation)
		紀錄(record)

5.定義變量時，變量名要遵守標識符命名的規則與規範。

6.說明: 
	(1)變量都有其作用域。變量只在作用域內有效，出了作用域就失效了。
	(2)在同一個作用域中，不能聲明同名的變量
	(3)定義好變量以後，就可以通過變量名的方式，對變量進行調用或運算。
	(4)變量值在賦值時，必須滿足變量的數據類型，並且在數據類型有效的範圍內變化。

*/

class VariableTest 
{
	public static void main(String[] args) 
	{   //包裹變量最近的大括號為變量的作用域

		//方式1
		int age = 10;  //定義變量的方式: 聲明與初始化合併

		//方式2
		char gender;   //變量的聲明

		gender = '男'; //變量的賦值(或初始化)

		gender = '女'; //第二次賦值不是初始化

		System.out.println(age);

		System.out.println("age=" + age); //+此處為連接符

		//char gender = '女';

		gender = '男'; //沒有數據類型等於只是重新賦值，可以編譯通過。

		//由於number前沒有聲明數據類型，即當前number沒有提前定義，所以編譯不通過。
		//number = 10;

		byte b1 = 127;

		//b1超出了變量數據類型的範圍
		//b1 = 128;
	}

	public static void main123(String[] args)
		{

		char gender = '女';

		System.out.println("gender=" + gender);
		}
}
