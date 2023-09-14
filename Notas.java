import java.util.Scanner;

 class Notas {
    
    public static void main(String[] args){

        double nota1, nota2, média;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Informe sua segunda nota: ");
        nota2 = input.nextDouble();

        média = (nota1 + nota2) / (2);
        System.out.println("Sua média é de: " + média);

        if (média == 10){
            System.out.println("Aprovado com Distinção!");
        }else if (média >= 7 ) {
            System.out.println("Aprovado!");

        }else if(média < 7){
            System.out.println("Reprovado!");

        }

    }


}




