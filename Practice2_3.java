package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2_3 {
	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int x = Integer.parseInt(br.readLine());
        int baseNum = x;
        for(int i = 1; i < 4; i++) {
        	x *= baseNum;
        	System.out.println(x);
        }
    }
}
