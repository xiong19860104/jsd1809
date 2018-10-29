
import java.util.Arrays;

public class InsertDemo {
	public static void main(String[] args) {
		// // 选择排序
		// // 每次拿一个数和后面的每一个数比较，
		// // 每次找出最小的数
		// int[] arr = { 3, 1, 8, 5, 2 };
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = i + 1; j < arr.length; j++) {
		// if (arr[i] > arr[j]) {
		// int temp = arr[i];
		// arr[i] = arr[j];
		// arr[j] = temp;
		//
		// }
		// }
		//
		// }
		// System.out.println(Arrays.toString(arr));
		// 插入排序
		// 插入排序原理很简单，讲一组数据分成两组，
		// 分别将其称为有序组与待插入组。
		// 每次从待插入组中取出一个元素，
		// 与有序组的元素进行比较，并找到合适的位置，
		// 将该元素插到有序组当中。就这样，每次插入一个元素，
		// 有序组增加，待插入组减少。直到待插入组元素个数为0。
		// 当然，插入过程中涉及到了元素的移动。
		// int[] ary = { 3, 1, 8, 5, 2 };
		// for (int i = 1; i < ary.length; i++) {
		// int temp = ary[i];// 取出后组(未排序)第一个元素
		// // 查找插入位置
		// int j;
		// for (j = i - 1; j >= 0; j--) {// 在已经排序的数组中从后向前查找
		// if (ary[j] > temp) {// 前面元素大, 就移动
		// ary[j + 1] = ary[j];// 向后移动
		// } else {// 否则的话(ary[j]<=temp), 就找到了位置
		// break;
		// }
		// }
		//
		// ary[j + 1] = temp;// 插入取出的元素
		// }
		// System.out.println(Arrays.toString(ary));
		// 二分查找
		// 1、算法概念。
		//
		// 二分查找算法也称为折半搜索、二分搜索，是一种在有序数组中查找某一特定元素的搜索算法。请注意这种算法是建立在有序数组基础上的。
		// 2、算法思想。
		//
		// ①搜素过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜素过程结束；
		//
		// ②如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。
		//
		// ③如果在某一步骤数组为空，则代表找不到。
		//
		// 这种搜索算法每一次比较都使搜索范围缩小一半。
		//
		// 3、实现思路。
		//
		// ①找出位于数组中间的值，并存放在一个变量中（为了下面的说明，变量暂时命名为temp）；
		//
		// ②需要找到的key和temp进行比较；
		//
		// ③如果key值大于temp，则把数组中间位置作为下一次计算的起点；重复① ②。
		//
		// ④如果key值小于temp，则把数组中间位置作为下一次计算的终点；重复① ② ③。
		//
		// ⑤如果key值等于temp，则返回数组下标，完成查找。
		int[] arr = { 1, 3, 4, 5, 6 };
		int low = 0;
		int x = 5;
		int high = arr.length - 1;// 4
		while (low <= high) {
			// 4/2
			int middle = (low + high) / 2;
			if (x == arr[middle]) {
				System.out.println("找到位置" + middle);
				break;
			} else if (x < arr[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
	}

}
