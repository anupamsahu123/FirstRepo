package oopsJavaPart2;

class OwnCalculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public int add(int a, int b, int c, int d, int e) {
        return a+b+c+d+e;
    }
}

public class PolymorphismTutorial {
    public static void main(String[] args) {
        OwnCalculator obj = new OwnCalculator();
        System.out.println(obj.add(3,4)); // 7
        System.out.println(obj.add(5,6, 7)); // 18
        System.out.println(obj.add(7,8, 9, 10)); // 15
        System.out.println(obj.add(9,10, 11, 12, 13)); // 19
    }
}