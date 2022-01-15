package workbook;

public class Extend44 {

	public static void main(String[] args) {
		
		// splitメソッドは先頭の空白文字は切り分け対象にして、末尾の空白文字は切り捨てている
		String message = " Hello sisijima ! ";
		String[] array = message.split(" ");
		System.out.println(array.length);
		System.out.println(array[0]);
	}

}
