package Assignment7_02;
public class Metods {
    public static int[][] BoxMagic(int listSize){
        
        int begin = listSize/2;
        int[][] magicBox = new int[listSize][listSize];
        int x = 0;
        int y = 0;       
        int aux = 1;       
        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize; j++) {
                magicBox[i][j] = 0;         
            }   
        }
        int x_actuality = begin;
        int y_actuality = 0;
        
        while (aux != (listSize * listSize) +1){   
            if (magicBox[y_actuality][x_actuality] == 0){
                magicBox[y_actuality][x_actuality] = aux;     
            } else{
                y_actuality = y +1;
                x_actuality = x;
                
                magicBox[y_actuality][x_actuality] = aux;  
            }
            y = y_actuality;
            x = x_actuality;
            
            aux++;
            y_actuality--;
            x_actuality++;
            
            if (y_actuality < 0 && x_actuality == listSize) {
                y_actuality = listSize - 1;
                x_actuality = 0;
            }
            else if(y_actuality < 0){
                y_actuality = y_actuality + listSize;
            }     
            else if (x_actuality == listSize) {
                x_actuality = 0;
            }
        }
        
        return magicBox;
    }
    public static int additionLine(int matriz[][], int x, int y){// "x" = tamaño de la lista y "y" = Numero de la linea que quiere sumar
        int[] list = new int[x]; 
        int aux = 0;
        int aux2 = 0;
        if(y != 0 && y > 0){
        y--;
        }
        else{
            System.out.println("Error al introducir el numero");
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
            System.out.println("Error al introducir el numero");
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
    public static void printMessages(int boxSize, int line, int Column, int mainDiagonal,int ReverseDiagonal){
        System.out.println("Frame dimensions --> "+boxSize);
        System.out.println("The sum produced by each line is -->               "+line);
        System.out.println("The sum produced by each column is -->             "+Column);
        System.out.println("The sum produced by the main diagonal is -->       "+mainDiagonal);
        System.out.println("The sum produced by the reverse diagonal is -->    "+ReverseDiagonal);
    }
    public static void printMatriz(int[][] matriz, int lengthMatriz){
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
    }     
}