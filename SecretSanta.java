import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecretSanta {
	
	public static String end = "False";
	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<String> scrambledNames = new ArrayList<String>();
	
	
	static void nameMatch(ArrayList<String> names){
		scrambledNames.clear();
		//System.out.println("Scrambled names = " + scrambledNames);
		for(int i = 0; i< names.size();i++){
			scrambledNames.add(names.get(i));
			}
		
		Collections.shuffle(scrambledNames);
		
		//System.out.println("Scrambled names = " + scrambledNames);
		//System.out.println("Names = " + names);
		
		for(int i = 0; i<names.size();i++){
			if(scrambledNames.get(i)==names.get(i)){
				nameMatch(names);
			}
			else{
				continue;
			}	
		}
	}
	
	
	public static void main(String[] args){
			
		Scanner scanner =  new Scanner(System.in);
		while(true){
			System.out.println("Enter in the name of someone in your secret santa if done adding names type 'Done'");
			String input   =  scanner.next();
			if (input.equals("Done")){
				break;
			}
			else {
				names.add(input);
			}
		System.out.println(names);
		
		}
		nameMatch(names);
		System.out.println("");
		System.out.println("Welcome to the Secret Santa name Scramble! Here are your results:");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		for(int j = 0; j < names.size(); j++){
		System.out.println(names.get(j)+" will buy presents for " + scrambledNames.get(j));
		
		scanner.close();
		}
	}
}
