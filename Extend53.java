package workbook;

class Extend53 {
    private final String name;
    private final String skill = "none";
    public Extend53(String name, String skill) {
    	
    	// final修飾されたフィールドが1度も初期化されていないため、1度だけ代入できる
        this.name = name;
        
        // skillは既に初期化されているためコンパイルエラー
        this.skill = skill;
        
      //this.name = "hello"; // コンパイルエラー
    }
    public void print() {
        System.out.println(name + " : " + skill);
    }
}
class Test {
    public static void main(String[] args) {
        new Extend53("Duke", "Java").print();
    }
}
