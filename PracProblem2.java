class MathOperations {

    static int add(int num1,int num2) {
        return (num1+num2);
    }
    
    static int subtract(int num1,int num2) {
        return (num1-num2);
    }

    int multiply(int num1,int num2) {
        return (num1*num2);
    }

    int divide(int num1,int num2) {
        try {
            return (num1/num2);
        }catch(Throwable e) {
            e.printStackTrace();
            return 0;
        }
    }
}

public class PracProblem2 {
    public static void main(String[] args) {
        MathOperations obj=new MathOperations();

        int a=MathOperations.add(5, 10);
        int b=MathOperations.subtract(55, 5);

        int c=obj.multiply(100, 200);
        int d=obj.divide(100, 0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
