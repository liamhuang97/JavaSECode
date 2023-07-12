/*
1. 定義類 LogicExer
2. 定義 main方法
3. 定義一個int類型變量a,變量b,都賦值為20
4. 定義boolean類型變量bo1 , 判斷++a 是否被3整除,並且a++ 是否被7整除,將結果賦值給bo1
5. 輸出a的值,bo1的值
6. 定義boolean類型變量bo2 , 判斷b++ 是否被3整除,並且++b 是否被7整除,將結果賦值給bo2
7. 輸出b的值,bo2的值
*/

class LogicExer 
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 20;
		boolean bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
			System.out.println("a = " + a + ",bo1 = " + bo1);
		boolean bo2 = (b++ % 3 == 0) && (++b % 7 == 0);
			System.out.println("b = " + b + ",bo2 = " + bo2);

		//陷阱題解析:

		boolean x = true;
        boolean y = false;
        short z = 42;
        
        if ((z++ == 42) && (y = true)) {    //注意(y = true)是賦值，不是" == "，所以 y 是 true。 z = 43
            z++;  //z = 44
        }
        if ((x = false) || (++z == 45)) {   //z = 45  ，true。
            z++;  //z = 46
        }

        System.out.println("z=" + z);  //result: z = 46 
	
	}
}

