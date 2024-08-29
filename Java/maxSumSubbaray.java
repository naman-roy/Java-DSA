import java.util.*;

public class maxSumSubbaray{
    public static void maxSumArray(int[] arr){
        int sum =0;
        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int c=0;
                for(int k=i;k<=j;k++){
                    c+=arr[k];
                    //System.out.print(arr[k]+" Sum: "+c);
                    
                    if(c>sum){
                        sum=c;
                    }

                }
                System.out.println();
            }
            System.err.println();
        }
        System.err.println("Max sum of subbarray: "+sum);
    }

    public static void main(String[] args) {
        int size=0;
        System.err.println("Please enter the size of array:");
        Scanner sc = new Scanner(System.in);
        size=sc.nextInt();

        int[] arr= new int[size];

        System.err.println("Please enter "+size+ "elements of array");

        for(int i=0; i<size;i++){ 
            arr[i]=sc.nextInt();
        }

    
        maxSumArray(arr);

    }
}