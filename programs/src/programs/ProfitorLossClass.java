package programs;

public class ProfitorLossClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //float profit,loss;
      double sp=500,cp=200;
      if(cp-sp>0) {
    	  System.out.println("Loss " + (cp-sp));
    	  }else if(cp-sp<0) {
    	  System.out.println(" Profit " + (sp-cp));
      }else {
    	  System.out.println("Neutral");
      }
	}

}
