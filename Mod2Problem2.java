import java.util.*;

class Area{
    int len,wid;
    void setDim(int len, int wid){
        this.len=len;
        this.wid=wid;
    }
    int getArea(){
        return this.len*this.wid;
    }
}
public class Mod2Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area rect= new Area();
        System.out.println("Enter length and width of rectangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        rect.setDim(a,b);
        System.out.println("Area of Rectangle: "+rect.getArea()+" sq. units");
        sc.close();
    }
}
