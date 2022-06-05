package oopsJavaPart3;

class Students {
    String name;
    int rollNo;
    int classNo;
    int phoneNumber;
    Address address;

    class Address { // Inner class -> class inside a class
        String flatNo;
        int floorNo;
        String apptName;
        String street;
        String colony;
        String city;
        String state;
        int pincode;

        public void hello() {
            System.out.println("Hello, " + name);
        }
    }
}
public class InnerClassTutorial {
	  public static void main(String[] args) {
	        Students digesh = new Students();

	        digesh.name = "Digesh";
	        digesh.rollNo = 1;
	        digesh.classNo = 10;
	        digesh.phoneNumber = 9876543;
	/*
	        digesh.flatNo = "SF-2";
	        digesh.floorNo = 2;
	        digesh.apptName = "Happy Home";
	        digesh.street = "Mahatma Gandhi street";
	        digesh.colony = "Nehru colony";
	        digesh.city = "Ahmedabad";
	        digesh.state = "UP";
	        digesh.pincode = 12345;
 */
        Students.Address addr = digesh.new Address();
        addr.flatNo = "SF-2";
        addr.floorNo = 2;
        addr.apptName = "Happy Home";
        addr.street = "Mahatma Gandhi street";
        addr.colony = "Nehru colony";
        addr.city = "Ahmedabad";
        addr.state = "Gujrat";
        addr.pincode = 12345;

        addr.hello();
        digesh.address = addr;


    }
}
