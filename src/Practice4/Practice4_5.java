package Practice4;

public class Practice4_5 {
	int a=3,b=4;
	
	void doSomething() {
		new InnerClass().swap();
		System.out.printf("%d %d\n",a,b);
	}
	
	public static void main(String[] args)
	{
		new Practice4_5().doSomething();
	}
	
	class InnerClass{
		public void swap() {
			int temp=b;
			b=a;
			a=temp;
		}
	}
}
