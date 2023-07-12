/*
總結:

1. Java 程式編寫和執行的過程:
步驟1: 編寫。將Java程式碼編寫在.java結尾的"源文件"中。     
步驟2: 編譯。針對於.java結尾的源文件進行編譯。 格式: javac 源文件名.java
步驟3: 運行。針對於編譯後生成的位元組碼文件(.class)，進行解釋運行。  格式: java 位元組碼文件名



2.針對於步驟1的編寫進行說明。

	class HelloTaiwan {
		public static void main(String[] args){
			System.out.println("Hello World! 你好台灣!");
		}
	}

	(1)其中class是一個關鍵字，表示"類"，後面跟著"類名"。
	(2)main()方法格式是固定的，務必記住!
		public static void main(String[] args) {}

		如果非要變化只能變化String[] args的結構 可以寫成String args[] 或 String[] 。

	(3)Java程式語言，是"嚴格區分大小寫"的

	(4)從控制台輸出數據的操作:
		System.out.print();    輸出數據後，"不會換行"。
		System.out.println();    輸出數據後，"會換行"。
	
		每一行執行語句須以;結尾。


3.針對步驟2的編譯進行說明。

	(1)如果編譯不通過，可以考慮的問題:
	問題1: 查看編譯文件名、文件路徑是否書寫錯誤。
	問題2: 查看代碼中是否存在語法問題。如果存在，就可能導致編譯不通過。

	(2)編譯以後，會生成1個或多個位元組碼文件(.class)。每一個位元組碼文件對應一個Java類，並且位元組碼文件與類名相同。


4.針對步驟3的運行進行說明。

	(1)我們是針對位元組文件對應的Java類進行解釋運行的。 要注意區分大小寫。

	(2)如果運行不通過，可以考慮的問題:
	問題1: 查看解釋運行的類名、文件路徑是否書寫錯誤。
	問題2: 可能存在運行時的異常。(放到第9章中具體講解)


5.一個源文件中可以聲明多個類，但是最多只能有一個類使用public進行聲明。
且要求聲明為public的類的類名與源文件相同。


public class HelloJava{
	public static void main(String[] args){
			System.out.println("Hello");
	}
}

class HelloTaipei{
}

class HelloTaiChung{
}

 */