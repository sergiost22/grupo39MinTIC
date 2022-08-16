
package Reto1;
import java.util.Arrays;

public class Reto1 {
    public static void main(String[] arg){
       int[] participantes ={19,22,21,25,32,38,16,31,30,26,19,17,23};
       String resultados = Arrays.toString(reporte(participantes));
       
       System.out.println("Reporte: " + resultados);
    }
     public static int[] reporte(int [] participantes){
        int end=participantes.length;
         
        participantes=quickSort(participantes,0,end-1);
        
        int [] resultados={end,participantes[0],participantes[end-1]};
        
        return resultados;
     }
     
     public static int[] quickSort(int A[], int begin, int end){
         int pivot=A[begin];
         int i=begin;
         int j=end;
         int aux;
         
         while(i < j){
            while(A[i] <= pivot) i++;
            while(A[j] > pivot) j--;
            if(i < j){
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;                
            }
        }
        
        A[begin]=A[j];
        A[j]=pivot;
        
        if(begin < j-1)
            quickSort(A,begin,j-1);
        if(j+1 < end)
            quickSort(A,j+1,end);
        
        return A;
         
     }
    
}
