/*
測試運算符的使用3: 比較運算符

1. ==	!=	>	<	>=	<=instanceof

2.說明
	> instanceof 在物件導向的多態性的位置講解
	> ==	!=	>	<	>=	<= 適用於基本數據類型(細節: >	<	>=	<=不適用於boolean類型)
	> 運算結果為boolean
	> 了解: ==	!=  可以適用於引用數據類型
	> 區分: =	與	==
*/

class CompareTest 
{
	public static void main(String[] args) 
	{
		int m1 = 10;
		int m2 = 20;
		boolean compare1 = m1> m2;
		System.out.println(compare1); //false
		//區別 "=" 與 "=="
		System.out.println(m1 == m2); //false
		System.out.println(m1 = m2);  //20
		
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1 == b2); //false
		System.out.println(b1 = b2); //true
	}
}
