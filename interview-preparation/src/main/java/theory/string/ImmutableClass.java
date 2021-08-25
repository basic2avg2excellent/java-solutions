package theory.string;

import java.util.Date;

/**
 * @author q815527
 * 
 * <a href="https://stackoverflow.com/questions/3769607/why-do-we-need-immutable-class">Why do we need Immutable Class</a>
 * 
 * <a href="https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html">Immutable Class Create Strategy</a>
 *     
 * <a href="https://howtodoinjava.com/java/basics/how-to-make-a-java-class-immutable/">Example to create Immutable Class</a>
 * 
 * <a href="https://dzone.com/articles/about-immutability-in-object-oriented-programming/">About Immutability in OOP</a>
 * 
 * Always remember that your instance variables will be either mutable or immutable.
* Identify them and return new objects with copied content for all mutable objects.
* Immutable variables can be returned safely without extra effort.
 * HashMap<Key, value> : Key always should be immutable in nature. Because if 
 */
public final class ImmutableClass implements Comparable<ImmutableClass>{
	
//	Integer class is immutable as it does not provide any setter to change its content
	private final Integer immutableInteger;
	
//	String class is immutable as it also does not provide setter to change its content
	private final String immutableString;
	
//	Date class is mutable as it provide setters to change various date/time parts
	private final Date immutableDate;
	
//	Default private constructor will ensure no unplanned construction of class
	private ImmutableClass(Integer immutableInteger, String immutableString, Date immutableDate) {
		this.immutableInteger = immutableInteger;
		this.immutableString = immutableString;
		this.immutableDate = immutableDate;
	}

//	Don't Provide any setter methods
	
//	Integer class is immutable so we can return the instance variable as it is
	public Integer getImmutableInteger() {
		return immutableInteger;
	}

//	String class is also immutable so we can return the instance variable as it is
	public String getImmutableString() {
		return immutableString;
	}
	
/*	Date class is mutable so we need a little care here.
 	We should not return the reference of original instance variable.
 	Instead a new Date object, with content copied to it, should be returned.*/
	public Date getImmutableDate() {
		
/**	If we'll return original instance then value will be changed after modification call and this won't be a mutable class anymore.  */
//		return immutableDate; // Check for concept verification
		return new Date(immutableDate.getTime());
	}
	
//	Factory method to store object creation logic in single place
	public static ImmutableClass createNewInstance(Integer immutableInt, String immutableStr, Date immutableDte) {
		return new ImmutableClass(immutableInt, immutableStr, immutableDte);
	}
	
	@Override
	public String toString() {
		return immutableInteger +" : "+ immutableString +" : "+immutableDate;
	}

	@Override
	public int compareTo(ImmutableClass o) {
		return 0;
	}
}