import java.util.Scanner;

public class numerosT {
    
    public static void main (String[] args){
        double numero1, numero2, numero3;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextDouble();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("O maior número é o: " + numero1);

        }else if (numero2 >= numero1 && numero2 >= numero3){
            System.out.println("O maior número é o: " + numero2);

        }else if (numero3 >= numero2 && numero3 >= numero1)
            System.out.println("O maior número é o: " + numero3);

        
    }


}
