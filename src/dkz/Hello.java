package dkz;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		String str = "1;0;1;0;1;0;0;0;0";
		String[] number = str.split(";");
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numofX = 0;
		int numofO = 0;

		// �������
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = in.nextInt();
			}
		}

		// �����
		for (int i = 0; i < SIZE; i++) {
			numofX = 0;
			numofO = 0;
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j] == 1) {
					numofX++;
				} else {
					numofO++;
				}
			}
			if (numofX == SIZE || numofO == SIZE) {
				gotResult = true;
				break;
			}
		}

		// �����
		if (!gotResult) {
			for (int i = 0; i < SIZE; i++) {
				numofX = 0;
				numofO = 0;
				for (int j = 0; j < SIZE; j++) {
					if (board[j][i] == 1) {
						numofX++;
					} else {
						numofO++;
					}
				}
				if (numofX == SIZE || numofO == SIZE) {
					gotResult = true;
					break;
				}
			}
		}

		// ���Խ���
		if (!gotResult) {
			numofX = 0;
			numofO = 0;
			for (int i = 0; i < SIZE; i++) {
				if (board[i][i] == 1) {
					numofX++;
				} else {
					numofO++;
				}
			}
			if (numofX == SIZE || numofO == SIZE) {
				gotResult = true;
			}
		}

		// ��鷴�Խ���
		if (!gotResult) {
			numofX = 0;
			numofO = 0;
			for (int i = 0; i < SIZE; i++) {
				if (board[i][SIZE - i - 1] == 1) {
					numofX++;
				} else {
					numofO++;
				}
			}
			if (numofX == SIZE || numofO == SIZE) {
				gotResult = true;
			}
		}

		if (gotResult) {
			if (numofX == SIZE) {
				System.out.println("X��ʤ");
			} else if (numofO == SIZE) {
				System.out.println("O��ʤ");
			} else {
				System.out.println("ƽ��");
			}
		}
	}

}
