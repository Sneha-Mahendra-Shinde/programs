package programs;

public class AnglesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=100,b = 0, c= 80;
         int angle;
         angle=a+b+c;
         System.out.println(angle);
         if(angle==180 && a!=0 && b!=0 && c!=0) {
        	 System.out.println("Given triangle is valid");
         }else {
        	 System.out.println("Given triangle is not valid");

         }
	}

}
