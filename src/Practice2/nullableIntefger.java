package Practice2;

public class nullableIntefger {

	public static void main(String args[])
	{
		Integer obj1=23,ob2=null;
		
		int intobj1=obj1.intValue();
		int intobj2=obj1;
		
		int intobj3= (ob2==null)?0:ob2.intValue();
		int intobj4=(ob2==null)?0:ob2;
		
		System.out.printf("%d %d %d %d \n",intobj1,intobj2,intobj3,intobj4);
		
	}
}
