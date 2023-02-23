package Java_Examples;

public class conditionalstmts_nestedSwitch {
	public static void main(String[] args) {
		//C - CSE, E - ECE, M - Mechanical  
		Character br1 = 'e';
		int collegeYear = 1;  
		switch(collegeYear){
		case 1:  
			System.out.println("English, Maths, Science");  
			break;  
		case 2:  
			switch(Character.toUpperCase(br1)){  
			case 'C':
				System.out.println("Operating System, Java, Data Structure");  
				break;  
			case 'E':  
				System.out.println("Micro processors, Logic switching theory");  
				break;  
			case 'M':  
				System.out.println("Drawing, Manufacturing Machines");  
				break;  
			}  
			break;  
		case 3:  
			switch(Character.toUpperCase(br1)){  
			case 'C':  
				System.out.println("Computer Organization, MultiMedia");  
				break;  
			case 'E':  
				System.out.println("Fundamentals of Logic Design, Microelectronics");  
				break;  
			case 'M':  
				System.out.println("Internal Combustion Engines, Mechanical Vibration");  
				break;  
			}  
			break;  
		case 4:  
			switch(Character.toUpperCase(br1)){  
			case 'C':  
				System.out.println("Data Communication and Networks, MultiMedia");  
				break;  
			case 'E':  
				System.out.println("Embedded System, Image Processing");  
				break;  
			case 'M':  
				System.out.println("Production Technology, Thermal Engineering");  
				break;  
			}  
			break;  
		}  
	}  
}
