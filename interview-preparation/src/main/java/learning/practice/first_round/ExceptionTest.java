package learning.practice.first_round;

public class ExceptionTest {
    public static void main(String[] args){
        try{
            System.out.println("Try Block");
            int x = 10/0;//got exception
            System.out.println(x);
        }catch(Exception e){
            System.out.print("Catch Block : ");
            System.out.println("Value of x could not find");
        }
        // finally{
        //     System.out.println("Finally Block");
        // }
        System.out.println("Outside of try-catch-finally block");
    }
}