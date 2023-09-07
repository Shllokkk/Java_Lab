public class Mod1Problem6{
    void show(int a){
        System.out.println("Method1:Result= "+a);
    }
    void show(double a){
       System.out.println("Method2:Result= "+a);
    }
    void multiply(int a, int b) {
        System.out.println("Method3:Result= "+(a*b));
    }
    void multiply(int a, int b, int c) {
        System.out.println("Method4:Result= "+(a*b*c));
    }
    public static void main(String[] args) {
        Mod1Problem6 demo =new Mod1Problem6();
        System.out.println("Overloading: same number but different type of parameter");
        demo.show(23);
        demo.show(14.0);
        System.out.println();
        System.out.println("Overloading: same type but different number of parameters");
        demo.multiply(10,20);
        demo.multiply(10,20,30);
    }
}

