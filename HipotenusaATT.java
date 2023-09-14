import java.util.Scanner;


public class HipotenusaATT{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double cateto, catetoOposto, catetoR, catetoOR, HipotenusaR, raiz;
        
            System.out.println("Informe o valor do cateto: ");
            cateto = input.nextDouble();
            
            System.out.println("Informe o valor do cateto oposto: ");
            catetoOposto = input.nextDouble();
        
             catetoR = Math.pow(cateto, 2);
             catetoOR = Math.pow(catetoOposto, 2);

             HipotenusaR = catetoR + catetoOR;
            raiz = Math.pow(HipotenusaR, 0.5);

            System.out.println("o valor final da hipotenusa é de: " + raiz);
        }

}
        
        
        