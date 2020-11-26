package my.util;
import java.util.*;
public class Common{
	//int型配列をシャッフルするメソッド
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=new Random().nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	//配列のクローンを返却するメソッド
	public static int[] arrClone(int[] arr){
		int[] cloneArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			cloneArr[i]=arr[i];
		}
		return cloneArr;
	}
	//配列を昇順に並び替えるメソッド
	public static void arrSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	//第二引数でtrueを渡されると降順ソートするメソッド
	public static void arrSort(int[] arr,boolean isDesc){
		if(isDesc){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}else{
			Common.arrSort(arr);
		}
		System.out.println(Arrays.toString(arr));
	}
	//要素数と指定範囲を受け取り、乱数で埋めた配列を返すメソッド
	public static int[] arrRandomRange(int min,int max,int count){
		int[] newArr=new int[count];
		for(int i=0;i<newArr.length;i++){
			newArr[i]=new Random().nextInt(max-min+1)+min;
		}
		return newArr;
	}
}
