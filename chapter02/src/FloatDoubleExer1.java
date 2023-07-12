/*
案例2: 小明要到美國旅遊，可是那裡的溫度是以華氏度為單位記錄的。
它需要一個程序將華氏溫度（80度）轉換為攝氏度，並以華氏度和攝氏度為單位分別顯示該溫度。

公式:
℃ = (℉ - 32) / 1.8

*/

class FloatDoubleExer1 
{
	public static void main(String[] args) 
	{
		//定義華氏溫度的變量
		double f = 80.0;

		//定義攝氏溫度並加入算式
		double c = (f - 32) / 1.8; 

		System.out.println("華氏溫度" + f + " ℉" + " 對應攝氏溫度為:" + c + " ℃");
	}
}
