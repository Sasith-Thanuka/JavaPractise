import java.util.Scanner; 
class Days {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Date number:");
		int selecetion = a.nextInt();
		
		if(selecetion ==1){	
		System.out.println("Monday");
		}
		else if(selecetion == 2){	
		System.out.println("Tuesday");
		}
		else if(selecetion == 3 ){	
		System.out.println("Wednesday");
		}
        else if(selecetion == 4 ){	
		System.out.println("Thursday");
		}
        else if(selecetion ==5 ){	
		System.out.println("Friday");
		}
        else if(selecetion == 6 ){	
		System.out.println("Saturday");
		}	
        else if(selecetion == 7 ){	
		System.out.println("Sunday");
	}	
	    else if(selecetion > 7 ){	
		System.out.println("Invalid");
		}
        else if(selecetion <0 ){	
		System.out.println("Invalid");		
	}
	}
}
	