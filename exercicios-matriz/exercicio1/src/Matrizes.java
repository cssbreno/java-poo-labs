package exercicio1;

import java.util.Scanner;

public class Matrizes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] matriz = new int[m][n];

    int num = 0;

    // Preenchendo a matriz
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        num = sc.nextInt();
        matriz[i][j] = num;
      }
    }

    int search = sc.nextInt();

    for (int i = 0; i < m; i++) {
	      for (int j = 0; j < n; j++) {
	        if (search == matriz[i][j]) {
	          System.out.println("Position " + i + "," + j + ":");
			  if (j - 1 >= 0) {
	            System.out.println("Left: " + matriz[i][j - 1]);
	          }
			  if (j + 1 < n) {
	            System.out.println("Right: " + matriz[i][j+1]);
	          }
		        if (i - 1 >= 0) {
			        System.out.println("Up: " + matriz[i-1][j]);
		        }
		        if (i + 1 < m) {
				  System.out.println("Down: " + matriz[i+1][j]);
			  }
	        }
	      }
	    } sc.close();
	  }
	}