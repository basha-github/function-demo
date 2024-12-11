
public class Type4 {

	
	static float convertCurrency(String country){
		float res =0;
		if(country.contentEquals("USA")) {
			res= 83.45f;
		}
		else if(country.contentEquals("UK")) {
			res= 120.45f;
		}
		else if(country.contentEquals("Canada")) {
			res= 67.45f;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
	
	
		int dollar = 100;
		float rupees;
		rupees = convertCurrency("USA") * dollar;
		System.out.println(rupees);
		rupees = convertCurrency("USA") * dollar;
		System.out.println("USA to India  "+rupees);
	    rupees = convertCurrency("UK") * dollar;
	    System.out.println("UK to India  "+rupees);
	    
		
		
	}

}
