package workbook;

class Dog extends Animal{
    private String Name;
    private int Age;
    private String Type;

    public void SetName( String nm )
    {
        Name = nm;
    }
    
    public void SetAge(int age) {
    	Age = age;
    }
    
    Dog() {
    	
    }
    
    Dog(String type) {
    	this.Type = type;
    }

    /* 8-2
    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" );
        System.out.println( Age + "歳です。" );
        System.out.println( "犬種は、" + Type + "です。" );
    }
    */
    
    void Run() {
		System.out.println("トコトコ");
	}
    
    public void Speak() {
    	System.out.println("ワンワン");
    }
}