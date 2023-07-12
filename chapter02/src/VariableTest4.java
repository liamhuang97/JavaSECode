/*
測試強制類型轉換

規則: 
1. 如果要將容量大的變量轉換為容量小的類型，需要使用強制類型轉換。
2. 強制類型轉換需要使用強轉符: ()，並在()內指名要轉換的目標數據類型。

byte 、 short 、 char <--- int <--- long <--- float <--- double

3. 強制類型轉換的大轉小的過程，可能會出現精度流失的問題。
*/

class VariableTest4 
{
	public static void main(String[] args) 
	{
		double d1 = 12 ;//自動類型提升

		//編譯失敗
		//int i1 = d1;
		
		int i2 = (int)d1;
		System.out.println(i2);

		long l1 = 123;
		//編譯失敗
		//short s1 = l1;
		short s2 = (short)l1;
		
		System.out.println(s2);

		//練習
		int i3 = 12;
		float f2 = i3; //自動類型提升
		System.out.println(f2); //result: 12.0

		float f3 = (float)i3; //編譯可以通過，只不過()可以省略而已。

		//精度損失案例1:
		double d2 = 12.9;
		int i4 = (int)d2;
		System.out.println(i4); //result: 12   後面0.9損失了

		//精度損失案例2:
		int i5 = 128;
		byte b1 = (byte)i5;  //語法上沒有問題，編譯通過
		System.out.println(b1);  //result: -128  十進制高位被截斷，變為1開頭，所以呈現負數。

		//實際開發舉例:
		byte b2 = 12;
		method(b2);  //自動類型提升

		long l2 = 12L;
		//編譯不通過
		//method(l2);
		method((int)l2); //強制類型轉換
	} 
	public static void method(int num)  //int num = b2  自動類型提升
	{
		System.out.println("num = " + num);
	}
}
