import java.io.BufferedReader;		//也可寫java.io.*
import java.io.IOException;
import java.io.InputStreamReader;	

public class p28 {

	public static void main(String[] args) throws IOException //輸入/輸出例外，避免因為readLine()而報錯
	
	{
		// TODO Auto-generated method stub
		
		System.out.println("請輸入一個整數:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));  // 要從函式庫搬運對應的函式 InputStreamReader
		
		String str1 = br.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.println("你輸入的數字是: "+num);
		System.out.println();
		
		System.out.println("請輸入字串:");
		
		String str2 = br.readLine();
		
		System.out.println("剛剛輸入的字串是: "+str2);
	}

}
