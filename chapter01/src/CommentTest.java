/*
multi-line comments
多行註釋

可以聲明多行註釋的訊息

1.Java中的註釋種類:
單行註釋、多行註釋、文檔註釋(Java特有)

2.單行註釋、多行註釋的作用:
	(1)對程式碼進行解釋說明
	(2)對程序進行調試

3.注意:
	(1)單行註釋與多行註釋中聲明的訊息，不參與編譯。換句話中，編譯後生成的位元組碼文件不包含註釋訊息。
	(2)多行註釋不能嵌套使用(多行註釋符號中不能再加入其他或重複的註釋符號)

4.文檔註釋內容可以被JDK提供的工具 javadoc 所解析，生成一套以網頁文件形式體現的該程序的說明文檔。

*/

/**
這是我的第一個java程序。很開森!

@author LiamH0512@outlook.com
@version 1.0 


*/
public class CommentTest{
	//main method
	public static void main(String[] args){
		//output statement
        System.out.println("Hello World!");
    }
}