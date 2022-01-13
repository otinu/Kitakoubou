package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
		int     values[] = new int[10];

		for( int i = 0 ; i < 10 ; i++ ) {
			values[i] = Integer.parseInt( br.readLine() );
		}

		System.out.println("----------------------");

		for( int i = 9 ; 0 <= i ; i-- ) {
			System.out.println( values[i] );
		}
	}

}
