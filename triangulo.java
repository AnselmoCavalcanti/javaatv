import java.util.Scanner;

public class triangulo {
    public static void main(String[] args){
       double A, B, C ;
    
       Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do lado A do triangulo: ");
            A = input.nextDouble();
        System.out.println("Digite o valor do lado B do Triangulo: ");
            B = input.nextDouble();
        System.out.println("Digite o valor do lado C do Triangulo: ");
            C = input.nextDouble();

            if (verificarExistencia(A, B, C)){
                System.out.println("É possivel formar um triangulo!");
            }else {
                System.out.println("É impossivel formar um triangulo!");
            }  if (A == B && A == C && B == C){
                System.out.println("Você tem um triangulo Equilátero!" + "\nDe lados: " + A + ", " + B + ", "+ C);
            }  else if (A != B && A != C && B != C){
                 System.out.println("Você tem um triangulo Escaleno!" + "\nDe lados: " + A + ", " + B + ", "+ C);
            }   else if (A == B && B != C || A == C && A != B || B == C && A != B){
                 System.out.println("Você tem um triangulo Isósceles!" +"\nDe lados: " + A + ", " + B + ", "+ C);

            }
    }
        public static boolean verificarExistencia(double A, double B, double C){
            return (A < B + C) && (B < A + C) && (C < A +B);
        }
}

