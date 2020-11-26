import my.util.*;
import java.util.*;
public class MethodQ5{
	public static void main(String[] args){
		System.out.print("配列の要素数を入力してください>");
		int count=new Scanner(System.in).nextInt();
		int[] arrA=Common.arrRandomRange(-10,10,count);
		int[] arrClone=arrA;	
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int choice=new Scanner(System.in).nextInt();
			if(choice==1){
				System.out.println(Arrays.toString(arrA));
			}else if(choice==2){
				Common.arrSort(arrA);
			}else if(choice==3){
				boolean isDesc=true;
				Common.arrSort(arrA,isDesc);
			}else if(choice==4){
				System.out.println("アプリケーションを終了します");
				break;
			}else{
				System.out.println("不正な値です");
			}
		}
	}
}
