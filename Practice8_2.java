package workbook;

public class Practice8_2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.SetProfile("poti", 3);
		dog.ShowProfile();
		dog.Run();
		
		Cat cat = new Cat();
		cat.SetProfile("tama", 1);
		
		cat.ShowProfile();
		cat.Sleep();
	}

}
