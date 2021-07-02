package learning.coding_test.intermediate;

public class CamelCase {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelCaseCount(String string) {
    // Write your code here
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isUpperCase(string.charAt(i))){
                count++;
            }
        }
        return count;
    }

}
