import my.util.*;
import java.util.*;
public class Test{
	public static void main(String[] args){

		int[] arrA={1,2,3,4,5,6};
		int[] arrB=my.util.Common.arrClone(arrA);
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));

		boolean isDesc=true;
		int[] arrC=Common.arrSort(arrB,isDesc);
		System.out.println(Arrays.toString(arrC));

		System.out.print("要素数>");
		int count=new Scanner(System.in).nextInt();
		System.out.print("最小>");
		int min=new Scanner(System.in).nextInt();
		System.out.print("最大>");
		int max=new Scanner(System.in).nextInt();
		int[] randomArr=Common.arrRandomRange(min,max,count);
		System.out.println(Arrays.toString(randomArr));
		
	}
}
