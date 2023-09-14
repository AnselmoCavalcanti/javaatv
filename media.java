import java.util.Scanner;

public class media {
    public static void main(String[] args){
       int opçao;
       double nota1, nota2, media, notamatematica, notaportugues, notaigles, mediaPONDERADA;        
        Scanner input = new Scanner(System.in);
      while(true){
        System.out.println("Realize sua ação:\n1- Média aritmética\n2- Média ponderada\n3- Sair");
            opçao = input.nextInt();
            
        if(opçao == 1){
               
       System.out.println("Digite sua Primeira nota: ");
               nota1 = input.nextDouble();
        System.out.println("Digite sua Segunda nota: ");
               nota2 = input.nextDouble();
        media = ((nota1 + nota2) / 2);
        System.out.println("Sua média aritmética é de: " + media);
        
        }if (opçao == 2){
          double pesomat = 3;
          double pesoport = 2;
          double pesoing = 2;
        
        System.out.println("O peso de cada matéria: Matemática = 3\nPortuguês = 2\nInglês = 2. ");
        System.out.println("INSIRA sua nota de matemática: ");
            notamatematica = input.nextDouble();
        System.out.println("INSIRA sua nota de Português: ");
            notaportugues =  input.nextDouble();
        System.out.println("INSIRA sua nota de Inglês: ");
            notaigles =  input.nextDouble();
            
        mediaPONDERADA = ((pesomat * notamatematica + pesoport * notaportugues + pesoing * notaigles) / (pesomat + pesoport + pesoing));

        System.out.println("Sua média ponderada nessa atividade foi de: " + mediaPONDERADA);
        }if (opçao == 3){
            System.out.println("Encerrando...");
            break;
        } if (opçao != 1 && opçao != 2 && opçao != 3){
            System.out.println("Comando Inválido.");
        }
    }
        
        
    }
}

