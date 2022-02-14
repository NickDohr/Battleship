import java.util.Scanner;

public class ShipPlacements
	{
		public static void shipDecisions()
		{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("Player 1, you have 4 board choices");
			System.out.println("Which option do you want to display");
			System.out.println("Option 1");
			System.out.println("Option 2");
			System.out.println("Option 3");
			System.out.println("Option 4");
			System.out.println("Option 5");
			System.out.println("Which one do you want to choose?");
			int choice = userIntInput.nextInt();
			if(choice == 1)
				{
			System.out.println("Here is option 1");
			Runner.checkBoard[0][1] = "X";
			Runner.checkBoard[0][2] = "X";
			Runner.checkBoard[0][3] = "X";
			Runner.checkBoard[0][4] = "X";
			Runner.checkBoard[0][5] = "X";
			
			Runner.checkBoard[6][0] = "X";
			Runner.checkBoard[7][0] = "X";
			Runner.checkBoard[8][0] = "X";
			Runner.checkBoard[9][0] = "X";
			
			Runner.checkBoard[2][9] = "X";
			Runner.checkBoard[3][9] = "X";
			Runner.checkBoard[4][9] = "X";
			Runner.checkBoard[5][9] = "X";
			
			Runner.checkBoard[2][3] = "X";
			Runner.checkBoard[2][4] = "X";
			Runner.checkBoard[2][5] = "X";
			
			Runner.checkBoard[6][5] = "X";
			Runner.checkBoard[6][6] = "X";
			Runner.checkBoard[6][7] = "X";
			
			Runner.checkBoard[8][5] = "X";
			Runner.checkBoard[8][6] = "X";
			Runner.displayBoard();
				}
			else if(choice == 2)
				{
					Runner.checkBoard[0][0] = "X";
					Runner.checkBoard[1][0] = "X";
					Runner.checkBoard[2][0] = "X";
					Runner.checkBoard[3][0] = "X";
					Runner.checkBoard[4][0] = "X";
					
					Runner.checkBoard[6][2] = "X";
					Runner.checkBoard[7][2] = "X";
					Runner.checkBoard[8][2] = "X";
					Runner.checkBoard[9][2] = "X";
					
					Runner.checkBoard[0][9] = "X";
					Runner.checkBoard[1][9] = "X";
					Runner.checkBoard[2][9] = "X";
					Runner.checkBoard[3][9] = "X";
					
					Runner.checkBoard[1][3] = "X";
					Runner.checkBoard[1][4] = "X";
					Runner.checkBoard[1][5] = "X";
					
					Runner.checkBoard[9][5] = "X";
					Runner.checkBoard[9][6] = "X";
					Runner.checkBoard[9][7] = "X";
					
					Runner.checkBoard[6][5] = "X";
					Runner.checkBoard[6][6] = "X";
					Runner.displayBoard();
				}
			else if(choice == 3)
				{
					Runner.checkBoard[0][1] = "X";
					Runner.checkBoard[0][2] = "X";
					Runner.checkBoard[0][3] = "X";
					Runner.checkBoard[0][4] = "X";
					Runner.checkBoard[0][5] = "X";
					
					Runner.checkBoard[2][5] = "X";
					Runner.checkBoard[2][6] = "X";
					Runner.checkBoard[2][7] = "X";
					Runner.checkBoard[2][8] = "X";
					
					Runner.checkBoard[4][6] = "X";
					Runner.checkBoard[4][7] = "X";
					Runner.checkBoard[4][8] = "X";
					Runner.checkBoard[4][9] = "X";
					
					Runner.checkBoard[4][1] = "X";
					Runner.checkBoard[4][2] = "X";
					Runner.checkBoard[4][1] = "X";
					
					Runner.checkBoard[7][5] = "X";
					Runner.checkBoard[7][6] = "X";
					Runner.checkBoard[7][7] = "X";
					
					Runner.checkBoard[9][5] = "X";
					Runner.checkBoard[9][6] = "X";
					Runner.displayBoard();
				}
			else if(choice == 4)
				{
					Runner.checkBoard[5][1] = "X";
					Runner.checkBoard[6][1] = "X";
					Runner.checkBoard[7][1] = "X";
					Runner.checkBoard[8][1] = "X";
					Runner.checkBoard[9][1] = "X";
					
					Runner.checkBoard[1][3] = "X";
					Runner.checkBoard[2][3] = "X";
					Runner.checkBoard[3][3] = "X";
					Runner.checkBoard[4][3] = "X";
					
					Runner.checkBoard[5][5] = "X";
					Runner.checkBoard[6][5] = "X";
					Runner.checkBoard[7][5] = "X";
					Runner.checkBoard[8][5] = "X";
					
					Runner.checkBoard[1][7] = "X";
					Runner.checkBoard[2][7] = "X";
					Runner.checkBoard[3][7] = "X";
					
					Runner.checkBoard[3][9] = "X";
					Runner.checkBoard[4][9] = "X";
					Runner.checkBoard[5][9] = "X";
					
					Runner.checkBoard[1][1] = "X";
					Runner.checkBoard[2][1] = "X";
					Runner.displayBoard();
				}
			else if(choice == 5)
				{
					Runner.checkBoard[5][4] = "X";
					Runner.checkBoard[6][4] = "X";
					Runner.checkBoard[7][4] = "X";
					Runner.checkBoard[8][4] = "X";
					Runner.checkBoard[9][4] = "X";
					
					Runner.checkBoard[1][2] = "X";
					Runner.checkBoard[2][2] = "X";
					Runner.checkBoard[3][2] = "X";
					Runner.checkBoard[4][2] = "X";
					
					Runner.checkBoard[7][6] = "X";
					Runner.checkBoard[7][7] = "X";
					Runner.checkBoard[7][8] = "X";
					Runner.checkBoard[7][9] = "X";
					
					Runner.checkBoard[1][7] = "X";
					Runner.checkBoard[2][7] = "X";
					Runner.checkBoard[3][7] = "X";
					
					Runner.checkBoard[3][9] = "X";
					Runner.checkBoard[4][9] = "X";
					Runner.checkBoard[5][9] = "X";
					
					Runner.checkBoard[1][0] = "X";
					Runner.checkBoard[2][0] = "X";
					Runner.displayBoard();
				}
		}
		}
	
