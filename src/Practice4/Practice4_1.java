package Practice4;

//다형성 호출 예제


class Parent{
	
	public void method1() {
		System.out.println("Parent 1");
	}
}

class ChildOne extends Parent{
	public void method1() {
		System.out.println("ChildOne");
	}
}

class ChildTwo extends Parent{
	public void method1() {
		System.out.println("ChildTwo");
	}
}
public class Practice4_1 {

	public static void func(Parent p)
	{
		p.method1();
	}
	public static void main(String[] args)
	{
		ChildOne c1=new ChildOne();
		ChildTwo c2=new ChildTwo();
		
		func(c1);
		func(c2);
		
		
	}
}
