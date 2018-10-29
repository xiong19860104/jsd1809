package testservlet;

public class SingleDemo {//饿汉式
	public static SingleDemo singleDemo=new SingleDemo();
	//构造器私有化
	private SingleDemo(){}
	//提供获取该对象的方法
	public static SingleDemo getSingleDemo(){
		return singleDemo;
	}

}
