package testservlet;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		//选择排序：拿一个数和后面的每一个数比较，每次找出一个最大(最小)数
		int [] arr={3,1,4,10,8,5};
		
		// 插入排序
	    // 插入排序原理很简单，讲一组数据分成两组，
	    // 分别将其称为有序组与待插入组。
		// 每次从待插入组中取出一个元素，
		// 与有序组的元素进行比较，并找到合适的位置，
		// 将该元素插到有序组当中。就这样，每次插入一个元素，
		// 有序组增加，待插入组减少。直到待插入组元素个数为0。
	   // 当然，插入过程中涉及到了元素的移动。
		for(int i=1;i<arr.length;i++){
			//int temp=arr[1] =1
			int temp=arr[i];// 取出后组(未排序)第一个元素
			//  j=0
			int j=0;
			for( j=i-1;j>=0;j--){// 在已经排序的数组中从后向前查找
				// 比较
				if(temp>arr[j]){
					break;
				}else{
					// 前面元素大, 就移动
					//移动位置
					//int [] arr={3,1,4,10,8,5};
					//arr[1]=arr[0]
					// 向后移动
					arr[j + 1] = arr[j];
				}
			}
			arr[j+1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<arr.length;i++){
//			//
//			for(int j=i+1;j<arr.length;j++){
//				//比较
//				if(arr[i]>arr[j]){
//					//交换
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
