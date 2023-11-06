import java.io.BufferedReader;
import java.io.InputStreamReader;

class NumberPrinter extends Thread{
    int start;
    int end;

    NumberPrinter(int start, int end) {
        this.start=start;
        this.end=end;
        this.start();
    }

    @Override
    public void run() {
        if(start%2==0)
            printEvenNumbers();
        else
            printOddNumbers();
    }

    void printEvenNumbers() {
        for(int i=start;i<=end;i+=2)
            System.out.println("Even: "+i);
    }

    void printOddNumbers() {
        for(int i=start;i<=end;i+=2)
            System.out.println("Odd: "+i);
    }
}

public class PracProblem8 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter start number: ");
        int start=Integer.parseInt(br.readLine());

        System.out.print("Enter end number: ");
        int end=Integer.parseInt(br.readLine());

        Thread t1=new NumberPrinter(start, end);
        Thread t2=new NumberPrinter(start+1, end);
    }
}
