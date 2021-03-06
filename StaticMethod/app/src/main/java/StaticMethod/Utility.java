package StaticMethod;
import java.util.Arrays;
public class Utility {
    // EL CUADRO DEL CIFRADO DE VIGENERE.
    public static String[][] Matriz(){
        String[] list  = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "?", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "?", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"};
        int aux= 0;
        int aux2 = 0;
        String matriz[][];
        matriz = new String[27][27];      
        for(int i=0; i<27; i++ ){
            for(int j=0; j<27; j++ ){
                matriz[i][j] = list[aux];
                aux++; 
            }
            aux2++;
            aux = aux2;
        }
        for(int i = 0; i <27; i++) {
            System.out.println(Arrays.deepToString(matriz[i]));
        }
        return matriz;
    }        
    public static String Encriptado(String message, String Kley){
	String[][] matriz = Utility.Matriz();
        String[] encryptedMessage = message.split("");
        String[] encryptedKey = Kley.split(""); 
        String[] messageResult = new String[encryptedMessage.length];  
        int[] nColum = new int[encryptedMessage.length];
        int[] nLine = new int[encryptedKey.length];
        int aux = 0;
        int aux2=0;
        String text = "";
        // LINE
        for(int j = 0; j < encryptedKey.length ; j++){
            for (int i = 0; i < 27; i++) {
                if (encryptedKey[j].equals(matriz[0][i])) {
                    aux=i;
                    nLine[aux2] = aux;
                    aux2++;  
                }
            }
        }
        aux2=0;
        // COLUMN
        for(int j = 0; j < encryptedMessage.length ; j++){
            if(encryptedMessage[j].equals(" ")){
                    nColum[aux2] = -1;
                    aux2++;
            }
            else{
            for (int i = 0; i < 27; i++) {
                if (encryptedMessage[j].equals(matriz[i][0])) {
                    aux=i;
                    nColum[aux2] = aux;
                    aux2++;
                }
            }
        }  
        }
        //DATA UNION
        aux= 0;
        for(int k=0; k<nColum.length; k++){
            if(nColum[k] == -1){
                messageResult[k] = " ";
            }
            else{
            int Position = nLine[aux];
            int Position2 = nColum[k];
            aux++;
            messageResult[k] = matriz[Position][Position2];          
            if (aux+1 > nLine.length){
                aux= 0;
            }
        }
        }
        //TEXT
        for(int i=0;i<messageResult.length;i++){
            text += messageResult[i];
    }
        return text;
    }
    
    
    
    
    public static String Desencriptado(String message, String clave){
	String[][] matriz = Utility.Matriz();
        String[] encryptedMessage = message.split("");
        String[] encryptedKey = clave.split(""); 
        String[] messageResult = new String[encryptedMessage.length];
        int[] nLine = new int[encryptedMessage.length];
        int[] nColumn = new int[encryptedKey.length];
        int aux = 0;
        int aux2 = 0;  
        String text = "";
        //COLUMN
        for (int j = 0; j < encryptedKey.length ; j++){
            for (int i = 0; i < 27; i++) {
                if (encryptedKey[j].equals(matriz[i][0])) {
                    aux=i;
                    nColumn[aux2] = aux;
                    aux2++;  
                }
            }
        }
        aux2=0;   
        //LINE
        aux = 0;
        for(int i = 0; i < encryptedMessage.length; i++) {
            int nota = nColumn[aux];
            if(encryptedMessage[i].equals(" ")){
                    nLine[aux2] = -1;
                    aux2++;
            }
            else {
            for (int j = 0; j < 27; j++){
                if (matriz[nota][j].equals(encryptedMessage[i])){
                    nLine[aux2] = j;
                    aux2++;
                    aux++;
                }
            if (aux+1 > nColumn.length){
                aux= 0;
            }
            }
            }
        }
        //DATA UNION
        for(int k=0; k<nLine.length; k++){
            if(nLine[k] == -1){
                messageResult[k] = " ";
            }
            else{
            int Position2 = nLine[k];
            messageResult[k] = matriz[Position2][0];
            }    
        }
        //TEXT
        for(int i=0;i<messageResult.length;i++){
                text += messageResult[i];
        }
        return text;
    }
}  
