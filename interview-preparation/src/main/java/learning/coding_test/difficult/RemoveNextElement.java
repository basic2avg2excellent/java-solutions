package learning.coding_test.difficult;

import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveNextElement {
    public static void main(String[] args) {
        
        CopyOnWriteArrayList< Integer> lastRemain = new CopyOnWriteArrayList<>();
        for(int i =1;i<7;i++)
        lastRemain.add(i);
        int index=0;//position from which start counting
        int k =1;// no of counting of people 
        solve(lastRemain, index, k);
        System.out.println(lastRemain);
             
    }

    public static void solve(CopyOnWriteArrayList< Integer> lastRemain,int index ,int k) {
        if(lastRemain.size()==1) {
            return;
        }
        index = (index+k)%lastRemain.size();
        lastRemain.remove(index);
    //    System.out.println(lastRemain);
        solve(lastRemain, index,k);
        
    }
}

//Input : In a circle (1,2,3,4,5,6) -> 1 kills 2 and pass the gun to 3, 3 kills 4 and pass the gun to 5,
//5 kills 6 and pass the gun to 1, 1 kills 3 and pass the gun to 5. at last 5 kills 1.
// so last remaining element stays 5.
//output : 5