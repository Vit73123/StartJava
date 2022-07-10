package com.startjava.l_02_03.animal;

public class Wolf {

    /* ���, ������, ���, �������, ����� */
    private String name;
    private char gender;
    private float weight;
    private int age;
    private String colour;

    /* ������������� */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("������: ������� �� ����� ���� ������ 8 ���");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    /* ������ */
    public void go() {
        System.out.println("���");
    }

    public void run() {
        System.out.println("�����");
    }

    public void howl() {
        System.out.println("����");
    }

    public void hunt() {
        System.out.println("��������");
    }
}