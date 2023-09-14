import java.util.Scanner;
import java.text.DecimalFormat;;
public class Salario{
    public static void main(String[] args){
        double B, b, c, C, d, D, e, E, operação;
        DecimalFormat formato = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        operação = input.nextDouble();

        if (operação <= 280 ){
            b = operação * 0.2;
            B = b + operação;
            System.out.println("Seu salário padrão: R$ " + operação + "\nO percentual de aumento aplicado foi de 20%" + "\nO valor do aumento: R$  " + formato.format(b) + "\nSeu novo salário após o aumento: R$ " + B);
        } else if (operação >= 280 && operação <= 700){
            c = operação * 0.15;
            C = c + operação;
            System.out.println("Seu salário padrão: R$ " + operação + "\nO percentual de aumento aplicado foi de 15%" + "\nO valor do aumento: R$  " + formato.format(c) + "\nSeu novo salário após o aumento: R$ " + C);
        } else if ( operação >= 700 && operação <= 1500 ){
            d = operação * 0.1;
            D = d + operação;
            System.out.println("Seu salário padrão: R$ " + operação + "\nO percentual de aumento aplicado foi de 10%" + "\nO valor do aumento: R$  " + formato.format(d) + "\nSeu novo salário após o aumento: R$ " + D);

        } else if (operação > 1500){
            e = operação * 0.05;
            E = e + operação;
            System.out.println("Seu salário padrão: R$ " + operação + "\nO percentual de aumento aplicado foi de 5%" + "\nO valor do aumento: R$  " + formato.format(e) + "\nSeu novo salário após o aumento: R$ " + E);
        }
    }
}