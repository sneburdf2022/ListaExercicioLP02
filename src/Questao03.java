import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa:");
        int idade = ler.nextInt();
        if(idade >= 16){
            System.out.println(ANSI_VERDE+"A pessoa já pode Votar!" + ANSI_RESET);        
        }
        else{
            System.out.println(ANSI_RED+"A pessoa NÃO pode Votar!" + ANSI_RESET);        
        }
        ler.close();
    }
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_VERDE = "\u001B[32m";
}

