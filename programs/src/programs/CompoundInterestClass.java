package programs;

public class CompoundInterestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double p=1200,r=5.4,t=2;
     double CI=p*(Math.pow((1+r/100), t));
     System.out.println("Compound Interest is " + CI);
	}

}
