package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    
    public static void main(String[] args) {
        int[] fib =  new int[25];
        int buscar; 
        
         
        for(int i = 0; i < fib.length; i++){
           if(i == 0 || i == 1){
               fib[i] = i; 
           }
           else{
               fib[i] = fib[i-1] + fib[i-2];
           }
        }
        
        for(int i = 0; i < fib.length; i++){
            System.out.printf(" [%d] ", fib[i]);
        }
        
        System.out.println("\nDigite o valor a ser buscado:");
        Scanner valor = new Scanner(System.in);
        buscar = valor.nextInt();
        
        
        for(int i = 0; i < fib.length; i++){
            if(fib[i] == buscar){
                System.out.printf("O valor %d, foi encontrado na posição %d ", buscar, i);
                break;
            }
            else if(i == (fib.length - 1)){
                System.out.println("O valor não está na sequência de fibonacci");
            }
        }
        
    }
        
    
}
