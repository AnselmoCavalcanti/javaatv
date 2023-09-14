import java.util.Scanner;

public class ContaC {

    public static void main(String[] args) {    
        double saldo = 0.0;
        String sairR;
        String sim = "sim";
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Selecione sua operação:\n1 - Deposito\n2 - Saque\n3 - Saldo\n0 - Sair ");
        int operação = input.nextInt();

        
        if(operação ==1 ) {

            System.out.println("Digite a quantia que você deseja depositar: ");
            double depositor = input.nextDouble();
            saldo += depositor;
            System.out.println("Você depositou: "+ depositor + " reais");
        }else if (operação > 3){ 
            System.out.println("Comando Invalido.");        
        }else if (operação == 2){
            if (saldo > 0){

            
            double sacar, grana, taxação;
            double taxa = 0.005;
            System.out.println("Digite a quatia a ser sacada: ");
            sacar = input.nextDouble();
            if (sacar <= saldo){
            taxação = sacar * taxa;
            grana = sacar - taxação;
            saldo -= sacar;
            System.out.println("Você sacou: " + sacar + " reais");
            System.out.println("Valor após a taxa: " + grana + " reais");
            
            }
            }
        }else if (operação == 3  ){

            System.out.println("Seu saldo é de: " + saldo);
        }
        
        if (operação == 0){

            
            System.out.println("Confirme que você deseja sair. (sim)");
             sairR = input.next();
             if (sairR.equalsIgnoreCase("sim")) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção Inválida.");
            } 
    
        }
    }
}
    
}
    
    
    
    
             
            
           
        

    
