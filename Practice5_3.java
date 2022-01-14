package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Practice5_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		

		for( int i = 0 ; i < 10 ; i++ ) {
			int num = Integer.parseInt( br.readLine() );
			if(num % 2 == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
			
		}

		System.out.println("[偶数]");
		for(int i : even) {
			System.out.println(i);
		}
		
		System.out.println("[奇数]");
		for(int j : odd) {
			System.out.println(j);
		}
	}

}
