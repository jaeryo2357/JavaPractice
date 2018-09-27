package Practice1;

public class Practice1_1 {

	public static void main(String[] args)
	{
		int[] a1=new int[] {345,12,478,1003};
		double[] a2=new double[] {23.24,301.234,3.1235,98.0238};
		String[] a3=new String[] {"one","two","three","four"};
		
		System.out.println("       int    double    String");  //10개씩
		System.out.println("---------- --------- ----------");
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(String.format("%10d%10.3f%10s",a1[i],a2[i],a3[i]));// int double string 모두 10칸씩 주어짐
		}
		
	}
}
