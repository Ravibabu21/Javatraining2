package ConstuctorTopics;

import org.checkerframework.checker.units.qual.C;

public class ConstructorProgram1 {
    public ConstructorProgram1(int y){ //this is parameterised constructor
        x=y;
    }
    int x;
    public static void main(String[] args) {
        ConstructorProgram1 jangam=new ConstructorProgram1(5);
        int num=jangam.x;
        System.out.println(num);


    }
}
