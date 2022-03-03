package Assignment7_01YesLibraries;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class App {
//EJERCICIO 1 PERO CON BIBLIOTECAS
    public static void main(String[] args) { 
        Metods printResult = new Metods();
        Metods printMatriz = new Metods();     
        int[][] matriz = Metods.Matriz();
        int Result = Metods.additionReverseDiagonal(matriz, 3);
        printResult.printResult(Result);
        printMatriz.printMatriz(matriz, 3);
        }
}