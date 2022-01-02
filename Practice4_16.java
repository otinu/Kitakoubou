package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
		int x = Integer.parseInt( br.readLine() );

		for( int i = 2 ; x > 1 ; i++ ){
			while( ( x % i ) == 0 ){
				System.out.print( i + " " );
				x /= i;
			}
		}
	}

}
