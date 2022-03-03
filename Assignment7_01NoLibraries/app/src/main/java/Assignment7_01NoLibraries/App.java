package Assignment7_01NoLibraries;
public class App {
//EJERCICIO1 SIN BIBLIOTECAS
    public static void main(String[] args) {    
        Metods print = new Metods();
        int[] list = Metods.askNumbers4(1,12,3,12,5,6,7,27,9,11,17,12,19,14,15,16);
        int[][] matriz = Metods.Matriz(4, list);
        int line = Metods.additionReverseDiagonal(matriz, 4);
        print.printMatriz(matriz, line, 4);
    }       
}