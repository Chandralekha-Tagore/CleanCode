package maven.scinterest;
import java.util.Scanner;

class ConstructionCost {

	ConstructionCost(double totalarea) // totalarea = Total Area of the House
	{
		Scanner sc = new Scanner(System.in);
		double totalcost;
		double squarefeet = totalarea*10.76; // Converting Area into Square Feet
		//"1.Standard Material 2.Above Standard Material 3.High Standard Material 4.High Standard Material and Fully Automated Home"
		int typeofhouse = sc.nextInt(); // Reading Type of House as given in above comment
		switch(typeofhouse)
		{
			// Construction Cost for Standard Material
			case 1 : totalcost = 1200 * squarefeet; 
				 break;

			// Construction Cost for Above Standard Material
			case 2 : totalcost = 1500 * squarefeet; 
				 break;

			// Construction Cost for High Standard Material
			case 3 : totalcost = 1800 * squarefeet; 
				 break;

			// Construction Cost for High Standard Material and Fully Automated Home
			case 4 : totalcost = 2500 * squarefeet; 
			         break;
			default: return;
		}
		sc.close();
	}

}
