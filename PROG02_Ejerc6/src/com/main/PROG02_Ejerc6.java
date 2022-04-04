package com.main;

class PROG02_Ejerc6 {
    public static void main(String[] args) {
        Dog dog1 = Dog.Bulldog;
        Dog dog2 = Dog.Caniche;
        Dog dog3 = Dog.Bulldog;

        System.out.println(dog1 == dog2);
        System.out.println(dog2 == dog3);
        System.out.println(dog1 == dog3);

        System.out.println(dog1.ordinal());
        System.out.println(dog2.ordinal());
        System.out.println(dog3.ordinal());
        System.out.println(Dog.values().length);
    }
}
