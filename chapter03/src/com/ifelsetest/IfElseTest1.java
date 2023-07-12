package com.ifelsetest;/*
案例3:
岳小鵬參加Java考試，他和父親岳不群達成承諾：
如果：
成績為100分時，獎勵一輛跑車；
成績為[80，99]時，獎勵一輛山地自行車；
當成績為[60,79]時，獎勵環球影城一日遊；
其它時，胖揍一頓。

1. 說明：默認成績是在[0,100]範圍內

2. 注意:
	>當條件表達式之間是“`互斥`”關係時（即彼此沒有交集），條件判斷語句及執行語句間順序無所謂。

	>當條件表達式之間是“`包含`”關係時，“`小上大下 / 子上父下`”，否則範圍小的條件表達式將不可能被執行。
*/

class IfElseTest1 
{
	public static void main(String[] args) 
	{
		int score = 59;

		//寫法一：默認成績範圍為[0,100]，區間互斥，可以將兩個else if位置對調
        if(score == 100){
            System.out.println("成績滿分!恭喜獲得一輛跑車!");
        }else if(score > 80 && score <= 99){    //錯誤的寫法：}else if(80 < score <= 99){
            System.out.println("獎勵一輛山地自行車");
        }else if(score >= 60 && score <= 80){
            System.out.println("獎勵環球影城玩一日遊");
        }else{
        	System.out.println("胖揍一頓");
        }
		//寫法二：
        // 默認成績範圍為[0,100]，區間交集，位置順序不能對調
		
		score = 100;

		if (score == 100){
			System.out.println("成績滿分!恭喜獲得一輛跑車!");
		}else if(score >= 80){
			System.out.println("獎勵一輛山地自行車!");
		}else if(score >= 60){
			System.out.println("獎勵環球影城一日遊!");
		}else{
			System.out.println("欠揍!");   //如果else情況發生時不做操作，其實允許留白
		}
	}
}
