package workbook;

import java.util.ArrayList;

public class Practice8_4 {

	public static void main(String[] args) {
		ArrayList <Animal> list = new ArrayList<Animal> ();
		list.add(0, new Dog());
		list.add(1, new Cat());
		list.add(2, new Dog());
		list.add(3, new Cat());
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).Speak();
		}
	}

}
