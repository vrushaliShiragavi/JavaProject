package test;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print 1 to 10 using while loop		
				int num = 1;		
				while(num<11) {					
					System.out.println(num);
					num++;					
				}				
				System.out.println("End of first while loop");				
				
				//print 10 to 1 using while loop				
				int num1 = 10;
				
				while(num1>0) {
					if(num1==5) {						
						System.out.println("stop");
						num1--;
						break;	
					}
					System.out.println(num1);
					num1--;					
				}				
				System.out.println("End of second while loop");				

	}
}
