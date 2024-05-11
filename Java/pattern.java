
import java.util.Scanner;

public class pattern {

    public static void hollowRect(int n, int m){

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0){
                    System.out.print("*");
                }
                else if(i==n-1||j==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        System.err.println("Please enter length & breadth of the hollow rectangle:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m= scanner.nextInt();

        hollowRect(n, m);

    }
    
}
