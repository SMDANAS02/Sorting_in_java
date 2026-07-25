/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={13,46,24,52,20,9};
// 		for(int i=arr.length-1;i>=0;i--){
// 		    int swap=0;
// 		    for(int j=0;j<=i-1;j++){
// 		        if(arr[j]>arr[j+1]){
// 		            int temp=arr[j];
// 		            arr[j]=arr[j+1];
// 		            arr[j+1]=temp;
// 		            swap=1;
// 		        }
// 		    }
// 		    if(swap==0){
// 		        break;
// 		    }
// 		}
// 		System.out.println(Arrays.toString(arr));
for(int i=0;i<arr.length-1;i++){
    boolean swap=false;
    for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            swap=true;
		        }
    }
    if(!swap){
        break;
    }
}
System.out.println(Arrays.toString(arr));
	}
}
