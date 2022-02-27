package programs;

public class LargestnumberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x=4,y=8,z=6;
        // int LargestNumber;
         int LargestNumber=(x>y)?(x>z?x:z):(y>z?y:z);
         System.out.println("MaxNumber " + LargestNumber);
	}

}
