package Assignment7_01YesLibraries;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metods {
    
    public static int[][] Matriz(){
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nlin;
        nlin = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the square"));
        
        matriz = new int[nlin][nlin];
        System.out.println("Enter the number of the size of matriz --> "+nlin);
        for(int i=0; i < nlin; i++){
            for(int j=0; j < nlin; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
                System. out.print("Matriz ["+i+"]["+j+"]: "+matriz[i][j]+"\n");
            }  
        }
        return matriz;
    }
    public static int additionLine(int matriz[][], int x, int y){// "x" = list size and "y" = the position of the line you want to add
        int[] list = new int[x]; 
        int aux = 0;
        int aux2 = 0;
        if(y != 0 && y > 0){
        y--;
        }
        else{
            System.out.println("error entering number");
        }
        for(int i=0; i<x; i++){
        list[aux] = matriz[y][i]; 
        aux++;
    }   
        aux = 0;
        for(int i=0; i<list.length; i++){
            aux = list[i];
            aux2 = aux2 + aux;
        }
        return aux2;
    }
    public static int additionColumn(int matriz[][], int x, int y){
        int[] list = new int[x]; 
        int aux = 0;
        int aux2 = 0;
        if(y != 0 && y > 0){
        y--;
        }
        else{
            System.out.println("error entering number");
        }
        for(int i=0; i<x; i++){
        list[aux] = matriz[i][y]; 
        aux++;
    }   
        aux = 0;
        for(int i=0; i<list.length; i++){
            aux = list[i];
            aux2 = aux2 + aux;
        }
        return aux2;
        
    }
    public static int additionMainDiagonal(int matriz[][], int x){
        int[] list = new int[x]; 
        int aux = 0;
        int aux2 = 0;
        for(int i=0; i<x; i++){
        list[aux] = matriz[i][i]; 
        aux++;
    }   
        aux = 0;
        for(int i=0; i<list.length; i++){
            aux = list[i];
            aux2 = aux2 + aux;
        }
        return aux2;
        
    }
    public static int additionReverseDiagonal(int matriz[][], int x){
        int y = x-1;
        int[] list = new int[x]; 
        int aux = 0;
        int aux2 = 0;
        for(int i=0; i<x; i++){
        list[aux] = matriz[i][y];
        y--;
        aux++;
    }   
        aux = 0;
        for(int i=0; i<list.length; i++){
            aux = list[i];
            aux2 = aux2 + aux;
        }
        return aux2;  
    }
    public static void printResult(int Result){
        System.out.println("The whole sum is: "+Result);
    }
    public static void printMatriz(int[][] matriz, int x){
        for(int i = 0; i <x; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
}