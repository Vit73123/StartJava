package com.startjava.l_01.base;

import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Write once, run anywhere");
        System.out.println("������ �������, �������� �����");
        Scanner console = new Scanner(System.in, "windows-1251");
        System.out.print("������� ��� ���: ");
        System.out.println(console.nextLine());
    }
}