package coding_test;

public class TestApp {

	public static void main(String[] args) {
		String input= "{\"AE Study ID\":\"221AD302\",\"AE Subject ID\":\"221AD302~553~553055\",\"AE Term\":\"tinnitus , rumours\",\"AE Serverity\":\"MILD\",\"SAE Flag\":\"N\",\"AE Acn\":\"DOSE NOT CHANGED\",\"AE End Date\":2018-10--}";
		String[] array = input.split("\",\"");
		for(int i=0; i<array.length; i++) {
			System.out.println("\""+array[i]+"\"\n");
		}
	}
}