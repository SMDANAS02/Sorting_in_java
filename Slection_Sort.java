import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={13,46,24,52,20,9};
		for(int i=0;i<=arr.length-2;i++){
		    int min=i;
		    for(int j=i+1;j<=arr.length-1;j++){
		        if(arr[j]<arr[min]){
		            min=j;
		        }
		    }
		    int temp=arr[i];
		        arr[i]=arr[min];
		        arr[min]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
