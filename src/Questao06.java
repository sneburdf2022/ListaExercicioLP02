import java.util.Scanner;
public class Questao06
 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor da conta");
        float valorConta = ler.nextFloat();
        System.out.println("Quantas pessoas vão participar da divisão?");        
        int qtdPessoas = ler.nextInt();
        double valorPorPessoa = valorConta / qtdPessoas;
        System.out.println("Cadas pessoa deve pagar:");    
        System.out.println(String.format("R$ %s%s%s",ANSI_RED,valorPorPessoa,ANSI_RESET));    
         
        
        ler.close();
    }
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
}

