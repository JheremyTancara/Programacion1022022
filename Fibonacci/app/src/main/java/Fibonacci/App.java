package Fibonacci;

public class App {
    
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci(15);
        
        System.out.println(fibo); /* 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 */
        
       
        fibo.setNum(4);
        System.out.println(fibo.getSum()); //4
        fibo.setNum(6);
        System.out.println(fibo.getSum()); //12    


    }
   
}