package com.startjava.l_02_03.guess;

import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "windows-1251");

        System.out.print("\n������� ��� ������ 1: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("������� ��� ������ 2: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String yesNo = "��";
        do {
            if (yesNo.equals("��")) {
                guessNumber.play();
            }
            System.out.print("\n����� ���� [��/���]? ");
            yesNo = scan.nextLine();
        } while (!yesNo.equals("���"));
    }
}