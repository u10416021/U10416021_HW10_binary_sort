import java.util.*;

public class TestBinaryTree{
	//main
	public static void main(String[] args){
		//define the size of the array
		int []number = new int[20];
		//create a scanner 
		Scanner input = new Scanner(System.in);
		//let user input the number
		System.out.println("Please enter 20 numbers:");
		//use for loop to store the number
		for (int i = 0 ; i < 20 ; i++){
			number[i] = input.nextInt();
		}
		//create BinaryTree and pass the number that user input.
		BinaryTree bt = new BinaryTree(number);
		//call the display method in the BinaryTree class
		bt.display();
		System.out.println();
	}
	
}