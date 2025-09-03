package br.edu.fatecpg.atividadesjava;
import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int aux = 0;
		Scanner scan = new Scanner(System.in);

		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.println("PRIMEIRA MATRIZ | Insira o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
				matriz1[l][c] = scan.nextInt();
			}
		}
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.println("SEGUNDA MATRIZ | Insira o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
				matriz2[l][c] = scan.nextInt();
			}
		}
		
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				aux = aux + (matriz1[x][y] + matriz2[x][y]);
			}
		}
		
		System.out.println("Soma das duas matrizes: " + aux);

	}

}
