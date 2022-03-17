package Fibonacci;
public class Fibonacci{
    int numero;
    int number;
    String numstr;
    
    public Fibonacci(int numero) {
        this.numero = numero;
        this.numstr = Fibonacci2(numero);     
    }  
    
    @Override 
    public String toString(){
        return numstr;
    }
    
    public String Fibonacci2(int numero) {
        
        int[] numeros = new int[numero];
        numeros[0] = 0;
        numeros[1] = 1;
        for (int i = 2; i < numeros.length; i++){
            numeros[i] = (numeros[i - 2] + numeros[i - 1]);
        }
        String numerosstr = "";
       
        for(int i = 0; i < numeros.length; i++){
            numerosstr += (numeros[i] + " ");
        }
        return numerosstr;
    }
    
    public void setNum(int num){
        this.number = num;
    }
        
    public int getSum(){
        int[] numeros = new int[numero];
        numeros[0] = 0;
        numeros[1] = 1;
        
        
        for (int i = 2; i < numeros.length; i++){
            numeros[i] = (numeros[i - 2] + numeros[i - 1]);
     
        }
        //System.out.println(number);
        int suma = 0;
        for(int i = 0; i < number; i++){
                suma += numeros[i];
        }
        return suma; 
    }
    }