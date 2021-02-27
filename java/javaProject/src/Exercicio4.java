import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
	psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	o n�mero de pessoas calmas;
	o n�mero de mulheres nervosas;
	o n�mero de homens agressivos;
	o n�mero de outros calmos;
	o n�mero de pessoas nervosas com mais de 40 anos;
	o n�mero de pessoas calmas com menos de 18 anos.*/

		Scanner ler = new Scanner(System.in);
		
		
		int idade, contador = 1;
		int totalCalmos = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, totalNervosos40 = 0, totalCalmos18 = 0;
		char humor, genero, opcao = 's';
			
		while(contador <= 150) {
			System.out.println("Digite sua idade:");
			idade = ler.nextInt();
			System.out.println("Digite seu g�nero (1-feminino / 2-masculino / 3-Outros),:");
			genero = ler.next().toUpperCase().charAt(0);
			System.out.println("Como � seu temperamento? (1 - calmo / 2 - nervoso / 3 - agressivo)");
			humor = ler.next().charAt(0);
			
			if (humor == '1') {
				totalCalmos++;
			} if (humor == '2' && genero == '1') {
				mulheresNervosas++;
			} if(humor == '3' && genero == '2') {
				homensAgressivos++;
			} if(humor == '1' && genero =='3') {
				outrosCalmos++;
			} if(humor == '2' && idade >= 40) {
				totalNervosos40++;
			} if(humor == '1' && idade < 18) {
				totalCalmos18++;
			} 
			
			System.out.println("Continuar? S - sim / N - n�o: ");
			opcao = ler.next().toUpperCase().charAt(0);
			
			if(opcao == 'N') {
				break;
			}
			
			//soma 1 ao n� do la�o, se bate 150 sai do la�o
			contador++;
		
		}
		System.out.println("Pessoas calmas:" + totalCalmos);
		System.out.println("Mulheres nervosas:" + mulheresNervosas);
		System.out.println("Homens agressivos:" + homensAgressivos);
		System.out.println("Outros calmos:" + outrosCalmos);
		System.out.println("Total de nervosos acima de 40:" + totalNervosos40);
		System.out.println("Total de pessoas calmas abaixo de 18:" + totalCalmos18);
		
		ler.close();
	}

}
