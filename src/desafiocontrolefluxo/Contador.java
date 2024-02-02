
package desafiocontrolefluxo;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
                int parametroUm;
                int parametroDois;
		System.out.println("Digite o primeiro parâmetro: ");
		parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
                    System.out.println("ATENÇÃO!!!! O segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
                if(parametroUm > parametroDois) {
                    throw new ParametrosInvalidosException();
                }
		
                System.out.println("-----------------------------------");
               
		
                
                /*for (int contador = parametroUm; contador <= parametroDois; contador++){
                    System.out.println(contador);
                }*/
                
                int contagem = parametroDois - parametroUm;
                for (int contador = 1; contador <= contagem; contador++) {
                    System.out.println("Imprimindo o numero " + contador);
                }
	}
    
}
