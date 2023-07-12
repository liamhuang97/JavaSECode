/*
案例1: 定義圓周率並賦值為3.14，現在3個圓的半徑分別為1.2、2.5、6，求它們的面積。
*/

class FloatDoubleExer 
{
	public static void main(String[] args) 
	{
		//定義圓周率變量
		double pi = 3.14;

		//定義三個圓的半徑
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;

		//初始化面積
		double area1 = pi * radius1 * radius1;
		double area2 = pi * radius2 * radius2;
		double area3 = pi * radius3 * radius3;  //問:為何調整pi在算式中的位置前後會影響運行結果
		
		//輸出
		System.out.println("圓1的半徑為:" + radius1 + "面積為:" + area1);
		System.out.println("圓2的半徑為:" + radius2 + "面積為:" + area2);
		System.out.println("圓3的半徑為:" + radius3 + "面積為:" + area3);
	}
}
