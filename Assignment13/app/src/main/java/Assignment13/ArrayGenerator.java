package Assignment13;
public class ArrayGenerator {

    String resultFinal;
    int aux = 0;
    int numero = 13; //0 1 1 2 3 5 8 13 21 34 55 89 144
    int[] fibonaci = new int[numero];
    int[] list = new int[100];

    public ArrayGenerator() {
        fibonaci = Fibonacci();
        list = comparar();
        resultFinal = enviar();
    }

    public int[] Fibonacci() {
        int result = 0;
        int auxInt = 0;
        int aux2 = 0;

        do{
            result += auxInt - aux2;
            if (aux == 0){
                auxInt = 1;
            }
            aux2 = result - auxInt;
            auxInt = result;
            fibonaci[aux] += result;
            aux++;
        } while (aux < numero);
        return fibonaci;
    }
    public int[] comparar(){
        int[] list = new int[100];

        int aux = 0;
        int aux2 = 0;
        int number = 0;
        do{
            int x = (int)(Math.random()*141);
            do{
                if(x != fibonaci[aux2]){
                    number = x;
                }
                else{
                    number = 0;
                }
                aux2++;
            }while(aux2 < numero);
            aux2 = 0;

            if(number != 0){
                list[aux] = number;
                aux++;
            }
        }while(aux < 100);
        return list;
    }
    public String enviar(){
        String result = "";
        int aux2 = 0;
        do{
            result += (aux2+1)+". "+list[aux2]+"\n";
            aux2++;
        }while(aux2 < 100);
        return result;
    }
    
    
    @Override
    public String toString(){
        return resultFinal;
    }
}