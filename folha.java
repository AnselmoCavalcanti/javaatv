import java.util.Scanner;

public class folha {
    public static void main(String[] args){
        // Não vou descontar o INSS já que não está no cabeçalho.
        Double VALORh, HORAt, SalarioB, Sin,SalarioL, FGTS, Descontos, IR;
        String IRISENTO;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor da sua hora: ");
        VALORh = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        HORAt = input.nextDouble();
            SalarioB = VALORh * HORAt;
            if(SalarioB <= 900){
                Sin = SalarioB * 0.03;
                IRISENTO = "ISENTO";    
                FGTS = SalarioB * 0.11;
                SalarioL = SalarioB - Sin;
                Descontos = Sin;
                    System.out.println("Salário Bruto: R$ " + SalarioB + "\nImposto de Renda: " + IRISENTO + "\nSindicato(3%)(-) : R$ " + Sin + "\nFGTS(11%): R$ " + FGTS + "\nTotal de descontos: R$ " + Descontos  + "\nSalário Liquido: R$ " + SalarioL);


            } else if (SalarioB > 900 && SalarioB <= 1500){
                Sin = SalarioB * 0.03;
                IR = SalarioB * 0.05;
                SalarioL = SalarioB - Sin - IR;
                FGTS = SalarioB * 0.11;
                Descontos = Sin + IR;
            
                    System.out.println("Salário Bruto: R$ " + SalarioB + "\nImposto de Renda(-)(5%): " + IR + "\nSindicato(3%)(-) : R$ " + Sin + "\nFGTS(11%): R$ " + FGTS + "\nTotal de descontos: R$ " + Descontos  + "\nSalário Liquido: R$ " + SalarioL);

            }else if (SalarioB > 1500 && SalarioB <= 2500){ 
                Sin = SalarioB * 0.03;
                IR = SalarioB * 0.1;
                SalarioL = SalarioB - Sin - IR;
                FGTS = SalarioB * 0.11;
                Descontos = Sin + IR;
                    System.out.println("Salário Bruto: R$ " + SalarioB + "\nImposto de Renda(-)(5%): " + IR + "\nSindicato(3%)(-) : R$ " + Sin + "\nFGTS(11%): R$ " + FGTS + "\nTotal de descontos: R$ " + Descontos  + "\nSalário Liquido: R$ " + SalarioL);

            }else if (SalarioB > 2500){

                Sin = SalarioB * 0.03;
                IR = SalarioB * 0.05;
                SalarioL = SalarioB - Sin - IR;
                FGTS = SalarioB * 0.1;
                Descontos = Sin + IR;
                     System.out.println("Salário Bruto: R$ " + SalarioB + "\nImposto de Renda(-)(5%): " + IR + "\nSindicato(3%)(-) : R$ " + Sin + "\nFGTS(11%): R$ " + FGTS + "\nTotal de descontos: R$ " + Descontos  + "\nSalário Liquido: R$ " + SalarioL);


            }
    }
}