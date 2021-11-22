import java.util.*;
public class ArrayListWords 
{
	//identify global variables
	private ArrayList<String>words;
	private int numWords;
	Scanner in = new Scanner(System.in);//strings
	Scanner in2 = new Scanner(System.in);//ints
	Random rand = new Random();
	private String guess;
	private String uGuess;
	private int choice;
	double points=300;
	//constructor
	public ArrayListWords(int n)
	{
		numWords=n;
		words=new ArrayList<String>();
		guess="";
		uGuess="";
	}
	////////////////////////////////////
	//load words into the array list
	public void loadWords()
	{
		for(int i = 0;i<numWords;i++)
		{
			System.out.println("Enter a word: ");
			words.add(in.nextLine());
		}
	}
	//////////////////////////////////////
	public void print()
	{
		for(String word:words)
		{
			System.out.print(word+" | ");
		}
		System.out.println(" ");
	}
	///////////////////////////////////////
	public void getRandomWord()
	{
		int pos=rand.nextInt(numWords);
		guess=words.get(pos);
		System.out.println(guess);
		//ask and get user guess
		System.out.println("Enter your guess: ");
		uGuess=in.nextLine();
		//compare for correctness
		if(uGuess.equals(guess))
		{
			System.out.println("Correct you get 100 points!");
			
		}
		else
		{
			System.out.println("Better luck next time");
		}
		System.out.println("The word is "+guess);
	}
	/////////////////////////////////////////////// 
	public void run()
	{
		
		menu();
		while(choice==1)
		{
			loadWords();
			print();
			getRandomWord();
			menu();
			
		}
		if(choice==2)
		{
			System.out.println("Goodbye!");
		}
		else
		{
			System.out.println("Incorrect");
		}
	}
	public void menu() 
	{
		System.out.println("1. Play game");
		System.out.println("2. Exit");
		choice=in2.nextInt();
	}

}
