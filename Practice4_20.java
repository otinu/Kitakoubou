package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_20 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		{
			BufferedReader br = new BufferedReader(
								new InputStreamReader( System.in ) );
			int x = Integer.parseInt(br.readLine());
			for(int i = 1; i <= x; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("$");
				}
				System.out.println("");
			}
		}
	}
}
