package Assignment7_02;
public class App {

    public static void main(String[] args) {
        Metods print = new Metods();
        int boxSize = 7;
        Metods Print = new Metods();
        int[][] boxMagic = Metods.BoxMagic(boxSize);
        print.printMatriz(boxMagic, 7);
        int line = Metods.additionLine(boxMagic, 7, 2);
        int Column = Metods.additionColumn(boxMagic, 7, 2);
        int mainDiagonal = Metods.additionMainDiagonal(boxMagic, 7);
        int ReverseDiagonal = Metods.additionReverseDiagonal(boxMagic, 7);
        Print.printMessages(boxSize, line, Column, mainDiagonal, ReverseDiagonal);
        
    }
}