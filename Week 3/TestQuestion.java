import java.util.*;

class TQManager {
	public static void main(String args[])
	{
		int no_of_questions ;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the No of Questions:");
		no_of_questions=S.nextInt();
		TestQuestion[] questions = new TestQuestion[no_of_questions];
		int option;
		for(int i=0;i<no_of_questions;i++){
			System.out.println("Enter\t1:SA\t2:LA\t3:MCQ\nOption:");
			option = S.nextInt();
			S.nextLine();
			switch(option){
				case 1:questions[i]= new ShortAnswers();
						questions[i].readQuestion(S);
						break;
				case 2:questions[i]= new LongAnswers();
						questions[i].readQuestion(S);
						break;
				case 3:questions[i]= new MCQ();
						questions[i].readQuestion(S);
						break;
				default:System.out.println("Invalid Option\n");
			}
			
		}
		System.out.println("\n\nThe Question Paper:\n");
		for(int i=0;i<no_of_questions;i++){
			System.out.println(questions[i].toString());
		}
	}
}

abstract class TestQuestion {
	String question;
	abstract void readQuestion(Scanner S);
}

class ShortAnswers extends TestQuestion {
	int numLines =1;
	public void readQuestion(Scanner S){
		System.out.println("Enter the Question:");
		question= S.nextLine();
	}
	public String toString(){
		String statment=" " ;
		statment+="ShortAnswer Question:"+question;
		statment+="\nnumLines:"+numLines;
		return statment+"\n\n";
	}
}

class LongAnswers extends TestQuestion {
	int numLines;
	public void readQuestion(Scanner S){
		System.out.println("Enter the Question:");
		question= S.nextLine();
		System.out.println("Enter the numLines:");
		numLines= S.nextInt();
	}
	public String toString(){
		String statment=" " ;
		statment+="LongAnswer Question:"+question;
		statment+="\nnumLines:"+numLines;
		return statment+"\n\n";
	}
}
class MCQ extends TestQuestion {
	int numChoices;
	String[] options;
	public void readQuestion(Scanner S){
		System.out.println("Enter the Question:");
		question= S.nextLine();
		System.out.println("Enter the no of options:");
		numChoices= S.nextInt();
		S.nextLine();
		options = new String[numChoices];
		for(int i=0;i<numChoices;i++){
			System.out.println("Enter option number"+(i+1));
			options[i] = S.nextLine();
		}
	}
	public String toString(){
		String statment=" " ;
		statment+="MCQ Question:"+question;
		statment+="\nnum of options :"+numChoices+"\n";
		for(int i=0;i<numChoices;i++){
			statment+="option "+(i+1)+" : "+options[i]+"\n";
		}
		return statment+"\n\n";
	}
}