package com.main;

public class Main {
    public static void main(String[] args) {

        System.out.printf("\n------- Conversiones entre enteros y coma flotante -------\n");
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        double dx = 2.0;
        System.out.printf("Producto de int por float: j = i * x = %d\n", (int) (i * x));
        System.out.printf("Producto de float por double: dz = dx * y = %.1f\n", dx * y);

        System.out.printf("\n------- Operaciones con byte -------\n");
        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx - by);
        System.out.printf("byte: %d - %d = %d\n", bx, by, (byte) (bx - by));
        bx = -128;
        by = 1;
        System.out.printf("byte: %d - %d = %d\n", bx, by, (byte) (bx - by));
        System.out.printf("(int) (%d - %d) = %d\n", bx, by, (bx - by));

        System.out.printf("\n------- Operaciones con short -------\n");
        short sx = 5;
        short sy = 2;
        System.out.printf("short: %d - %d = %d\n", sx, sy, (short) (sx - sy));
        sx = 32767;
        sy = 1;
        System.out.printf("short: %d + %d = %d\n", sx, sy, (short) (sx + sy));

        System.out.printf("\n------- Operaciones con chars -------\n");
        char cx = '\u000F';
        char cy = '\u0001';
        System.out.printf("char: %c - %c = %d\n", cx, cy, (int) (cx - cy));
        System.out.printf("char(0x%04X) - %d = %d\n", (int) cx, (int) cy, (int) (cx - cy));

        cx = '\uFFFF';
        System.out.printf("(int) (%c) = %d\n", cx, (int) cx);
        System.out.printf("(short) (%c) = %d\n", cx, (short) cx);
        sx = -32768;
        System.out.printf("%d short-char-int = %d\n", sx, (int)(char)(short) sx);
        sx = -1;
        System.out.printf("%d short-char-int = %d\n", sx, (int)(char)(short) sx);




    }
}
