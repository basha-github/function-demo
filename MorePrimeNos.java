import java.util.Scanner;

public class MorePrimeNos {

	public static void main(String[] args) {

		int start=0,end=0;
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("enter range");
			start = sc.nextInt();
			end = sc.nextInt();
			for(int i=start;i<=end;i++) {
				if(isPrime(i) == true) {
					
					//System.out.print(i);
					if(checkNoHav3(i)== true) {
						System.out.print(i+" ");
					}
				}
			}
		
			
			System.out.println("\ndo u want to repeat");
			ch = sc.next().charAt(0);
			//if(ch == 'n') break;
		}while(ch != 'n');
		
		
		
			
		//System.out.println(p);
	}
	private static boolean checkNoHav3(int num) {
	
		// 107
		for(int r;num != 0;) {
			r = num % 10;
			num = num /10;
			if(r == 3) {
				return true;
			}
		}
		
		return false;
	}
	private static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0) count++;
		}
		if(count == 2) return true;
		else return false;
		//return count ==2?true:false;
	}

}
