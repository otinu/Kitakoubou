package workbook;

public class sampleObject {
	protected int num;
	public sampleObject(int num) {
		this.setNum(num);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void testEcho (String text) {
		System.out.println("echo: " + text);
	}
}
