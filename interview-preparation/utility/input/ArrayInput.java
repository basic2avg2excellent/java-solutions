package utility.input;

import java.io.Serializable;

public final class ArrayInput implements Serializable{

	private static final long serialVersionUID = 2638242916447277671L;
	
	public static final int[] INTEGERS = {-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8};
	public static final int[] SORTED_NATURAL_NUMBERS = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	public static final int[] UNSORTED_NATURAL_NUMBERS = {3,4,9,10,19,11,5,6,18,7,1,12,17,13,2,8,14,15,16,20};
	public static final int[] WHOLE_NUMBERS = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	
	public static final Integer[] EMPLOYEE_IDS = {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1111};
	
	public static final String[] STRING_ALPHABET_ARRAY = {"ABC","DEF","GHI","JKL","MNO","PQR","STU","VWX","YZA","BCD","EFG","HIJ","KLM","NOP","QRS","TUV","WXY"};
	public static final String[] STRING_RANDOM_ARRAY = {"duplicate","objects","Stream","Group","Find","NodeJS","Spring","jdbc","Hibernate","spring boot"};
}