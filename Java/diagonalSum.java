
import java.util.Scanner;

public class diagonalSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the size of ROW & Column: ");
        String z= sc.nextLine();
        String[] s=z.split("");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);

        System.out.println("Please enter the elements of the matrix with" + " "+" between elements");
        String elements=sc.nextLine();
        String[] matrixElement=elements.split(" ");
        int[][] matrix=new int[n][m];
        int y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=Integer.parseInt(matrixElement[y + j]);
            }
            y+=m;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
            
        }
        System.out.println(sum(matrix,n,m));
    }

    public static long sum(int[][] matrix,int n,int m){
        long x=0;
        long sum=0;
        long sum2=0;

        if(n==m){
            for(int i=0;i<n;i++){
                sum+=matrix[i][i];
                sum2+=matrix[i][m - 1 - i];
            }
            
        }
        else if(n!=m){
            int z=Math.min(n, m);
            for(int i=0;i<z;i++){
                sum+=matrix[i][i];
                sum2+=matrix[i][z - 1 - i];
            }
               
            
        }
        return x=sum+sum2;
    }
    
}
