import java.util.*;
public class ArrayListTester 
{

	public static void main(String[] args) 
	{
		try (//get number of words the array list will contain
		Scanner in = new Scanner(System.in)) {
			int num;
			System.out.println("Enter a number of words: ");
			num=in.nextInt();
			//construct an object of the array list words class
			ArrayListWords myWords = new ArrayListWords(num);
			myWords.run();
		}
		System.out.println("test");
	}

}
