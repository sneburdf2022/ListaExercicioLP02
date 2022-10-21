import java.util.Scanner;
import java.util.Arrays;
public class Questao02
 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);                 
        float[] numeros = {0,0,0};            
        int tamanho = 3;
        int i = 0;
        for(int x = 0; x < tamanho; x++){
            if(i==0){
            System.out.println("Digite um numero");
            }
            else {
                System.out.println("Digite outro número");
            }
            numeros[i] = ler.nextFloat();  
            i++;   
        }
            
        ler.close();
        
        System.out.println("Primeiro:"+numeros[0]);
        System.out.println("Segundo:"+numeros[1]);
        System.out.println("Terceiro:"+numeros[2]);        
        Arrays.sort(numeros);
            System.out.println(ANSI_RESET + "O Maior número é o : " + ANSI_VERDE+  numeros[numeros.length - 1]);
            System.out.println(ANSI_RESET + "O Menor número é o : " + ANSI_RED + numeros[0] + ANSI_RESET);        
        
    }
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_VERDE = "\u001B[32m";
}

