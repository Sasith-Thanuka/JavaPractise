import java.util.Scanner; 
class GoOrNot {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the No.1 There is a rainy day:");
		int selecetion = a.nextInt();
		
		if(selecetion ==1){	
		System.out.println("I do not go to School.");
		}
		else {	
		System.out.println("I go to School.");
		}
	}
}