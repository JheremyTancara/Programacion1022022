package Assignment7_03;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metods {
    
    static Scanner entrada = new Scanner(System.in);
    public static String[][] matriz(){
        String[][] matrizGame = new String[3][3];
        for (int i = 0; i < matrizGame.length; i++) {
            for (int j = 0; j < matrizGame.length; j++) {
                matrizGame[i][j] = "-";
            }
        }
        return matrizGame;
    }
    
    public static void startingGame(){ 
        String[][] matrizGame = Metods.matriz();
        boolean changePlayer = true;
        int movement1;
        int movement2;
        int i = 0;    
        int endGame = 0;

        while (i<9){
            if (changePlayer){
                System.out.print("player 1 turn" +"\n");

                movement1 = Integer.parseInt(JOptionPane.showInputDialog("Horizontal position 1, 2, 3  ---"));
                movement2 = Integer.parseInt(JOptionPane.showInputDialog("Upright position 1, 2, 3  ///"));

               
                if (movement2 >3 | movement1 >3 | movement2 <1 | movement1 <1) {
                    System.out.print("invalid movement" +"\n");
                    i--;
                }
                else if (matrizGame[movement2-1][movement1-1] != "-") {
                    System.out.print("Occupied position" +"\n");
                    i--;
                } else{
                    matrizGame[movement2-1][movement1-1] = "x";
                    changePlayer =! changePlayer;
                }
                
            } else{
                System.out.print("player 2 turn" +"\n");

                movement1 = Integer.parseInt(JOptionPane.showInputDialog("horizontal position 1, 2, 3 ?"));
                movement2 = Integer.parseInt(JOptionPane.showInputDialog("upright position 1, 2, 3 ?"));

                if (movement2 >3 | movement1 >3 | movement2 <1 | movement1 <1) {
                    System.out.print("invalid movement" +"\n");
                    i--;
                }
                else if (matrizGame[movement2-1][movement1-1] != "-") {
                    System.out.print("Occupied position" +"\n");
                    i--;
                } else{
                    matrizGame[movement2-1][movement1-1] = "o";
                    changePlayer =! changePlayer;
                }
            }
            i++;
            endGame = Metods.victory(matrizGame);
            
            for (String[] boardGame1 : matrizGame) {
                System.out.println(Arrays.deepToString(boardGame1));
            } 
            if (endGame == 0) {    
                i = 10;
                if (changePlayer){
                    System.out.print("The player wins");
                } else{
                    System.out.print("The player wins");
                }
            } else if (i == 9) {
                System.out.print("tiajjae");
            }
        }
    } 
    
    public static int victory(String[][] matrizGame){
        
        int win = 10;
        
        for (int i = 0; i < 3; i++) {
            if (matrizGame[i][0] == matrizGame[i][1] && matrizGame[i][0] == matrizGame[i][2] && matrizGame[i][0] == "x") {
                win = 0;
            }
            else if (matrizGame[0][i] == matrizGame[1][i] && matrizGame[0][i] == matrizGame[2][i] && matrizGame[0][i] == "x") {
                win = 0;
            }
            else if (matrizGame[0][0] == matrizGame[1][1] && matrizGame[0][0] == matrizGame[2][2] && matrizGame[0][0] != "-"){
                win = 0;
            }
            else if (matrizGame[0][2] == matrizGame[1][1] && matrizGame[0][2] == matrizGame[2][0] && matrizGame[1][1] != "-"){
                win = 0;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (matrizGame[i][0] == matrizGame[i][1] && matrizGame[i][0] == matrizGame[i][2] && matrizGame[i][0] == "o") {
                win = 0;
            }
            else if (matrizGame[0][i] == matrizGame[1][i] && matrizGame[0][i] == matrizGame[2][i] && matrizGame[0][i] == "o") {
                win = 0;
            }
            else if (matrizGame[0][0] == matrizGame[1][1] && matrizGame[0][0] == matrizGame[2][2] && matrizGame[0][0] != "-"){
                win = 0;
            }
            else if (matrizGame[0][2] == matrizGame[1][1] && matrizGame[0][2] == matrizGame[2][0] && matrizGame[1][1] != "-"){
                win = 0;
            }
        }
        return win;
    } 
}