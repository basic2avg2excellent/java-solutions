package learning.coding_test.intermediate;

public class ZeroOneSorting {

    public static void zeroOneAscendingSorting(int[] zerosOnes){
        int output[] = new int[zerosOnes.length];
        int lastIndex = zerosOnes.length - 1;
        int startIndex = 0;
        for (int i = 0; i < zerosOnes.length; i++) {
            if(zerosOnes[i] == 1){
                output[lastIndex] = zerosOnes[i];
                lastIndex--;
            }else{
                output[startIndex] = zerosOnes[i];
                startIndex++;
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+",");
        }
    }

    public static void zeroOneDecendingSorting(int[] zerosOnes){
        int output[] = new int[zerosOnes.length];
        int lastIndex = zerosOnes.length - 1;
        int startIndex = 0;
        for (int i = 0; i < zerosOnes.length; i++) {
            if(zerosOnes[i] == 0){
                output[lastIndex] = zerosOnes[i];
                lastIndex--;
            }else{
                output[startIndex] = zerosOnes[i];
                startIndex++;
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+",");
        }
    }

}