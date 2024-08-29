import java.util.Scanner;
public class mountaiArray {
    
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String line = sc.nextLine();
    int target=sc.nextInt();
	String[] numberStrs = line.split(" ");
	int[] arr = new int[numberStrs.length];
    for(int i=0;i<n;i++){
      arr[i]=Integer.parseInt(numberStrs[i]);
    }
    
    MountainArray.get(arr,target,n);
  }
  
  public class MountainArray{
  	static int get(int[] arr, int target,int n){
    	for(int i=0;i<n;i++){
        	if(arr[i]==target){
            	return i;
              	
            }
        }
      	return -1;
    }
    
    static int length(int n){
    	return n;
    }
  }
  
}

