package testservlet;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		//ѡ��������һ�����ͺ����ÿһ�����Ƚϣ�ÿ���ҳ�һ�����(��С)��
		int [] arr={3,1,4,10,8,5};
		
		// ��������
	    // ��������ԭ��ܼ򵥣���һ�����ݷֳ����飬
	    // �ֱ����Ϊ��������������顣
		// ÿ�δӴ���������ȡ��һ��Ԫ�أ�
		// ���������Ԫ�ؽ��бȽϣ����ҵ����ʵ�λ�ã�
		// ����Ԫ�ز嵽�����鵱�С���������ÿ�β���һ��Ԫ�أ�
		// ���������ӣ�����������١�ֱ����������Ԫ�ظ���Ϊ0��
	   // ��Ȼ������������漰����Ԫ�ص��ƶ���
		for(int i=1;i<arr.length;i++){
			//int temp=arr[1] =1
			int temp=arr[i];// ȡ������(δ����)��һ��Ԫ��
			//  j=0
			int j=0;
			for( j=i-1;j>=0;j--){// ���Ѿ�����������дӺ���ǰ����
				// �Ƚ�
				if(temp>arr[j]){
					break;
				}else{
					// ǰ��Ԫ�ش�, ���ƶ�
					//�ƶ�λ��
					//int [] arr={3,1,4,10,8,5};
					//arr[1]=arr[0]
					// ����ƶ�
					arr[j + 1] = arr[j];
				}
			}
			arr[j+1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<arr.length;i++){
//			//
//			for(int j=i+1;j<arr.length;j++){
//				//�Ƚ�
//				if(arr[i]>arr[j]){
//					//����
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
		

	}

}
