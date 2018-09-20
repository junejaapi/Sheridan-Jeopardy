import java.util.ArrayList;

public class Draft {
	private ArrayList<Question> questions = new ArrayList<Question>();
	
	public ArrayList<Question> getQuestion() {
		return this.questions;
	}
	
	public void setQuestions(String c, int v, String q, String a1, String a2, String a3, String a4, String ca) {
		getQuestion().add(new Question(c,v,q,a1,a2,a3,a4,ca));
	}
	
	public void loadQuestions() {
		//Iron Man
		setQuestions("Iron Man", 100, "What is Iron Man's first name?", "Tony", "John", "Peter", "Stark", "Tony");
		setQuestions("Iron Man", 200, "What is the name of Iron Man's company?", "IronLTD", "Marvel Laboratories", "Stark Industries", "Military Machines R Us", "Stark Industries");
		setQuestions("Iron Man", 300, "Who play's Iron Man?", "Robert Downey Jr", "Jeff Bridges", "Howard Stark", "Tony Stark", "Robert Downey Jr");
		setQuestions("Iron Man", 500, "Who is Howard Stark?", "Tony's Son", "Tony's brother", "Tony's cousin", "Tony's dad", "Tony's dad" );
		setQuestions("Iron Man", 600, "Who is Jarvis?", "Tony's friend", "Tony's natural processing UI/AI", "I dont'know", "Tony's butler", "Tony's natural proccessing UI/AI");
		
		//Soccer
		setQuestions("Soccer", 100, "How many soccer balls are used in a regular game of soccer?", "Three", "one", "two", "five", "one");
		setQuestions("Soccer", 200, "When is a penalty kick given to the ofense?", "When the ball goes in the air at any place on the field", "When the goal keeper heads the ball", "When the ball touches the ground inside the penalty box", "When a foul is made by the defense in the penalty box", "When a foul is made by the defense in the penalty box");
		setQuestions("Soccer", 300, "When can the field players touch the ball with their hands?", "Never", "Always", "In the second half of the game", "In the first half of the game", "Never");
		setQuestions("Soccer", 400, "What happens when ball goes out of bounds?", "Play continues as if it didn't happen", "The ball gets put on the line where it went out and gets kicked in", "The ball goes to the goal keeper of who didn't kick it out", "The ball gets placed on the line and thrown in by the team that didn't kick it out of bounds", "The ball gets placed on the line and thrown in by the team that didn't kick it out of bounds");
		setQuestions("Soccer", 500, "What is the place where soccer is played called?", "Court", "Field", "Ice rink", "I don't Know", "Field");

		//Java
		setQuestions("Java", 100, "There are how many Primitive Data Types?", "2", "3", "4", "6", "6");
		setQuestions("Java", 200, "Wich of the following is not a Primitive Data Type?", "String", "int", "float", "double", "String");
		setQuestions("Java", 300, "The default value of an int is", "0", "null", "undefinded", "1", "0");
		setQuestions("Java", 400, "The default value for a String is", "''", "nothing", "undefined", "null", "''");
		setQuestions("Java", 500, "A variable is defined using a ?", "type and name", "type and value", "name and value", "just the name", "type and name");
		
		//Canada
		setQuestions("Canada",100,"Canada's birthday is on?","July 1st","July 4th","July 10th","July 5th","July 1st");
		setQuestions("Canada",200,"The population of Canada in 2015 was almost","almost 16 million","almost 26 million","almost 36 million","almost 46 million","almost 36 million");
		setQuestions("Canada",300,"The capital city of Canada is?","Montreal","Ottawa","Toronto","Vancouver","Ottawa");
		setQuestions("Canada",400,"The largest city in Canada is?","Quebec","Winnipeg","Toronto","Montreal","Quebec");
		setQuestions("Canada",500,"Canada has _____ provinces","5","10","13","11","10");
		
		//Food
		setQuestions("Food",100,"In what country would you find shish kebab as an everyday food?","Chile","China","Turkey","Japan","Turkey");
		setQuestions("Food",200,"What country is renowned for chocolate?","Belgium","Canada","United States","England","Belgium");
		setQuestions("Food",300,"What country does the word mocha come from?","Pakistan","Saudi Arabia","Tonga","Yemen","Yemen");
		setQuestions("Food",400,"Which of these countries is not a major producer of oranges?","United States","Brazil","Iceland","Italy","Iceland");
		setQuestions("Food",500,"Your body needs vitamins and minerals because ___________.","They give the body energy","they help carry out metabolic reactions","they insulate the body's organs","they withdraw heat from the body","they help carry out metabolic reactions");
	}
	
	
	
	
	
}
