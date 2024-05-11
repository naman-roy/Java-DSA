import java.util.Scanner;


class Main{
    public static void  maxProfit(int[] array){
    
        int min= array[0];
        int x=0;
        for(int i=1; i<array.length;i++){
            
            if(array[i]<min){
                min=array[i];
                x=i;    
            }
            
        } 
        int max= array[0];
        for(int j=x+1; j<array.length;j++){
            if(array[j]>max){
                max=array[j];   
            }
            
        }
        System.out.println(max-min);
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] array= new int[size];
        
        for(int i=0; i<size;i++){
            array[i]=sc.nextInt();
        }
        
        maxProfit(array);
    }
}