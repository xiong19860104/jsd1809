package testservlet;

public class SingleDemo {//����ʽ
	public static SingleDemo singleDemo=new SingleDemo();
	//������˽�л�
	private SingleDemo(){}
	//�ṩ��ȡ�ö���ķ���
	public static SingleDemo getSingleDemo(){
		return singleDemo;
	}

}
