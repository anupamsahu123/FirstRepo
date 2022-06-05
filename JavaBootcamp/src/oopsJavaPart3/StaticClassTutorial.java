package oopsJavaPart3;

class Student {
    String name;
    int rollNo;
    int classNo;
    int phoneNumber;
    Address address;

    public void ownFunction() {
        address.hello();
    }

    static class Address { // Inner class -> class inside a class
        String flatNo;
        int floorNo;
        String apptName;
        String street;
        String colony;
        String city;
        String state;
        int pincode;

        public void hello() {
            System.out.println("Hello");
        }
    }
}

public class StaticClassTutorial {
	   public static void main(String[] args) {
		   Student digesh = new Student();

	        digesh.name = "Digesh";
	        digesh.rollNo = 1;
	        digesh.classNo = 10;
	        digesh.phoneNumber = 9876543;

	        Student.Address addr = new Student.Address();
	        addr.flatNo = "SF-2";
	        addr.floorNo = 2;
	        addr.apptName = "Happy Home";
	        addr.street = "Mahatma Gandhi street";
	         addr.colony = "Nehru colony";
	        addr.city = "Ahmedabad";
	        addr.state = "Gujrat";
	        addr.pincode = 12345;
	    }
}
