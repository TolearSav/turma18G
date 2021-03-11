package APLICACAO;

import java.util.InputMismatchException;
import java.util.Scanner;

import CLASSES.ContaCorrenteTeste;

public class TesteContaCorrente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        ContaCorrenteTeste conta1 = new ContaCorrenteTeste();

        double[] valor = new double[10];
        char opcao1, opcao2 = 'N', opcao3 = 'N';
        int x = 0;

        System.out.println("Saldo atual: " + conta1.getSaldo());
        
        for(x = 0; x < valor.length; x++) { 
        	System.out.println("TRANSACAO: "+ (x + 1));
            System.out.println();
            try {
            System.out.print("Digite o valor: ");
            valor[x] = leia.nextDouble();
            System.out.println();
            } catch (InputMismatchException erro) {
            	System.out.println("Voc� digitou uma letra ao inv�s de n�mero!");
            }
            // validacao entrada
            do {
            	System.out.print("D�bito ou cr�dito? D/C ");
                opcao1 = leia.next().toUpperCase().charAt(0);
                
                if(opcao1 != 'D' && opcao1 != 'C') {
                	System.out.println("Opcao invalida!");
                }
            	
            }while(opcao1 != 'D' && opcao1 != 'C');
            
            System.out.println();
            
            if (opcao1 == 'D') {
                conta1.debito(valor[x]);
                
                System.out.print("Deseja continuar? S/N ");
                opcao2 = leia.next().toUpperCase().charAt(0);
                System.out.println();
                
            } else if (opcao1 == 'C') {
                conta1.credito(valor[x]);
                
             do {
            	 
                System.out.print("Deseja continuar? S/N ");
                opcao2 = leia.next().toUpperCase().charAt(0);
                System.out.println();
                
                if(opcao2 != 'S' && opcao2 != 'N') {
                	System.out.println("Opcao invalida!");
                }
            	
              } while(opcao2 != 'S' && opcao2 != 'N');
                
            } 
            
            if (opcao2 == 'N') {
            
            do {
            	System.out.print("Deseja solicitar um cheque? S/N ");
                opcao3 = leia.next().toUpperCase().charAt(0);
                System.out.println();
                
                if(opcao3 != 'S' && opcao3 != 'N') {
                	System.out.println("Opcao invalida!");
                }
            	
            } while(opcao3 != 'S' && opcao3 != 'N');
                
            } 
            
            if(opcao3 == 'S') {
                conta1.pedeTalao();
                System.out.println("Tal�es pedidos ate o momento: "+ conta1.getContadorTalao());
                    
            } else if(opcao3 == 'N') {
                System.out.println("Saldo Atual: " + conta1.getSaldo());
                System.out.println();
                
            }
                
        }
        
        // Validacao cheque
    	do{
        	System.out.println("Voc� atingiu o limite de transa��es mensais. Deseja solicitar um cheque? S/N");
            opcao3 = leia.next().toUpperCase().charAt(0);
            
            if(opcao3 == 'S' && conta1.getContadorTalao() < 3) {
                conta1.pedeTalao();
                System.out.println("Tal�es pedidos at� o momento: "+ conta1.getContadorTalao());
                    
            } else {
                System.out.println("Saldo Atual: " + conta1.getSaldo());
                opcao3 = 'N';
            }
    		
    	} while(opcao3 != 'N');
	}
	
}