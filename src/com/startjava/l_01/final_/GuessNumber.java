package com.startjava.l_01.final_;

public class GuessNumber {

    public static void main(String[] args) {
        final int min = 1;
        final int max = 100;
        int targetNumber = 100;
        int playerAnswer;
        int left = min;
        int right = max;
        int i = 0;

        do {
            playerAnswer = (left + right) / 2;
            if (playerAnswer > targetNumber) {
                System.out.println("����� " + playerAnswer +
                        " ������ ����, ��� ������� ��������� " + 
                        " left = " + left + " right = " + right);
                right = playerAnswer - 1;
            } else if (playerAnswer < targetNumber) {
                System.out.println("����� " + playerAnswer +
                        " ������ ����, ��� ������� ���������" +
                        " left = " + left + " right = " + right);
                left = playerAnswer + 1;
            }
            i++;
        } while(playerAnswer != targetNumber);
        System.out.println("\n�����, ������� ������� ���������: " + playerAnswer);
        System.out.println("�������: " + i);
    }
}