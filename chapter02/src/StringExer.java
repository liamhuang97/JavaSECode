/*
要求填寫自己的姓名、年齡、性別、體重、婚姻狀況(已婚用true表示; 單身用false表示)、聯繫方式等等

*/

class StringExer 
{
	public static void main(String[] args) 
	{
		String name = "黃弘熙";
		int age = 26;
		char gender = '男';
		double weight = 69.9;
		boolean isMarried = false;
		String phoneNumber = "0978382592"; //電話不以數字類型接收，不讓其參與運算。

		String info = "name = " + name + ",age = " + age +
		",gender = " + gender + ",weight = " + weight + 
		",isMarried =" + isMarried + ",phoneNumber = " + 
		phoneNumber;

		//或是

		/*System.out.println("name = " + name + ",age = " + age +
		",gender = " + gender + ",weight = " + weight + 
		",isMarried =" + isMarried + ",phoneNumber = " + 
		phoneNumber);
		*/

		System.out.println(info);

	}
}
