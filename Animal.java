package workbook;

public class Animal
{
    public String Name;
    public int Age;
    
    public void SetProfile(String name, int age) {
    	Name = name;
    	Age = age;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
    
    public void Speak()
    {
        System.out.println( "......" );
    }
}
