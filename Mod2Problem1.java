class Employee{
    String name,add;
    int year;
    Employee(int i){
        System.out.println("Hamilton          2007               Wilshire Blvd. Beverly Hills");
    }
    Employee(float i ){
        System.out.println("Ricciardo         2011               Alto Cedro Dr, Beverly Hills");
    }
    Employee(double i){
        System.out.println("Vettel            2007               I-41053 Maranello (MO)");
    }
}
public class Mod2Problem1{
    static{
        System.out.println("Name         Year of joining         Address");
    }
    public static void main(String[] args) {
        new Employee(1);
        new Employee((float)2.0);
        new Employee(3.0);
    }
}