package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2_4 {
	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println("xとyの和は" + String.valueOf(x + y));
        System.out.println("xとyの差は" + String.valueOf(x - y));
        System.out.println("xとyの積は" + String.valueOf(x * y));
        System.out.print("xとyの商は" + String.valueOf(x / y));
        System.out.print("、余りは" + String.valueOf(x % y));
    }
}
