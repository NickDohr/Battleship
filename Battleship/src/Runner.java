import java.util.Scanner;
//runner class
public class Runner
	{
		static boolean stillPlaying = true;
		static Player player1 = new Player();
		static Player player2 = new Player();
		public static int row;
		public static int col;
		
		public static void main(String[] args)
			{
				
				Scanner userStringInput = new Scanner(System.in);
			System.out.println("Hello, Player 1, what is your name?");
			player1.name = userStringInput.nextLine();
			System.out.println("Hello " + player1.name + ", welcome to the game");
			
			System.out.println("Player 2, What is your name?");
			player2.name = userStringInput.nextLine();
			System.out.println("Hello " +player2.name + ", welcome to the game");
				
			fillBoard(player1);
			fillBoard(player2);
			
			Player.fillShowBoard(player1);
			Player.fillShowBoard(player2);
			
			ShipPlacements.shipDecisions(player1);
			ShipPlacements.shipDecisions(player2);
			
			
			while(stillPlaying)
				{
					playerTurn(player1);
					
					playerTurn(player2);
				}
			
			//shipDecisions();
			}
		public static void fillBoard(Player p)
		{
			for (int row = 0; row < p.checkBoard.length; row++)
				{
					   for (int col = 0; col < p.checkBoard[0].length; col++)
						   {
							   p.checkBoard[row][col] = " ";
						   }
				}
			
			
		}
		public static void pause()
			{
				Scanner userFakeInput = new Scanner(System.in);
				String pause;
				pause = userFakeInput.nextLine();
			}
		public static void displayBoard(Player p)
		{
			System.out.println("     1     2     3     4     5     6     7     8     9     10");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("A |  " + p.checkBoard[0][0] + "  |  " + p.checkBoard [0][1] + "  |  "  + p.checkBoard [0][2] + "  |  " + p.checkBoard [0][3] + "  |  " + p.checkBoard [0][4] + "  |  " + p.checkBoard [0][5] + "  |  ");
			System.out.println( p.checkBoard[0][6] + "  |  " + p.checkBoard [0][7] + "  |  "  + p.checkBoard [0][8] + "  |  " + p.checkBoard [0][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("B |  " + p.checkBoard[1][0] + "  |  " + p.checkBoard [1][1] + "  |  "  + p.checkBoard [1][2] + "  |  " + p.checkBoard [1][3] + "  |  " + p.checkBoard [1][4] + "  |  " + p.checkBoard [1][5] + "  |  ");
			System.out.println( p.checkBoard[1][6] + "  |  " + p.checkBoard [1][7] + "  |  "  + p.checkBoard [1][8] + "  |  " + p.checkBoard [1][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("C |  " + p.checkBoard[2][0] + "  |  " + p.checkBoard [2][1] + "  |  "  + p.checkBoard [2][2] + "  |  " + p.checkBoard [2][3] + "  |  " + p.checkBoard [2][4] + "  |  " + p.checkBoard [2][5] + "  |  ");
			System.out.println( p.checkBoard[2][6] + "  |  " + p.checkBoard [2][7] + "  |  "  + p.checkBoard [2][8] + "  |  " + p.checkBoard [2][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("D |  " + p.checkBoard[3][0] + "  |  " + p.checkBoard [3][1] + "  |  "  + p.checkBoard [3][2] + "  |  " + p.checkBoard [3][3] + "  |  " + p.checkBoard [3][4] + "  |  " + p.checkBoard [3][5] + "  |  ");
			System.out.println( p.checkBoard[3][6] + "  |  " + p.checkBoard [3][7] + "  |  "  + p.checkBoard [3][8] + "  |  " + p.checkBoard [3][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("E |  " + p.checkBoard[4][0] + "  |  " + p.checkBoard [4][1] + "  |  "  + p.checkBoard [4][2] + "  |  " + p.checkBoard [4][3] + "  |  " + p.checkBoard [4][4] + "  |  " + p.checkBoard [4][5] + "  |  ");
			System.out.println( p.checkBoard[4][6] + "  |  " + p.checkBoard [4][7] + "  |  "  + p.checkBoard [4][8] + "  |  " + p.checkBoard [4][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("F |  " + p.checkBoard[5][0] + "  |  " + p.checkBoard [5][1] + "  |  "  + p.checkBoard [5][2] + "  |  " + p.checkBoard [5][3] + "  |  " + p.checkBoard [5][4] + "  |  " + p.checkBoard [5][5] + "  |  ");
			System.out.println( p.checkBoard[5][6] + "  |  " + p.checkBoard [5][7] + "  |  "  + p.checkBoard [5][8] + "  |  " + p.checkBoard [5][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("G |  " + p.checkBoard[6][0] + "  |  " + p.checkBoard [6][1] + "  |  "  + p.checkBoard [6][2] + "  |  " + p.checkBoard [6][3] + "  |  " + p.checkBoard [6][4] + "  |  " + p.checkBoard [6][5] + "  |  ");
			System.out.println( p.checkBoard[6][6] + "  |  " + p.checkBoard [6][7] + "  |  "  + p.checkBoard [6][8] + "  |  " + p.checkBoard [6][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("H |  " + p.checkBoard[7][0] + "  |  " + p.checkBoard [7][1] + "  |  "  + p.checkBoard [7][2] + "  |  " + p.checkBoard [7][3] + "  |  " + p.checkBoard [7][4] + "  |  " + p.checkBoard [7][5] + "  |  ");
			System.out.println( p.checkBoard[7][6] + "  |  " + p.checkBoard [7][7] + "  |  "  + p.checkBoard [7][8] + "  |  " + p.checkBoard [7][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("I |  " + p.checkBoard[8][0] + "  |  " + p.checkBoard [8][1] + "  |  "  + p.checkBoard [8][2] + "  |  " + p.checkBoard [8][3] + "  |  " + p.checkBoard [8][4] + "  |  " + p.checkBoard [8][5] + "  |  ");
			System.out.println( p.checkBoard[8][6] + "  |  " + p.checkBoard [8][7] + "  |  "  + p.checkBoard [8][8] + "  |  " + p.checkBoard [8][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			System.out.print("J |  " + p.checkBoard[9][0] + "  |  " + p.checkBoard [9][1] + "  |  "  + p.checkBoard [9][2] + "  |  " + p.checkBoard [9][3] + "  |  " + p.checkBoard [9][4] + "  |  " + p.checkBoard [9][5] + "  |  ");
			System.out.println( p.checkBoard[9][6] + "  |  " + p.checkBoard [9][7] + "  |  "  + p.checkBoard [9][8] + "  |  " + p.checkBoard [9][9] + "  |  ");
			System.out.println("  -------------------------------------------------------------");
			
		}
		
		public static void playerTurn(Player p)
		{
		
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			System.out.println(p.getName() + ", it is time for you to make your move");
			System.out.println("Here are your current guesses:");
			Player.displayShowBoard(p);
			System.out.println("Your Letter Options are A - J, Pick A letter");
			int row = 0;
			String letterChoice = userStringInput.nextLine();
			switch(letterChoice)
			{
				case "A":
				case "a":
						{
							row = 0;
							break;
						}
				case "B":
				case "b":
						{
							row = 1;
							break;
						}
				case "C":
				case "c":
						{
							row = 2;
							break;
						}
				case "D":
				case "d":
						{
							row = 3;
							break;
						}
				case "E":
				case "e":
						{
							row = 4;
							break;
						}
				case "F":
				case "f":
						{
							row = 5;
							break;
						}
				case "G":
				case "g":
						{
							row = 6;
							break;
						}
				case "H":
				case "h":
						{
							row = 7;
							break;
						}
				case "I":
				case "i":
						{
							row = 8;
							break;
						}
				case "J":
				case "j":
						{
							row = 9;
							break;
						}	
			}
			//System.out.println("Player, it is time for you to make your move");
			int col = 0;
			System.out.println("Your Number Options are 1-10, Pick A Number");
			int numChoice = userIntInput.nextInt();
			col = numChoice -1;
			if(p == player1)
				{
					if(player2.checkBoard[row][col].equals("X"))
						{
							System.out.println("You hit a ship!");
							p.showBoard[row][col] = "X";
							Player.displayShowBoard(p);
							p.setNumOfHits(p.numOfHits + 1);
							if(p.numOfHits == 4)
								{
									System.out.println("You sunk a ship!");
									
								}
							else if(p.numOfHits == 24)
								{
									System.out.println(p.getName() + "has won this battleship game!");
								}
						}
					else
						{
							System.out.println("You missed");
							p.showBoard[row][col] = "O";
							Player.displayShowBoard(p);
						}
				}
			if(p == player2)
				{
					if(player1.checkBoard[row][col].equals("X"))
						{
							System.out.println("You hit a ship!");
							p.showBoard[row][col] = "X";
							Player.displayShowBoard(p);
							p.setNumOfHits(p.numOfHits + 1);
							if(p.numOfHits == 4)
								{
									System.out.println("You sunk a ship!");
								}
							else if(p.numOfHits == 24)
								{
									System.out.println(p.getName() + "has won this battleship game!");
								}
						}
					else
						{
							System.out.println("You missed");
							p.showBoard[row][col] = "O";
							Player.displayShowBoard(p);
						}
				}
			
			
			//ShipPlacements.shipDecisions(Player p);
		}
		

		
	}
