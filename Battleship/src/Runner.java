import java.util.Scanner;
//runner class
public class Runner
	{
		public static int row;
		public static int col;
		public static String [][] checkBoard = new String [10][10];
		public static void main(String[] args)
			{
			fillBoard();
			decisionRunner();
			//shipDecisions();
			}
		public static void fillBoard()
		{
			for (int row = 0; row < checkBoard.length; row++)
				{
					   for (int col = 0; col < checkBoard[0].length; col++)
						   {
							   checkBoard[row][col] = " ";
						   }
				}
			
			
		}
		
		public static void displayBoard()
		{
			System.out.println("     1     2     3     4     5     6     7     8     9     10");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("A |  " + checkBoard[0][0] + "  |  " + checkBoard [0][1] + "  |  "  + checkBoard [0][2] + "  |  " + checkBoard [0][3] + "  |  " + checkBoard [0][4] + "  |  " + checkBoard [0][5] + "  |  ");
			System.out.println( checkBoard[0][6] + "  |  " + checkBoard [0][7] + "  |  "  + checkBoard [0][8] + "  |  " + checkBoard [0][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("B |  " + checkBoard[1][0] + "  |  " + checkBoard [1][1] + "  |  "  + checkBoard [1][2] + "  |  " + checkBoard [1][3] + "  |  " + checkBoard [1][4] + "  |  " + checkBoard [1][5] + "  |  ");
			System.out.println( checkBoard[1][6] + "  |  " + checkBoard [1][7] + "  |  "  + checkBoard [1][8] + "  |  " + checkBoard [1][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("C |  " + checkBoard[2][0] + "  |  " + checkBoard [2][1] + "  |  "  + checkBoard [2][2] + "  |  " + checkBoard [2][3] + "  |  " + checkBoard [2][4] + "  |  " + checkBoard [2][5] + "  |  ");
			System.out.println( checkBoard[2][6] + "  |  " + checkBoard [2][7] + "  |  "  + checkBoard [2][8] + "  |  " + checkBoard [2][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("D |  " + checkBoard[3][0] + "  |  " + checkBoard [3][1] + "  |  "  + checkBoard [3][2] + "  |  " + checkBoard [3][3] + "  |  " + checkBoard [3][4] + "  |  " + checkBoard [3][5] + "  |  ");
			System.out.println( checkBoard[3][6] + "  |  " + checkBoard [3][7] + "  |  "  + checkBoard [3][8] + "  |  " + checkBoard [3][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("E |  " + checkBoard[4][0] + "  |  " + checkBoard [4][1] + "  |  "  + checkBoard [4][2] + "  |  " + checkBoard [4][3] + "  |  " + checkBoard [4][4] + "  |  " + checkBoard [4][5] + "  |  ");
			System.out.println( checkBoard[4][6] + "  |  " + checkBoard [4][7] + "  |  "  + checkBoard [4][8] + "  |  " + checkBoard [4][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("F |  " + checkBoard[5][0] + "  |  " + checkBoard [5][1] + "  |  "  + checkBoard [5][2] + "  |  " + checkBoard [5][3] + "  |  " + checkBoard [5][4] + "  |  " + checkBoard [5][5] + "  |  ");
			System.out.println( checkBoard[5][6] + "  |  " + checkBoard [5][7] + "  |  "  + checkBoard [5][8] + "  |  " + checkBoard [5][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("G |  " + checkBoard[6][0] + "  |  " + checkBoard [6][1] + "  |  "  + checkBoard [6][2] + "  |  " + checkBoard [6][3] + "  |  " + checkBoard [6][4] + "  |  " + checkBoard [6][5] + "  |  ");
			System.out.println( checkBoard[6][6] + "  |  " + checkBoard [6][7] + "  |  "  + checkBoard [6][8] + "  |  " + checkBoard [6][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("H |  " + checkBoard[7][0] + "  |  " + checkBoard [7][1] + "  |  "  + checkBoard [7][2] + "  |  " + checkBoard [7][3] + "  |  " + checkBoard [7][4] + "  |  " + checkBoard [7][5] + "  |  ");
			System.out.println( checkBoard[7][6] + "  |  " + checkBoard [7][7] + "  |  "  + checkBoard [7][8] + "  |  " + checkBoard [7][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("I |  " + checkBoard[8][0] + "  |  " + checkBoard [8][1] + "  |  "  + checkBoard [8][2] + "  |  " + checkBoard [8][3] + "  |  " + checkBoard [8][4] + "  |  " + checkBoard [8][5] + "  |  ");
			System.out.println( checkBoard[8][6] + "  |  " + checkBoard [8][7] + "  |  "  + checkBoard [8][8] + "  |  " + checkBoard [8][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("J |  " + checkBoard[9][0] + "  |  " + checkBoard [9][1] + "  |  "  + checkBoard [9][2] + "  |  " + checkBoard [9][3] + "  |  " + checkBoard [9][4] + "  |  " + checkBoard [9][5] + "  |  ");
			System.out.println( checkBoard[9][6] + "  |  " + checkBoard [9][7] + "  |  "  + checkBoard [9][8] + "  |  " + checkBoard [9][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			
		}
		public static void decisionRunner()
		{
			System.out.println("Player 1, it is time for you to decide where you want your ships");
			//The 5 ships are: Carrier (occupies 5 spaces), Battleship (4), Cruiser (3), Submarine (3), and Destroyer (2).
			System.out.println("Your ship options are:");
			System.out.println("Carrier - Occupies 5 spaces");
			int carrier = 5;
			System.out.println("Battleship - Occupies 4 spaces");
			int battleship = 4;
			System.out.println("Cruiser - Occupies 3 spaces");
			int cruiser = 3;
			System.out.println("Submarine - Occupies 3 spaces");
			int submarine = 3;
			System.out.println("Destroyer - Occupies 2 spaces");
			int destroyer = 2;
			System.out.println();
			ShipPlacements.shipDecisions();
		}

		
	}
