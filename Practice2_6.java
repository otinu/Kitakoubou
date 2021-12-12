package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2_6 {

	public static void main( String[] args ) throws IOException
    {
		System.out.println("年齢はおいくつですか？ 半角数字で入力をお願いします。");
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int age = Integer.parseInt(br.readLine());
        System.out.print("生まれてから現在までの、おおよその日数は" + String.valueOf(age * 365) + "です。");
    }

}
