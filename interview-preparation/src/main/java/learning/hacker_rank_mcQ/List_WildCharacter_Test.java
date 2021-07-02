package learning.hacker_rank_mcQ;

import java.util.ArrayList;
import java.util.List;

public class List_WildCharacter_Test {
    public static void main(String[] args) {
        List<Object> objList = new ArrayList<>();
        List<?> wildCharList = new ArrayList<>();
        objList.add("");
        wildCharList.add(null);//only null is acceptable at this point, try yourself
        System.out.println(objList);
        System.out.println(wildCharList);
    }
}
