package com.startjava.l_02_03.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("������");
        wolf.setGender('�');
        wolf.setWeight(38.5f);
        wolf.setAge(15);
        wolf.setColour("�����");

        System.out.println("����\n----\n" +
                "���: " + wolf.getName() + '\n' +
                "���: " + wolf.getGender() + '\n' +
                "���: " + wolf.getWeight() + '\n' +
                "�������: " + ((wolf.getAge() > 0) ? wolf.getAge() : "������\n") +
                "�����: " + wolf.getColour() + '\n');
        wolf.go();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}