package workbook;

public class Practice7_3 {

	public static void main(String[] args) {
		Dog shiba = new Dog();
		
		Dog toy = new Dog();
		toy.SetAge(4);
		toy.SetName("プードル");
		
		
		shiba.SetAge(2);
		shiba.SetName("kotarou");
		
		toy.ShowProfile();
		System.out.println();
		shiba.ShowProfile();
	}

}
