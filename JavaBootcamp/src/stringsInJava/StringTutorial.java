package stringsInJava;

/*
1. str.length()
2. str.charAt(i)
3. str.contains(String tmp)
4. str.indexOf(char ch)
5. str.indexOf(char ch, int start)
6. str.indexOf(String tmp)
7. str.indexOf(String tmp, int start)
8. str.trim()
9. str.toUpperCase()
10. str.toLowerCase()
11. str.equals(str2) -> If 1, both strings are true 1->true and 0 as false
12. str.equalsIgnoreCase(str2)
13. str.replace(char source, char target)
14. str.replaceAll(String source, String target)
15. str.split(String source, int limit) limit>0 -> you are limiting number of splits
16. str.split(String source, int limit) limit<0 -> you are not limiting number of splits
17. str.split(String source, int limit) limit=0 -> split as many strings as possible and exclude last empty strings
 */



public class StringTutorial {
    public static void main(String[] args) {
      //  String school = "Sri Chaitanya School";
        
        // ith character is str.charAt(i)
     // str.length() is the length of the string
        /*
                for(int i=0; i<city.length(); i++) {
                    System.out.println(city.charAt(i));
                }
                System.out.println("lor present is " + city.contains("lor"));
                System.out.println("ABCD present is " + city.contains("ABCD"));
                System.out.println("Index of o is " + city.indexOf('o'));
                System.out.println(school);
                System.out.println(school.trim());
                String temp = "Hi, How are you?";
                System.out.println(temp.toLowerCase());
                System.out.println(temp.toUpperCase());
                String str1 = "Bangalore";
                String str2 = "Bangalore";
                String str3 = "bangalore";
                if(str1.equalsIgnoreCase(str3)) {
                    System.out.println("Both strings are equal");
                }
                else {
                    System.out.println("Both strings are not equal");
                }
                String name = "Nithin_Kumar_Munaga";
                System.out.println(name.replace('_', ' '));
    	String str = "My name was Nithin. My city was Vijayawada abcdwasbcda";
        System.out.println(str.replaceAll("was", "is"));
  */
        String str = "geekss@for@geekss";
        String[] arr = str.split("s", 0);
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
            
        }
      
    }
}
