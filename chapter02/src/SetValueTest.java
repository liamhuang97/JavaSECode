/*
測試運算符的使用2: 賦值運算符

1. =、+=、 -=、*=、 /=、%=
此類寫法得到結果不會改變變量本身的數據類型，不必做強制類型轉換

2.說明:
	>當"="兩側數據類型不一致時，可以使用自動類型提升或使用強制類型轉換原則進行處理。

*/

class SetValueTest 
{
	public static void main(String[] args) 
	{
		int i= 5;

		long l = 10; //自動類型提升

		byte b = (byte)i; //強制類型轉換

		//操作方式1:
		int a1 = 10;
		int b1 = 10;

		//操作方式2: 連續賦值
		int a2;
		int b2;
		//或合併: int a2,b2;
		a2 = b2 = 10;

		System.out.println(a2 + "," + b2);

		//操作方式3: 更常見方式
		//int a3 = 10;
		//int b3 = 20;

		int a3 = 10,b3 = 20;
		System.out.println(a3 + "," + b3);

		//**************************************************
		//說明 += 的使用
		int m1 = 10;
		m1 += 5; //類似於m1 = m1 + 5; result: 15
		System.out.println("m1 = " + m1);
		
		//區別
		byte by1 = 10;
		by1 += 5; //編譯通過 ，此寫法得到結果不會改變變量本身的數據類型
		//by1 = by1 + 5; 此操作或編譯報錯 //by1 = (byte)(by1 + 5);正確寫法 
		System.out.println("by1 = " + by1);

		//練習1: 如何實現變量的值增加2

		int n1 = 10;
		n1 += 2; 

		//練習2: 如何實現變量的值增加1
		int n2 = 10;
		n2 += 1; 
		//或 
		int n3 = 10;
		n3++; 

		//練習3:
		int i1 = 1;
		i1 *= 0.1;
		System.out.println(i1);//result: 0   int = 0.1截斷為0
		i++;
		System.out.println(i1);//result: 1

		//練習4:
		int m = 2;
		int n = 3;
		n *= m++; 	//n = n * m++;  n = 3*2  m++ = 2+1
		System.out.println("m=" + m);  //result: 3
		System.out.println("n=" + n);  //result: 6

	
	}
}
