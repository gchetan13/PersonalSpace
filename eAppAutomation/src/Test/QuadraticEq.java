package Test;

public class QuadraticEq {

	public static void main(String[] args) {
		double input1 =2;
		double input2=4;
		double input3=1;
		 
		double[] result = new double[2];
		
		double temp =  Math.sqrt(input2*input2-4*input1*input3);
		System.out.println(temp);
		result[0]=   (-input2+temp)/(2*input1);
		result[1]=  (-input2-temp)/(2*input1);
		
		
		
		result[0]=Math.round(result[0]*1000.0)/1000.0;
		result[1]=Math.round(result[1]*1000.0)/1000.0;
		
		
		
		
		
		System.out.println(result[0]+" "+result[1]);
		
		
		
		
		
		//System.out.println(Math.round(result[0]*1000.0)/1000.0+" "+Math.round(result[1]*1000.0)/1000.0);
		
		
		
		
		
		
		//return result;
	
	}

}
