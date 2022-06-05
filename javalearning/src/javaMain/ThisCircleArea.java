package javaMain;

public class ThisCircleArea {

	public static void main(String[] args) {
		thisKeyword c1 = new thisKeyword(10f);
        System.out.println("area of circle = " + c1.area());

        thisKeyword c2 = new thisKeyword(20f);
        System.out.println("area of circle = " + c2.area());

        thisKeyword c3 = new thisKeyword(15f);
        System.out.println("area of circle = " + c3.area());
    }
}

class thisKeyword{
    public float radius;

    public thisKeyword(float radius) {
        this.radius = radius;
    }

    public float area(){
        return 3.141f * this.radius * this.radius;
    }
}
