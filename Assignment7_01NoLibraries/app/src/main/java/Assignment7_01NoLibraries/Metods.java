package Assignment7_01NoLibraries;
//import java.util.Arrays;
public class Metods {
    
    public static int[][] Matriz(int lengthMatriz, int[] list){// "x" = list size
        int aux = 0;
        int matriz[][];
        matriz = new int[lengthMatriz][lengthMatriz];      
        for(int i=0; i<lengthMatriz; i++){
            for(int j=0; j<lengthMatriz; j++){
               matriz[i][j] = list[aux];
               aux++;
            }
        }
        return matriz;
}
    public static int additionLine(int matriz[][], int lengthMatriz, int numberLine){// "x" = list size and "y" = the position of the line you want to add
        int[] list = new int[lengthMatriz]; 
        int aux = 0;
        int aux2 = 0;
        if(numberLine != 0 && numberLine > 0){
        numberLine--;
        }
        else{
            System.out.println("error entering number");
        }
        for(int i=0; i<lengthMatriz; i++){
        list[aux] = matriz[numberLine][i]; 
        aux++;
    }   
        aux = 0;
        for(int i=0; i<list.length; i++){
            aux = list[i];
            aux2 = aux2 + aux;
        }
        return aux2;
    }
    public static int additionColumn(int matriz[][], int lengthMatriz, int numberColumn){
        int[] list = new int[lengthMatriz]; 
        int aux = 0;
        int aux2 = 0;
        if(numberColumn != 0 && numberColumn > 0){
        numberColumn--;
        }
        else{
            System.out.println("error entering number");
        }
        for(int i=0; i<lengthMatriz; i++){
        list[aux] = matriz[i][numberColumn]; 
        aux++;
    }   
        aux = 0;
        for(int i=0; i<list.length; i++){
            aux = list[i];
            aux2 = aux2 + aux;
        }
        return aux2;
        
    }
    public static int additionMainDiagonal(int matriz[][], int lengthMatriz){
        int[] list = new int[lengthMatriz]; 
        int aux = 0;
        int aux2 = 0;
        for(int i=0; i<lengthMatriz; i++){
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
    public static int additionReverseDiagonal(int matriz[][], int lengthMatriz){
        int y = lengthMatriz-1;
        int[] list = new int[lengthMatriz]; 
        int aux = 0;
        int aux2 = 0;
        for(int i=0; i<lengthMatriz; i++){
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
    
    public static int[] askNumbers2(int a, int b, int c, int d){
        int[] list = {a, b, c ,d};
        return list;
    }
    
    public static int[] askNumbers3(int a, int b, int c, int d, int e, int f, int g, int h , int i){
        int[] list = {a, b, c ,d ,e , f, g, h, i};
        return list;
    }
    
    public static int[] askNumbers4(int a, int b, int c, int d, int e, int f, int g, int h , int i, int j, int k, int l, int m, int n, int ñ, int o){
        int[] list = {a, b, c ,d ,e , f, g, h, i, j, k, l, m, n, ñ, o};
        return list;
    }
    
    public static int[] askNumbers5(int a, int b, int c, int d, int e, int f, int g, int h , int i, int j, int k, int l, int m, int n, int ñ, int o, int p, int q, int r, int s, int t, int u, int v, int w, int x){
        int[] list = {a, b, c ,d ,e , f, g, h, i, j, k, l, m, n, ñ, o, p, q, r, s, t, u, v, w, x};
        return list;
    }
    public static void printMatriz(int[][] matriz,int Result, int lengthMatriz){
        System.out.println("\nLa matriz es: ");
        for(int i=0; i < lengthMatriz; i++){
            for(int j=0; j < lengthMatriz; j++){
                if(j == 0){
                    System.out.print("["+matriz[i][j]+",");
                }
                else if(j+1 == lengthMatriz){
                    System. out.print(matriz[i][j]+"]");
                }
                else{
                    System. out.print(matriz[i][j]+",");
                }
            }
            System.out.println(" ");
        }
        System.out.println("the whole sum is: "+Result);
    }
}