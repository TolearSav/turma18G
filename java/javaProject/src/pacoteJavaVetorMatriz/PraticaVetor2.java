package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String [] nome = new String[4];
		double[] nota1 = new double[4];
		double[] nota2 = new double[4];
		double[] media = new double[4];
		double somaMedia = 0, mediaTurma;
		int infos, totalAlunosAcima = 0;
		
		for(infos = 0; infos < 3; infos++) {
            System.out.println("Aluno: " + infos);
            System.out.println("Digite o nome: ");
            nome[infos] = leia.next();
            System.out.println("Nota 1: ");
            nota1[infos] = leia.nextDouble();
            System.out.println("Nota 2: ");
            nota2[infos] = leia.nextDouble();
            media[infos] = (nota1[infos] +  nota2[infos]) / 2;
            somaMedia = somaMedia + media[infos];
        }
		
		mediaTurma = somaMedia / 4;
		System.out.println("LISTAGEM DE ALUNOS");
		for(infos = 0; infos < 4; infos++) {
			System.out.println(nome[infos] + " "+ media[infos]);
			if(media[infos] > mediaTurma) {
				totalAlunosAcima++;
			}
		}
		System.out.println("Ao todo temos: " + totalAlunosAcima + " alunos acima da média da turma, que é: " + mediaTurma);
		leia.close();
	}

}
