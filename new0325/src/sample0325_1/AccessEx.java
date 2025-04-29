package sample0325_1;

import test0325_2.Sample2;

public class AccessEx {
    public static void main(String[] args) {
        Sample2 aa = new Sample2();
        Sample bb = new Sample();
        bb.a =10;
        bb.c =20;
        aa.a =10;
        aa.c =20;
    }
}
