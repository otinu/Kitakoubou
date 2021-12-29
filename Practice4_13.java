package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_13 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		{
		System.out.println("1: ストライク　2: ボール");
	        int strikeCount = 0;
	        int ballCount = 0;
	        
	        int x;
	        while (strikeCount < 4 || ballCount < 5) {
	        	BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
	        	x = Integer.parseInt(br.readLine());
	        	if (x == 1) {
	        		strikeCount++;
		        } else if(x == 2) {
		        	ballCount++;
		        }
	        }
	        System.out.println(ballCount + "ボール、" + strikeCount + "ストライク");
	    }
	}
}
