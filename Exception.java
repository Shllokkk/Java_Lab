public class Exception{

    public static void main(String [] args){

        try{

            System.out.println("Start of outer try");            

            try{

                System.out.println("Start of inner try");      
                int x=10/0;
                System.out.println("End of inner try");   

            }catch(ArithmeticException e){

                System.out.println("Inside inner catch");   
                e.printStackTrace();
            }

            System.out.println("End of outer try");   

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Inside outer catch");   
            System.out.println(e);
        } 

        System.out.println("End of main");
    }
}
