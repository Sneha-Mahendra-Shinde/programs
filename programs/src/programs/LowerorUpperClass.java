package programs;

public class LowerorUpperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch='a';
        if(ch>='a' && ch<='z') {
        	System.out.println(ch + " is a Lowercase Alphabet");
        }else if(ch>='A' && ch<='Z') {

        	System.out.println(ch + " is a Uppercase Alphabet");
        
        }else {

        	System.out.println(ch + " is not Alphabet");
        
        }
	}

}
