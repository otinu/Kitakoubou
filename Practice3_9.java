package workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("診察曜日を次の番号から入力してください");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
		int dayOfWeek = Integer.parseInt(br.readLine());
		
		System.out.println("次に診断の時間帯を次の番号から入力してください");
		System.out.println("0=午前、1=午後、2=夜間");
		br = new BufferedReader( new InputStreamReader( System.in ) );
		int timeOfDay = Integer.parseInt(br.readLine());
		
		boolean openFlag = true;

		if( dayOfWeek == 0 )
		    openFlag = false;
		else if( timeOfDay == 0 && ( dayOfWeek == 2 || dayOfWeek == 5 ) )
		    openFlag = false;
		else if( timeOfDay == 1 && dayOfWeek == 6 )
		    openFlag = false;
		else if( timeOfDay == 2 && ( dayOfWeek == 3 || dayOfWeek == 6 ) )
		    openFlag = false;

		if( openFlag )
		    System.out.println( "診療日です。" );
		else
		    System.out.println( "休診日です。" );
	}

}
