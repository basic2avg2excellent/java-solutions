package theory.string;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ImmutableClassTest {

	public static void main(String[] args) {
		Instant initialTime = Instant.now();
		ImmutableClass imC = ImmutableClass.createNewInstance(10, "Test", new Date());
		System.out.println(imC);
		tryModification(imC.getImmutableInteger(), imC.getImmutableString(), imC.getImmutableDate());
		System.out.println(imC);
		Instant finalTime = Instant.now();
		System.out.println("Total Execution Time : "+Duration.between(finalTime, initialTime)+" ns");
	}
	
	private static void tryModification(Integer immutableInteger, String immutableString, Date immutableDate) {
		immutableInteger = 1000;
		immutableString = "Test Modified";
		immutableDate.setDate(42);
	}
}