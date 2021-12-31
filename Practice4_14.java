package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		{
			System.out.println("1: ストライク　2: ボール　3: ファウル");
	        int strikeCount = 0;
	        int ballCount = 0;
	        
	        int x;
	        BufferedReader br = new BufferedReader(
                    new InputStreamReader( System.in ) );
        	x = Integer.parseInt(br.readLine());
	        while (strikeCount < 4 || ballCount < 5) {
	        	if (x == 1) {
	        		strikeCount++;
	        		System.out.println("ストライク: " + strikeCount);
		        } else if(x == 3 && strikeCount < 3) {
		        	strikeCount++;
		        	System.out.println("ストライク: " + strikeCount);
	        	} else if(x == 2) {
		        	ballCount++;
		        	System.out.println("ボール: " + ballCount);
		        }
	        }
	        System.out.println(ballCount + "ボール、" + strikeCount + "ストライク");
	    }
	}

}
