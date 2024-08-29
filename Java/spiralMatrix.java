
import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter no. of Row & Column:");
        String size=sc.nextLine(); 
        String[] x=size.split(" ");
        int[] arrSize= new int[x.length];

        for(int i=0;i<2;i++){
            arrSize[i]=Integer.parseInt(x[i]);
        }
        int n=arrSize[0];
        int m=arrSize[1];

        int[][] spiralMatrix=new int[n][m];

        String matrixEls=sc.nextLine();

        String[] matEl=matrixEls.split(" ");
        
        int z=0;

        for(int i=0; i<n; i++){
            
            for(int j=0;j<m;j++){
                spiralMatrix[i][j]=Integer.parseInt(matEl[z+j]);
            }
            z+=m;
        }

        for(int i=0; i<n; i++){
            
            for(int j=0;j<m;j++){
                System.out.print(spiralMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

        spiralResult(spiralMatrix, n, m);
        
    }


    public static void  spiralResult(int[][] spiralMatrix,int n, int m){
        
        
        int startR=0;
        int startCol=0;
        int endR=n-1;
        int endCol=m-1;

        while(startR<=endR&&startCol<=endCol){
            for(int i=startCol;i<=endCol;i++){
                System.out.print(spiralMatrix[startR][i]+" ");
            }
            startR++;

            for(int i=startR;i<=endR;i++){
                System.out.print(spiralMatrix[i][endCol]+" ");
            }
            endCol--;
            for(int i=endCol;i>=startCol;i--){
                System.out.print(spiralMatrix[endR][i]+" ");
            }
            endR--;
            for(int i=endR;i>=startR;i--){
                System.out.print(spiralMatrix[i][startCol]+" ");
            }
            startCol++;

        }

    }


}
