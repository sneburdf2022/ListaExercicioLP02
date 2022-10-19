import java.util.Scanner;
public class Questao05
 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa:");
        int idade = ler.nextInt();
        if(idade >=16 && idade >=18  ){
            System.out.println(ANSI_VERDE+"Pode votar e pode dirigir!" + ANSI_RESET);        
        }        
        else if(idade < 16 && idade < 18){
            System.out.println(ANSI_RED+"Não pode nem votar e nem dirigir" + ANSI_RESET);        
        }
        else if(idade >= 16 && idade < 18){
            System.out.println(ANSI_VERDE+"Pode votar," + ANSI_RESET +" mas "+ ANSI_RED+"não pode dirigir" + ANSI_RESET);        
        }
        ler.close();
    }
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_VERDE = "\u001B[32m";
}

