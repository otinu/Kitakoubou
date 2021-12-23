package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_11 {
	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        boolean returnFlag = false;
        while(x > 0) {
        	System.out.print(count);
        	if(returnFlag == false) {
        		if(count == 9) {
        			returnFlag = true;
        			continue;
        		}
        		count++;
        	} else {
        		if(count == 0) {
        			returnFlag = false;
        			continue;
        		}
        		count--;
        	}
        	x--;
		}
    }
}
