package workbook;

interface I1 {
	int echo();
}

interface I2 {
	String flash();
}

// 抽象クラスでimplementsをした場合、インタフェースの抽象メソッドを具体化しなくともコンパイルエラーにならない

abstract class C implements I1, I2 {
	
}