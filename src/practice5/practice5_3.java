package practice5;

import java.util.Arrays;

class Data3 implements Comparable<Data3> {
	int a;

	public Data3(int a) {
		this.a = a;
	}

	@Override
	public int compareTo(Data3 data) {
		return this.a-data.a;
	}

	@Override
	public String toString() {
		return ""+a;
	}
}

public class practice5_3 {
	public static void main(String[] args) {
		Data3[] a = new Data3[] { new Data3(3), new Data3(5), new Data3(1) };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
