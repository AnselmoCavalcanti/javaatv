import java.util.Scanner;
import java.text.DecimalFormat;
 
public class Combustivel {
    
    public static void main(String[] args) {
     int opçao;
     double AL, desconto, preçoP, quantidadeFinal, GAL;
     double preçoAL = 3.50;
     double preçoGAS = 5.50;
     double ALCOOLVENDIDO = 0.0;
     double GASOLINAVENDIDA = 0.0;

     DecimalFormat df = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in);
     while(true){
        System.out.println("\nSeja bem-vindo, qual seria o tipo do combustivel?");
          System.out.println("O preço do alcool é de: R$ 5.\nO preço da Gasolina é de: R$7,50.");
     System.out.println("1 - Alcool\n2 - Gasolina\n3 - Litros Vendidos\n0 - Encerrar Operação ");
     opçao = input.nextInt();
     
     
    if (opçao == 1){
    System.out.println("Você escolheu Alcool!");
    System.out.println("descontoontos:\nAté 20L 3% de descontoonto por Litro!\nAcima de 20L 5% de descontoonto por Litro!");
    System.out.println("Insira a quantidade que você dejesa: ");
        AL = input.nextDouble();
        if (AL <= 20){    
       preçoP = preçoAL * AL;
            desconto = preçoP * 0.03;
                quantidadeFinal = preçoP - desconto; 
                System.out.println("Você nos deve: R$ " + df.format(quantidadeFinal));
                   ALCOOLVENDIDO += AL;
        }else if (AL > 20){
    preçoP = preçoAL * AL;
            desconto = preçoP * 0.05;
                quantidadeFinal = preçoP - desconto; 
                System.out.println("Você nos deve: R$ " + df.format(quantidadeFinal));
                ALCOOLVENDIDO += AL;
    }   
    } if (opçao == 2){
    System.out.println("Você escolheu Gasolina!");
    System.out.println("descontoontos:\nAté 20L 4% de descontoonto por Litro!\nAcima de 20L 6% de descontoonto por Litro!");
    System.out.println("Insira a quantidadeFinal que você dejesa: ");
    GAL = input.nextDouble();
        
            if (GAL <= 20){
                preçoP = preçoGAS * GAL;
        desconto = preçoP * 0.04;
        quantidadeFinal = preçoP - desconto;
            System.out.println("Você nos deve: R$ " + df.format(quantidadeFinal));
           GASOLINAVENDIDA += GAL;
            }else if (GAL > 20){
            preçoP = preçoGAS * GAL;
        desconto = preçoP * 0.06;
        quantidadeFinal = preçoP - desconto;
            System.out.println("Você nos deve: R$ " + df.format(quantidadeFinal));
            GASOLINAVENDIDA += GAL;
            
            }
    } if (opçao == 3){
            System.out.println("Nós vendemos esse total de  ALCOOL: " + ALCOOLVENDIDO);
            System.out.println("Nós vendemos esse total de GASOLINA: " + GASOLINAVENDIDA);
            } if( opçao == 0){
            System.out.println("Saindo...");
            break;
        }if (opçao != 1 && opçao != 2 && opçao != 3 && opçao != 0){
                System.out.println("Comando Inválido!");
     }
   } 
  } 
 }
