package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if(x > y) {
        	System.out.println("xはyより大きい");
        } else {
        	System.out.println("xはyより小さい");
        }
	}

}
