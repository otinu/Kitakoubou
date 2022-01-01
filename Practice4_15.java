package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("素数判定です。数値を入力してください。");
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
    	int x = Integer.parseInt(br.readLine());
    	
    	if (x % 2 == 0) {
    	    System.out.println(x + "は素数ではありません。");
    	    return;
    	}
    	
    	for (int i = 3; i <= Math.sqrt(x); i+=2) {
    	      if (x % i == 0) {
    	        System.out.println(x + "は素数ではありません。");
    	        return;
    	      }
    	}
    	
    	System.out.println(x + "は素数です。");
	}

}
