/*
繦種倒计俱计ゴ陪ボウ计计κ计
Α
计xxx薄猵
计
计
κ计

*/

class AriExer 
{
	public static void main(String[] args) 
	{
		//倒俱计
		int num = 864;

		//κ计
		int num100 = num / 100;
		
		//计
		int num10 = num % 800 / 10;

		//ゴ陪ボ计
		int num1 = num % 10;
		

		
		
		 
		//ゴκ计
		System.out.println("计: " + num1);
		System.out.println("计: " + num10);
		System.out.println("κ计: " + num100);


		//肂絤策1:
		System.out.println("5+5="+5+5); //result: "5+5=55"
		System.out.println("5+5="+(5+5)); //result: 10   ()ず笲衡

		//肂絤策2:
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);
		//++┪++ぃ穦э跑跑秖计沮摸result: -128

		//肂絤策3:
		//int i = 1;
		//int j = i++ + ++i * i++;   
		//埃笲衡纔蔼搭笲衡(衡计笲衡才)
		//衡砃笲衡才纔蔼结笲衡才(=)珿iぃ穦钡结倒jτ琌秈︽笲衡

		//System.out.println("j = " + j); //j = 1+3*3  result j=10  i=4

		//肂絤策4:
		int i = 2;
		int j = i++;
		System.out.println("j: " + j); //result: j = 2

		int m = 2;
		m = m++;  //结患糤 τ跑秖嘿m砆结m
		//尿++笆パmj=3暗笲衡单Ω结

		//э m = ++m; ┪э m++; 挡狦穦琌m = 3
		System.out.println(m); //result: m = 2 
	}
}
