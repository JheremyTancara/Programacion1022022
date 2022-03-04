package StaticMethod;     
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        //String[][] matriz = Utility.Matriz();
        
    // DESENCRIPTAR
        
        String message= "LBMQNC IW OZZKSSOOZ";
        String clave= "LIMON";
        String resultado = Utility.Desencriptado(message, clave);
        System.out.println(resultado);
        
        //Mensaje: ATACAR AL ANOCHECER

    // ENCRIPTAR
        /*
        String message= "ATACAR AL ANOCHECER";
        String clave= "LIMON";
        String resultado = Utility.Encriptado(message, clave);
        System.out.println(resultado);
        */
        //Criptograma: LBMQNC IW OZZKSSOOZ
    }       
}