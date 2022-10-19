import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        Float numeroDigitado = ler.nextFloat();
        if(numeroDigitado == 0){
            System.out.println("Você digitou um númeo igual que zero");              
        }else if(numeroDigitado > 0){
            System.out.println("Você digitou um númeo maior que zero");              
        }else{
            System.out.println("Você digitou um númeo menor que zero");              
        }
        
        
        ler.close();
    }
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
}

