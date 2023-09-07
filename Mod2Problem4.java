import java.util.*;

class Student{
    String name,address;
    int age;
    Student(){
        name="unknown";
        age=0;
        address="not available";
    }
    void setInfo(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setInfo(String name, String address, int age){
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
public class Mod2Problem4 {
    public static void main(String[] args) {
        int[] a=new int[10];
        String[] n=new String[10];
        String[] add=new String[10];
        Scanner sc=new Scanner(System.in);
        Student[] obj= new Student[10];
        for(int i=0;i<obj.length;i++){
            obj[i]=new Student();
        }
        for(int i=0;i<1;i++){
            System.out.println("Add name, age, address for Student "+(i+1)+":");
            n[i]=sc.nextLine();
            a[i]=sc.nextInt();
            sc.nextLine();
            add[i]=sc.nextLine();
        }
        for(int i=0;i<1;i++){
            obj[i].setInfo(n[i], add[i], a[i]);
        }
        System.out.println("\n-----Student Data-----");
        for(int i=0;i<10;i++){
            System.out.println("\nStudent "+(i+1));
            System.out.println("Name: "+obj[i].name+"\nAge: "+obj[i].age+" years\nAddress: "+obj[i].address);
        }
        sc.close();
    }
}
