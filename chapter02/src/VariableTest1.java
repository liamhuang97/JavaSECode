/*
測試整型和浮點型變量的使用

*/

class VariableTest1 
{
	public static void main(String[] args) 
	{
	//1.測試整型變量的使用
		//byte(1個位元組=8bit) \ short(2個位元組) \ int(4個位元組) \ long(8個位元組)

		byte b1 = 12;
		byte b2 = 127;

		//編譯不通過，因為超出了byte的存儲範圍
		//byte b3 = 128;

		short s1 = 1234;

		int i1 = 123234123;

		//(1)聲明long類型變量時，需要提供後綴，後綴為'l'或'L'。
		long l1 = 123123123L;

		//(2)開發中，大家定義整型變量時，沒有特殊情況的話，通常都聲明為int類型。


	//2.測試浮點類型變量的使用
		//float(單精度) \ double(雙精度)
		double d1 = 12.3;
		//(1)聲明float類型變量時，需要提供後綴，後綴為'f'或'F'。
		float f1=12.3f;

		//(2)開發中，大家定義浮點型變量時，沒有特殊情況的話，通常都聲明為double類型，因為精度更高。

		//(3)float類型表數範圍要大於long類型的表數範圍。但是其精度不高。

	//測試浮點型變量的精度
		//測試1----
		System.out.println(0.1+0.2); //實際為0.3，但運行結果卻為0.30000000000000004

		//測試2----
		
		float ff1 = 123123123f;
		float ff2 = ff1 + 1;
		System.out.println(ff1);
		System.out.println(ff2);
		System.out.println(ff1 == ff2); // == 判斷兩個變量是否相等
		//結論: 理論上不相等，但因為精度不高，所以判斷為true(相等)

		//故浮點類型float、double的數據不適合在不容許捨入誤差的金融計算領域。
		//如果需要精確的數字計算或保留指定位數的精度，需要使用BigDecimal類。
	}
}
