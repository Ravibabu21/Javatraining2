package MethodsTopics;

public class MethodWithReturnType {
    static int car_topSpeed(){
        int topSpeed=365;
        return topSpeed;//method with returntype
    }
    static int addtwoNum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(car_topSpeed());
        System.out.println( addtwoNum(5,6));
    }
}
