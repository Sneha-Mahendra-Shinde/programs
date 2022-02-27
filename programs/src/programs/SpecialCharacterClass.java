package programs;

public class SpecialCharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          char ch='9';
          if((ch>='a'  && ch<='z')  || (ch>='A' && ch<='Z')) {
        	  System.out.println(ch + " is Alphabet");
          }else if(ch>='0' && ch<='9') {
        	  System.out.println(ch + " is Digit");

          }else {
        	  System.out.println(ch + " is a Special Character");

          }
	}

}
