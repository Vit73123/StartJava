package com.startjava.l_02_03.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "windows-1251");
        Calculator calc = new Calculator();
        String yesNo = "��";

        do {
            if (yesNo.equals("��")) {
                System.out.print("������� ������ �����: ");
                calc.setNum1(scan.nextInt());
                System.out.print("������� ���� �������������� ��������: ");
                calc.setSign(scan.next().charAt(0));
                System.out.print("������� ������ �����: ");
                calc.setNum2(scan.nextInt());
                calc.calculate();
            }
            System.out.print("������ ���������� ����������? [��/���]: ");
            yesNo = scan.next();
            System.out.println("\'" + yesNo + "\'");
        } while (!yesNo.equals("���"));
    }
}