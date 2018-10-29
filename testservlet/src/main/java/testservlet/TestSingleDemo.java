package testservlet;

public class TestSingleDemo {
	public static void main(String[] args) {
//		SingleDemo s1=new SingleDemo();
//		SingleDemo s2=new SingleDemo();
		SingleDemo s1=SingleDemo.getSingleDemo();
		SingleDemo s2=SingleDemo.getSingleDemo();
		System.out.println(s1==s2);
		
	}

}
