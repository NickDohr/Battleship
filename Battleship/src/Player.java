
public class Player
	{
		 String [][] checkBoard = new String [10][10];
		 String [][] showBoard = new String [10][10];
		 int numOfHits = 0;
		 int numOfMisses = 0;
		 int numOfShipsSunk = 0;
		 int numOfShips;
		String name;
		
		public String[][] getCheckBoard()
			{
				return checkBoard;
			}
		public void setCheckBoard(String[][] checkBoard)
			{
				this.checkBoard = checkBoard;
			}
		public String[][] getShowBoard()
			{
				return showBoard;
			}
		public void setShowBoard(String[][] showBoard)
			{
				this.showBoard = showBoard;
			}
		public int getNumOfHits()
			{
				return numOfHits;
			}
		public void setNumOfHits(int numOfHits)
			{
				this.numOfHits = numOfHits;
			}
		public int getNumOfMisses()
			{
				return numOfMisses;
			}
		public void setNumOfMisses(int numOfMisses)
			{
				this.numOfMisses = numOfMisses;
			}
		public int getNumOfShipsSunk()
			{
				return numOfShipsSunk;
			}
		public void setNumOfShipsSunk(int numOfShipsSunk)
			{
				this.numOfShipsSunk = numOfShipsSunk;
			}
		public int getNumOfShips()
			{
				return numOfShips;
			}
		public void setNumOfShips(int numOfShips)
			{
				this.numOfShips = numOfShips;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public static void fillShowBoard(Player p)
			{
				for (int row = 0; row < p.showBoard.length; row++)
					{
						   for (int col = 0; col < p.showBoard[0].length; col++)
							   {
								   p.showBoard[row][col] = " ";
							   }
					}
				
				
			}
		public static void displayShowBoard(Player p)
			{
			//	System.out.println(" ---------------------" + p.getName() + "'s Board ----------------------");
				System.out.println("                     - "+ p.getName() + "'s Board - ");
				System.out.println("     1     2     3     4     5     6     7     8     9     10");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("A |  " + p.showBoard[0][0] + "  |  " + p.showBoard [0][1] + "  |  "  + p.showBoard [0][2] + "  |  " + p.showBoard [0][3] + "  |  " + p.showBoard [0][4] + "  |  " + p.showBoard [0][5] + "  |  ");
				System.out.println( p.showBoard[0][6] + "  |  " + p.showBoard [0][7] + "  |  "  + p.showBoard [0][8] + "  |  " + p.showBoard [0][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("B |  " + p.showBoard[1][0] + "  |  " + p.showBoard [1][1] + "  |  "  + p.showBoard [1][2] + "  |  " + p.showBoard [1][3] + "  |  " + p.showBoard [1][4] + "  |  " + p.showBoard [1][5] + "  |  ");
				System.out.println( p.showBoard[1][6] + "  |  " + p.showBoard [1][7] + "  |  "  + p.showBoard [1][8] + "  |  " + p.showBoard [1][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("C |  " + p.showBoard[2][0] + "  |  " + p.showBoard [2][1] + "  |  "  + p.showBoard [2][2] + "  |  " + p.showBoard [2][3] + "  |  " + p.showBoard [2][4] + "  |  " + p.showBoard [2][5] + "  |  ");
				System.out.println( p.showBoard[2][6] + "  |  " + p.showBoard [2][7] + "  |  "  + p.showBoard [2][8] + "  |  " + p.showBoard [2][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("D |  " + p.showBoard[3][0] + "  |  " + p.showBoard [3][1] + "  |  "  + p.showBoard [3][2] + "  |  " + p.showBoard [3][3] + "  |  " + p.showBoard [3][4] + "  |  " + p.showBoard [3][5] + "  |  ");
				System.out.println( p.showBoard[3][6] + "  |  " + p.showBoard [3][7] + "  |  "  + p.showBoard [3][8] + "  |  " + p.showBoard [3][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("E |  " + p.showBoard[4][0] + "  |  " + p.showBoard [4][1] + "  |  "  + p.showBoard [4][2] + "  |  " + p.showBoard [4][3] + "  |  " + p.showBoard [4][4] + "  |  " + p.showBoard [4][5] + "  |  ");
				System.out.println( p.showBoard[4][6] + "  |  " + p.showBoard [4][7] + "  |  "  + p.showBoard [4][8] + "  |  " + p.showBoard [4][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("F |  " + p.showBoard[5][0] + "  |  " + p.showBoard [5][1] + "  |  "  + p.showBoard [5][2] + "  |  " + p.showBoard [5][3] + "  |  " + p.showBoard [5][4] + "  |  " + p.showBoard [5][5] + "  |  ");
				System.out.println( p.showBoard[5][6] + "  |  " + p.showBoard [5][7] + "  |  "  + p.showBoard [5][8] + "  |  " + p.showBoard [5][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("G |  " + p.showBoard[6][0] + "  |  " + p.showBoard [6][1] + "  |  "  + p.showBoard [6][2] + "  |  " + p.showBoard [6][3] + "  |  " + p.showBoard [6][4] + "  |  " + p.showBoard [6][5] + "  |  ");
				System.out.println( p.showBoard[6][6] + "  |  " + p.showBoard [6][7] + "  |  "  + p.showBoard [6][8] + "  |  " + p.showBoard [6][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("H |  " + p.showBoard[7][0] + "  |  " + p.showBoard [7][1] + "  |  "  + p.showBoard [7][2] + "  |  " + p.showBoard [7][3] + "  |  " + p.showBoard [7][4] + "  |  " + p.showBoard [7][5] + "  |  ");
				System.out.println( p.showBoard[7][6] + "  |  " + p.showBoard [7][7] + "  |  "  + p.showBoard [7][8] + "  |  " + p.showBoard [7][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("I |  " + p.showBoard[8][0] + "  |  " + p.showBoard [8][1] + "  |  "  + p.showBoard [8][2] + "  |  " + p.showBoard [8][3] + "  |  " + p.showBoard [8][4] + "  |  " + p.showBoard [8][5] + "  |  ");
				System.out.println( p.showBoard[8][6] + "  |  " + p.showBoard [8][7] + "  |  "  + p.showBoard [8][8] + "  |  " + p.showBoard [8][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				System.out.print("J |  " + p.showBoard[9][0] + "  |  " + p.showBoard [9][1] + "  |  "  + p.showBoard [9][2] + "  |  " + p.showBoard [9][3] + "  |  " + p.showBoard [9][4] + "  |  " + p.showBoard [9][5] + "  |  ");
				System.out.println( p.showBoard[9][6] + "  |  " + p.showBoard [9][7] + "  |  "  + p.showBoard [9][8] + "  |  " + p.showBoard [9][9] + "  |  ");
				System.out.println("  -------------------------------------------------------------");
				Runner.pause();
				

						System.out.println();
					
			}
		
	}
