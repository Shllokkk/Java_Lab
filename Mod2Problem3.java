class ConstructorChaining{
    String name,prof;
    int age;
    ConstructorChaining(){
        this(35);
        System.out.println("Default constructor!");
        name="KRSNA";
    }
    ConstructorChaining(int age){
        this("Lyricist");
        System.out.println("Parameterized constructor with int!");
        this.age=age;
    }
    ConstructorChaining(String prof){
        this.prof=prof;
        System.out.println("Parameterized constructor with String!");
    }
}
public class Mod2Problem3 {
    public static void main(String[] args) {
        ConstructorChaining obj=new ConstructorChaining();
        System.out.println("Name: "+obj.name+"   Age: "+obj.age+"   Profession: "+obj.prof);
    }
}
