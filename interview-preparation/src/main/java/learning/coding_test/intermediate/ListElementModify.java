package learning.coding_test.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListElementModify {
    public static List<String> appendCount(String[] array) throws RuntimeException{
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));//{"ABC","DEF","GHI","JKL","MNO","PQR"}
        int index = 1;
        StringBuilder sb;
        for(int i=0; i<list.size();i++){
            sb = new StringBuilder();
            for(int j=1; j<4; j++){
                sb.append(index++);
            }
            list.set(i, list.get(i).concat(sb.toString()));//{ABC123, DEF456, GHI789, JKL101112, MNO131415, PQR161718}
        }
        return list;
    }
}
//Input : {"Gautam", "Raj", "Sonu", "Singh"}
//Output : {"Gautam123", "Raj456", "Sonu789", "Singh101112"}