package com.startjava.l_01.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. �������� ���������� � ����� �� �������� �� �������\n" +
                "-----------------------------------------------------");
        byte cpuCores = 12;
        System.out.println("CPU ���������� ����: " + cpuCores);
        float cpuFreq = 3.33F;
        System.out.println("CPU �������: " + cpuFreq + " ���");
        short ram = 8_192;
        System.out.println("����������� ������: " + ram + " ��");
        int vram = 24_569;
        System.out.println("�����������: " + vram + " ��");
        double hddTotal = 11158.2D;
        System.out.println("�������� ������������: " + hddTotal + " ��");
        boolean hasSoundCard = true;
        System.out.println("�������� ����� (���� / ���): " + hasSoundCard);
        System.out.println("\n�������������� ����������:");
        char grade = 'A';
        System.out.println("\n������ ������������������ A-F: " + grade);
        long anyData = 0L;
        System.out.println("�������������� ������: " + anyData);
    
        System.out.println("\n2. ������ ��������� ������ �� �������\n" +
                "-------------------------------------");
        float priceX = 100;
        float priceY = 200;
        System.out.println("����� ������ : " + ((priceX + priceY) * 0.11F));
        System.out.println("��������� ������� �� ������� : " + 
                ((priceX + priceY) * (1 - 0.11F)));

        System.out.println("\n3. ����� �� ������� ����� JAVA\n" +
                "------------------------------");
        System.out.println("   J    a  V     V  a" +
                "\n   J   a a  V   V  a a" +
                "\nJ  J  aaaaa  V V  aaaaa" +
                "\n JJ  a     a  V  a     a");

        System.out.println("\n4. ����������� min � max �������� �������� ����� ������\n" +
                "-------------------------------------------------------");
        byte varByte = Byte.MAX_VALUE;
        short varShort = Short.MAX_VALUE;
        int varInteger = Integer.MAX_VALUE;
        long varLong = Long.MAX_VALUE;
        System.out.println("���������� ���� byte: ");
        System.out.println("�������������� ��������: " + varByte);
        System.out.println("�������� ����� ����������: " + ++varByte);
        System.out.println("�������� ����� ���������� ����������: " + --varByte);
        System.out.println("\n���������� ���� short: ");
        System.out.println("�������������� ��������: " + varShort);
        System.out.println("�������� ����� ����������: " + ++varShort);
        System.out.println("�������� ����� ���������� ����������: " + --varShort);
        System.out.println("\n���������� ���� integer: ");
        System.out.println("�������������� ��������: " + varInteger);
        System.out.println("�������� ����� ����������: " + ++varInteger);
        System.out.println("�������� ����� ���������� ����������: " + --varInteger);
        System.out.println("\n���������� ���� long: ");
        System.out.println("�������������� ��������: " + varLong);
        System.out.println("�������� ����� ����������: " + ++varLong);
        System.out.println("�������� ����� ���������� ����������: " + --varLong);

        System.out.println("\n5. ������������ �������� ����������\n" +
                "-----------------------------------");
        float number1 = 1;
        float number2 = 2;
        float tmp = 0;
        System.out.println("������ 1 - � ������� ������� ����������:\n" +
                "�������� �������� ����������:\n" +
                "number1: " + number1 + "\n" +
                "number2: " + number2);
        tmp = number1;
        number1 = number2;
        number2 = tmp;
        System.out.println("����� �������� ����������:\n" +
                "number1: " + number1 + "\n" +
                "number2: " + number2);
        number1 = 1;
        number2 = 2;
        System.out.println("\n������ 2 - � ������� �������������� ��������:\n" +
                "�������� �������� ����������:\n" +
                "number1: " + number1 + "\n" +
                "number2: " + number2);
        number1 += number2;
        number2 = (float) (number1 - number2);
        number1 -= number2;
        System.out.println("����� �������� ����������:\n" +
                "number1: " + number1 + "\n" +
                "number2: " + number2);
        number1 = 1;
        number2 = 2;
        System.out.println("\n������ 3 - � ������� ��������� �������� ^:\n" +
                "�������� �������� ����������:\n" +
                "number1: " + number1 + "\n" +
                "number2: " + number2);
        number1 = (float) ((int) number1 ^ (int) number2);
        number2 = (float) ((int) number1 ^ (int) number2);
        number1 = (float) ((int) number1 ^ (int) number2);
        System.out.println("����� �������� ����������:\n" +
                "number1: " + number1 + "\n" +
                "number2: " + number2);

        System.out.println("\n6. ����� �������� � �� �����\n" +
                "----------------------------");
        char charCode1 = 35;
        char charCode2 = 38;
        char charCode3 = 64;
        char charCode4 = 94;
        char charCode5 = 95;
        System.out.println("��� ������� - ������" + "\n" +
                (int) charCode1 + "   " + charCode1 + "\n" +
                (int) charCode2 + "   " + charCode2 + "\n" +
                (int) charCode3 + "   " + charCode3 + "\n" +
                (int) charCode4 + "   " + charCode4 + "\n" +
                (int) charCode5 + "   " + charCode5);

        System.out.println("\n7. ������������ � ����� ���� �����\n" +
                "----------------------------------");
        int srcNumber = 345;
        byte digit1;
        byte digit2;
        byte digit3;
        System.out.println("�����: " + srcNumber);
        digit1 = (byte) (srcNumber % 10);
        digit2 = (byte) ((srcNumber % 100) / 10);
        digit3 = (byte) (srcNumber / 100);
        System.out.println("����� ����: " + (digit1 + digit2 + digit3));
        System.out.println("������������ ����: " + (digit1 * digit2 * digit3));

        System.out.println("\n8. ����� �� ������� ASCII-��� ����\n" +
                "----------------------------------");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        char underscore = '_';
        System.out.println("" + space + space + space + space + slash + backslash +
                space + space + space + space + '\n' +
                space + space + space + slash + space + space + backslash +
                space + space + space + '\n' +
                space + space + slash + underscore + openParenthesis + space +
                closeParenthesis + backslash + space + space + '\n' +
                space + slash + space + space + space + space + space + space +
                backslash + space + '\n' +
                slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n9. ����������� ���������� �����, �������� � ������ �����\n" +
               "--------------------------------------------------------");
        srcNumber = 123;
        System.out.println(srcNumber + " ��������: \n" +
                srcNumber / 100 + " �����\n" +
                (srcNumber % 100) / 10 + " ��������\n" +
                srcNumber % 10 + " ������\n");

        System.out.println("\n10. �������������� ������\n" +
                "--------------------------------------------------------");
        int totalSeconds = 86_399;
        System.out.println(totalSeconds + " ������: " + (totalSeconds / 3600) + ':' +
                ((totalSeconds % 3600) / 60) + ':' + (totalSeconds % 60));
    }
}