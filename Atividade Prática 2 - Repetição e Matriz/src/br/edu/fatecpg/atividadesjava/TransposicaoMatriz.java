package br.edu.fatecpg.atividadesjava;
import java.util.Scanner;

public class TransposicaoMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];

		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.println("Insira o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
				matriz[l][c] = scan.nextInt();
			}
		}
		
		int[][] matrizTransposta = new int[3][3];
		
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				matrizTransposta[y][x] = matriz[x][y];
			}
		}
		
		for(int l=0; l<3; l++) {
			System.out.print(matrizTransposta[l][0] + " ");
			System.out.print(matrizTransposta[l][1] + " ");
			System.out.print(matrizTransposta[l][2] + " ");
			System.out.println();
		}
		
		
		
	}

}
