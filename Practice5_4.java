package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Practice5_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
		List<Integer> array = new ArrayList<Integer>();
		int sum = 0;
		int size = array.size();

		while( size == 10 || sum > 100) {
			int num = Integer.parseInt( br.readLine() );
			array.add(num);
			num += array.get(size - 1);
			
		}

		for(int i : array) {
			System.out.println(i);
		}
	}

}
