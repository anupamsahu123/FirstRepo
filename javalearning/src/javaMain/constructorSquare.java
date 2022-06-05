package javaMain;

public class constructorSquare {

	public static void main(String[] args) 
	{
        Square s1 = new Square(10f,10f);
        System.out.println("area of Square = " + s1.area());

        Square s2 = new Square(20f,20f);
        System.out.println("area of Square = " + s2.area());

        Square s3 = new Square(15f,15f);
        System.out.println("area of Square = " + s3.area());
    }
}

class Square{
    public float Length, Breath;

    public Square(float l, float b) {
    	Length = l;
    	Breath= b;
    }

    public float area(){
        return Length * Breath;
    }
}
