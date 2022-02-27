package programs;

public class MonthClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        int month=1;
        if(month==1 || month==3 || month==5 ||month==7 || month==9 ||month==11) {
      	  System.out.println("31 Days in this month");
        }else if(month==4 || month==6 || month== 8 ||month==10 || month==10) {
        	System.out.println("30 Days in this month");
        }else if(month==2) {
        	System.out.println("Either 28 or 29 days in this month");
        }
        else {
      	  System.out.println("Please enter weekdays between 1-12");
        }
	}

}
