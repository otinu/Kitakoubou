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
        while(x > 0) {
        	System.out.print(count);
        	count++;
        	if (count == 10) {
        		count =0;
        	}
        	x--;
		}
    }
}
