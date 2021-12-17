package workbook;

class Employee implements ExtendWoker {
	public void work() {
		System.out.println("work");
	}
	public void report() {
		System.out.println("report");
	}
	
	public void create() {
		System.out.println("Employeeクラスでcreateメソッドを具体化");
	}
}

class Engineer extends Employee {
	public void create() {
		System.out.println("create future");
	}
}

public class Extend7 {
	public static void main(String[] args) {
		ExtendWoker a = new Engineer();
		Employee b = new Engineer();
		Engineer c = new Engineer();

		a.create();
		b.work();
		c.report();
	}
}
