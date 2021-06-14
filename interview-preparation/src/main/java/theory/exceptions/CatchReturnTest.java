package theory.exceptions;

public class CatchReturnTest {

public static void main(String[] args) {
    CatchReturnTest crt = new CatchReturnTest();
    System.out.println(crt.divide(10, 2));
    System.out.println(crt.divide(10, 0));
}

 public int divide(int a, int b){
    int result = 0 ; 
    try{
        result = a/b;
        return result;
     }
     catch(Exception e){
         return 1; // this will be skipped
     }
     finally{
        return 0; // always return 0
    }
 }   
}