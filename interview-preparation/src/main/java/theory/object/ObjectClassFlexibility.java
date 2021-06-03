package theory.object;

public class ObjectClassFlexibility {

	public static void main(String[] args) {
		Object obj;
		System.out.println("**********************************");
		obj = 'G';
		System.out.println("Object assigned is 'G' : "+obj.getClass().getName()+" \n Simple Name of class : "+obj.getClass().getSimpleName());
		
		System.out.println("**********************************");
		obj = "String";
		System.out.println("Object reAssigned with \"String\" : "+obj.getClass().getName()+" \n Simple Name of class : "+obj.getClass().getSimpleName());
		
		System.out.println("**********************************");
		obj = 121;
		System.out.println("Object reAssigned with 121 : "+obj.getClass().getName()+" \n Simple Name of class : "+obj.getClass().getSimpleName());
		
		System.out.println("**********************************");
		obj = 1218.22;
		System.out.println("Object reAssigned with 1218.22 : "+obj.getClass().getName()+" \n Simple Name of class : "+obj.getClass().getSimpleName());
		
		System.out.println("**********************************");
		obj = 2216L;
		System.out.println("Object reAssigned with 2216L : "+obj.getClass().getName()+" \n Simple Name of class : "+obj.getClass().getSimpleName());
		
		System.out.println("**********************************");
		obj = true;
		System.out.println("Object reAssigned with true : "+ obj.getClass().getName()+" \n Simple Name of class : "+obj.getClass().getSimpleName());
		
		System.out.println("**********************************");
		byte byt = -128;
		obj = byt;
		System.out.println("Object reAssigned with -128 : "+ obj.getClass().getName()+" \n Simple Name of class : "+obj.getClass().getSimpleName());
	}
}