package learning.hacker_rank_mcQ;
//Read about method overloading
public class Test0001 {
    void display(Object o){
        System.out.println("Object");
    }
    void display(String o){
        System.out.println("String");
    }
    
    public static void main(String[] args) {
        new Test0001().display(null);//String
    }
}