import java.util.Scanner;
public class Questao06 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_VERDE = "\u001B[32m";
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa: (exemplo 72) ");
        float peso = ler.nextFloat();
        System.out.println("Digite a altura da pessoa: (exemplo 1,75");
        float altura = ler.nextFloat();
        System.out.println("----------------------------------------");
        System.out.println("----        IMC avaliação           ----");
        
        float calculoImc = (peso)/ (altura * altura);
        System.out.println("---- O IMC é: " + calculoImc );
        if(calculoImc < 20){
            System.out.println(  ANSI_RESET  +"---- Seu IMC está:"+ ANSI_RED +" Abaixo do normal" + ANSI_RESET );              
        }
        else if(calculoImc >= 20 && calculoImc <= 25 ){
                System.out.println(  ANSI_RESET  +"---- Seu IMC está:"+ ANSI_VERDE +" Normal" + ANSI_RESET );              
        }
        else if(calculoImc >= 25 && calculoImc <= 30 ){
            System.out.println(  ANSI_RESET  +"---- Seu IMC está:"+ ANSI_RED +" Sobrepeso" + ANSI_RESET);              
        }
        else if(calculoImc >= 30 && calculoImc <= 35 ){
            System.out.println(  ANSI_RESET  +"---- Seu IMC está:"+ ANSI_RED +" Obesidade leve" + ANSI_RESET );              
        }
        else if(calculoImc >= 35 && calculoImc <= 40 ){
            System.out.println(  ANSI_RESET+ "Seu IMC está:" +ANSI_RED  +" Obesidade moderada" + ANSI_RESET );              
        }
        else if(calculoImc > 40 ){
            System.out.println(  ANSI_RED  +"Obesidade mórbida" + ANSI_RESET );              
        }
        System.out.println("----------------------------------------");

        ler.close();
    }
}

