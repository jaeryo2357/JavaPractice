package practice5;

public class practice5_5 {
	int a = 3, b = 4;

	void doSomethoing() {
		new InnerClass().swap();
		System.out.printf("%d %d\n", a, b);
	}

	public static void main(String[] args) {
		new practice5_5().doSomethoing();
	}
	
	class InnerClass{
		public void swap()
		{
			int temp=b;
			b=a;
			a=temp;
		}
	}
}
