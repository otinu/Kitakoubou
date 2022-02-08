package workbook;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.SetProfile("tama", 1);
		cat.ShowProfile();
		cat.Sleep();
	}
	
	void Sleep() {
		System.out.println("スースー");
	}

}
