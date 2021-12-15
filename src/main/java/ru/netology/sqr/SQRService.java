package ru.netology.sqr;

public class SQRService {

    public int calculateSqr(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= max) {
                if (i * i > min) {
                    count = count + 1;
                }
            }

        }
        return count;


    }
}
