package com.startjava.l_02_03.person;

public class Person {
    char gender = '�';
    String name = "������";
    float height = 180F;
    float weight = 93.5F;
    int age = 23;

    void go(double distance) {
        System.out.println("��� " + distance + " ����������");
    }

    void sit(double time) {
        System.out.println("���� " + time + " �����");
    }

    void run(double distance) {
        System.out.println("���� " + distance + " ����������");
    }

    void speak(String words) {
        System.out.println("������ " + words);
    }

    void learnJava() {
        System.out.println("��� Java");
    }
}