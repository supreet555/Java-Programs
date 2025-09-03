package projects;
import java.util.ArrayList;

public class BallsProgram {
	public static void main(String[] args) {

		// adding colors to bag
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Red");
		colors.add("Red");
		colors.add("Red");
		colors.add("Red");
		colors.add("PinkishRed");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Blue");
		colors.add("Zebra");
		colors.add("Black");
		
		// storing colors items in other container
		ArrayList<String> colorsCopy = new ArrayList<>(colors);
		
		// finding how many colors are there
		for(int i=0; i<colors.size(); i++) {
			for(int j=0; j<i; j++) {
				if(colors.get(i).equals(colors.get(j))) {
					colors.remove(i);
					i--;
				}
			}
		}
		
		// total colors
		System.out.println(colors+"\n");
		
		// counting balls
		for(int i=0; i<colors.size(); i++) {
			int count=0;
			for(int j=0; j<colorsCopy.size(); j++) {
				if(colors.get(i).equals(colorsCopy.get(j))) {
					count++;
				}
			}
			System.out.println(count+" "+colors.get(i)+" balls");
		}
	}
}

















































//// finding how many colors
//ArrayList<String> colors = new ArrayList<>();
//colors.add(bag.get(0)); // Red
//for(int i=0; i<bag.size(); i++) { 					
//	boolean equal = true;		  					
//	for(int j=0; j<colors.size(); j++) {			
//		if(bag.get(i).equals(colors.get(j))) {		
//			equal = true;
//		} else {
//			equal = false;
//		}
//	}
//	if(!equal) {										
//		colors.add(bag.get(i));									
//	}
//}
//
//System.out.println(colors);

//for(int i=0; i<bag.size(); i++) {
//	if(!bag.get(i).equals(colors.get(0))) {
//		colors.add(bag.get(i));
//		break;
//	}
//}
//for(int i=0; i<bag.size(); i++) {
//	if(!bag.get(i).equals(colors.get(0)) && !bag.get(i).equals(colors.get(1))) {
//		colors.add(bag.get(i));
//		break;
//	}
//}
//System.out.println(colors);
//
//// creating individual color bag containers
//ArrayList<String> red = new ArrayList<>();
//ArrayList<String> blue = new ArrayList<>();
//
//// counting how many colors for each bag
//for(int i=0; i<bag.size(); i++) {
//	if(bag.get(i).equals(colors.get(0))) {
//		red.add(colors.get(0));
//	} else {
//		blue.add(colors.get(1));
//	}
//}
//
//System.out.println("Total balls are: "+bag.size());
//System.out.println("Red balls are: "+red.size());
//System.out.println("Blue balls are: "+blue.size());

