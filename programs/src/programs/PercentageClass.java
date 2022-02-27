package programs;

public class PercentageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double phy=25,chem=4,bio=40,math=22,computer=75;
           double per;
           per=((phy+chem+bio+math+computer)/500)*100;
           System.out.println(per);
           if(per>=90) {
        	   System.out.println("Grade A");
           }else if(per>=80) {
        	   System.out.println("Grade B");
           }else if(per>=70) {
        	   System.out.println("Grade C");
           }else if(per>=60) {
        	   System.out.println("Grade D");
           }else if(per>=40) {
        	   System.out.println("Grade E");
           }else {
        	   System.out.println("Grade F");
           }
	}

}
