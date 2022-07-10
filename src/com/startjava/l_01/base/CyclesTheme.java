package com.startjava.l_01.base;

public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n1. ������� ����� ������ � �������� �����\n" +
                "----------------------------------------");            
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if ((counter % 2) == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("� ���������� [-10, 21] ����� ������ ����� = " + sumEven +
                ", � �������� = " + sumOdd);

        System.out.println("\n2. ����� ����� � ��������� ����� (max � min)\n" +
                "--------------------------------------------");            
        int min = 10;
        int max = -1;
        if (min > max) {
            max += min;
            min = max - min;
            max -= min;
        }
        if (max < 5) {
            max = 5;
        } else if (min > 5) {
            min = 5;
        }
        int i;
        for (i = max - 1; i > min; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. ����� ������������ ����� � ����� ��� ����\n" +
                "--------------------------------------------");            
        int srcNumber = 1234;
        int reverseNumber = 0;
        int digit;
        int sumDigits = 0;
        while (srcNumber > 0) {
            digit = srcNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            sumDigits += digit;
            srcNumber /= 10;
        }
        System.out.println("�������� ����� � �������� �������: " + reverseNumber + "\n" +
                "����� �����: " + sumDigits);

        System.out.println("\n4. ����� ����� �� ������� � ��������� �����\n" +
                "-------------------------------------------");
        for (i = 1; i < 24; i += 2) {
            if (((i - 1) % (5 * 2)) == 0) {
                System.out.print('\n');
            }
            System.out.printf("%3d", i);
        }
        while (((i - 1) % (5 * 2)) != 0 ) {
            System.out.printf("%3d", 0);
            i += 2;
        }

        System.out.println("\n\n5. �������� ���������� ������ �� ��������\n" +
                "-----------------------------------------");
        srcNumber = 3_141_591;
        int temp = srcNumber;
        int numOnes = 0;
        String msgOnesParity = " (������) ";
        while (temp > 0) {
            if ((temp % 10) == 1) {
                numOnes++;
            }
            temp /= 10;
        }
        if ((numOnes % 2) != 0) {
            msgOnesParity = "(��������)";
        }
        System.out.printf("����� %,d �������� %d %s ���������� ������%n",
                srcNumber, numOnes, msgOnesParity);

        System.out.println("\n6. ����������� ����� � �������\n" +
                "------------------------------");
        System.out.println();
        for (i = 5; i > 0; i--) {
            System.out.println ("*".repeat(10));
        }
        System.out.println(); 
        i = 5;
        while (i > 0) {
            System.out.println ("#".repeat(i--));
        }
        System.out.println(); 
        i = 5;
        int j = 1;
        do {
            System.out.println("$".repeat(j));
            if (i > 3) {
                j++;
            } else {
                j--;
            }
            i--;
        } while (i > 0);

        System.out.println("\n7. ����������� ASCII-��������\n" +
                "-----------------------------");
        System.out.printf("%5s%5s\n", "Dec", "Char");
        char c;
        for (c = 0; c < '0'; c++) {
            if ((c % 2) != 0) {
                System.out.printf("%5d%5c\n", (int) c, c);
            }
        }
        System.out.println();
        for (c = 'a'; c <= 'z'; c++) {
            if ((c % 2) == 0) {
                System.out.printf("%5d%5c\n", (int) c, c);
            }
        }

        System.out.println("\n8. ��������, �������� �� ����� �����������\n" +
                "------------------------------------------");
        srcNumber = 1234321;
        temp = srcNumber;
        reverseNumber = 0;
        digit = 0;        
        while (temp > 0) {
            digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            temp /= 10;
        }
        System.out.print("����� " + srcNumber);
        if (srcNumber == reverseNumber) {
            System.out.println(" �������� �����������");
        } else {
            System.out.println(" �� �������� �����������");
        }

        System.out.println("\n9. �����������, �������� �� ����� ����������\n" +
                "--------------------------------------------");
        srcNumber = 323323;
        temp = srcNumber;
        sumDigits = 0;        
        int positionPow = 10;
        while (temp > 0) {
            if (temp / positionPow > 0) {
                sumDigits += temp % 10;
            } else {
                sumDigits -= temp % 10;
            }
            positionPow *= 10;
            temp /= 10;
        }
        if (sumDigits == 0) {
            System.out.println("����� " + srcNumber + " ����������");
        } else {
            System.out.println(srcNumber + " - ������� �����");
        }

        System.out.println("\n10. ����� ������� ��������\n" +
                "--------------------------");
        System.out.print("   ������� ��������\n" + "  " + "?");
        for (i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n" + "?".repeat(2) + "?" + "?".repeat((9 - 1) * 3));
        j = 1;
        for (i = 0; i < (9 - 2 + 1) * 10; i++) {
            if (i % 10 == 0) {
                i += 2;
                j++;
                System.out.print("\n" + j + " " + "?");
            }
            System.out.printf("%3d", i % 10 * j);
        }
   }
}