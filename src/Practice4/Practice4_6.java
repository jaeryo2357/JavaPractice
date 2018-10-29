package Practice4;

import Practice4.MyThread.Calculate;

class SharedObject{
	public int sum=0;
	
	synchronized void add(int i) {
		sum=sum+i;
	}
	
	synchronized void sub(int i) {
		sum=sum-i;
	}
}


class MyThread extends Thread{
	
	SharedObject shared;
	public enum Calculate{ BY_ADD , BY_SUB};
	private Calculate calculate;
	int count;
	public MyThread(SharedObject shared,int count,Calculate c)
	{
		this.shared=shared;
		this.calculate=c;
		this.count=count;
	}
	
	public void run() {
		for(int i=0;i<count;i++)
		{
			switch(calculate) {
			case BY_ADD:
				shared.add(i);
				break;
			case BY_SUB:
				shared.sub(i);
				break;
			}
		}
	}
}


public class Practice4_6 {

	public static void main(String args[]) {

		SharedObject shared=new SharedObject();
		Thread ThreadOne=new MyThread(shared,100,Calculate.BY_ADD);
		Thread ThreadTwo=new MyThread(shared,100,Calculate.BY_SUB);
		
		ThreadOne.start();
		ThreadTwo.start();
		try {
		ThreadOne.join();
		ThreadTwo.join();
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
		System.out.println(shared.sum);
		
	}
}
