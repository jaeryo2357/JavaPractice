package Practice2;
import java.util.Objects;

public class ArrayFind {

	static Object[] test; 
	public static void main(String[] args) {
		addData(10);
		//print();
		System.out.print(findIndex(5));
		System.out.print(findIndex("6"));
	}
	
	static void addData(int count) {
		
		test=new Object[count*2];
		
		for(int i=0;i<count;i++)
		{
			test[i*2]=new Integer(i);
			test[i*2+1]=String.valueOf(i);
		}
	}
	
	static void print() {
		for(int i=0;i<test.length;i++)
		{
			System.out.println(test[i]);
		}
	}
	
	static int findIndex(int Value)
	{
		int index=-1;
		
		for(int i=0;i<test.length/2;i++)
		{
			if((int)test[2*i]==Value)
				index=i*2;
		}
		return index;
	}
	
	static int findIndex(String value)
	{
		int index=-1;
		
		for(int i=0;i<test.length/2;i++)
		{
			if(Objects.equals(value, (String)test[i*2+1]))
				index=i*2+1;
		}
		return index;
	}
}
