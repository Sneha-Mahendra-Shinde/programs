package programs;

public class DivClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=121;
         if(n%5==0 && n%11==0) {  //to check divisible test of 5 & 11
        	 System.out.println("Number is divisible by 5 & 11");
         }
          else if(n%5==0) {                //to check divisible by 5
        	 System.out.println("Number is divisible by 5");
         }else if(n%11==0) {                               //to check divisibility of 11
        	 System.out.println("Number is divisible by 11");
         }
         else {
        	 System.out.println("Number is neither divisible by 5 nor 11");
         }
	}

}
