import java.util.ArrayList;
import java.util.Scanner;

public class ShipPlacements
	{
		public static void shipDecisions(Player p)
		{
			ArrayList<String> options = new ArrayList<String>();
			options.add("Option 1");
			options.add("Option 2");
			options.add("Option 3");
			options.add("Option 4");
			options.add("Option 5");
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			System.out.println(p.getName() + ", your board is being randomly generated now");
			
			
			int choice = (int) (Math.random() * 5) + 1;
			if(choice == 1)
				{
				System.out.println("Here is option 1");
				p.checkBoard[0][1] = "X";
				p.checkBoard[0][2] = "X";
				p.checkBoard[0][3] = "X";
				p.checkBoard[0][4] = "X";
			
			
				p.checkBoard[6][0] = "X";
				p.checkBoard[7][0] = "X";
				p.checkBoard[8][0] = "X";
				p.checkBoard[9][0] = "X";
			
				p.checkBoard[2][9] = "X";
				p.checkBoard[3][9] = "X";
				p.checkBoard[4][9] = "X";
				p.checkBoard[5][9] = "X";
			
				p.checkBoard[2][3] = "X";
				p.checkBoard[2][4] = "X";
				p.checkBoard[2][5] = "X";
				p.checkBoard[2][6] = "X";
			
				p.checkBoard[6][4] = "X";
				p.checkBoard[6][5] = "X";
				p.checkBoard[6][6] = "X";
				p.checkBoard[6][7] = "X";
			
			
				p.checkBoard[8][5] = "X";
				p.checkBoard[8][6] = "X";
				p.checkBoard[8][7] = "X";
				p.checkBoard[8][8] = "X";
				options.remove(0);
				Runner.displayBoard(p);
				}
			else if(choice == 2)
				{
					p.checkBoard[0][0] = "X";
					p.checkBoard[1][0] = "X";
					p.checkBoard[2][0] = "X";
					p.checkBoard[3][0] = "X";
					
					
					p.checkBoard[6][2] = "X";
					p.checkBoard[7][2] = "X";
					p.checkBoard[8][2] = "X";
					p.checkBoard[9][2] = "X";
					
					p.checkBoard[0][9] = "X";
					p.checkBoard[1][9] = "X";
					p.checkBoard[2][9] = "X";
					p.checkBoard[3][9] = "X";
					
					p.checkBoard[1][3] = "X";
					p.checkBoard[1][4] = "X";
					p.checkBoard[1][5] = "X";
					p.checkBoard[1][6] = "X";
					
					p.checkBoard[9][5] = "X";
					p.checkBoard[9][6] = "X";
					p.checkBoard[9][7] = "X";
					p.checkBoard[9][8] = "X";
					
					p.checkBoard[6][5] = "X";
					p.checkBoard[6][6] = "X";
					p.checkBoard[6][7] = "X";
					p.checkBoard[6][8] = "X";
					options.remove(1);
					Runner.displayBoard(p);
				}
			else if(choice == 3)
				{
					p.checkBoard[0][1] = "X";
					p.checkBoard[0][2] = "X";
					p.checkBoard[0][3] = "X";
					p.checkBoard[0][4] = "X";
					
					
					p.checkBoard[2][5] = "X";
					p.checkBoard[2][6] = "X";
					p.checkBoard[2][7] = "X";
					p.checkBoard[2][8] = "X";
					
					p.checkBoard[4][6] = "X";
					p.checkBoard[4][7] = "X";
					p.checkBoard[4][8] = "X";
					p.checkBoard[4][9] = "X";
					
					p.checkBoard[4][1] = "X";
					p.checkBoard[4][2] = "X";
					p.checkBoard[4][3] = "X";
					p.checkBoard[4][4] = "X";
					
					p.checkBoard[7][4] = "X";
					p.checkBoard[7][5] = "X";
					p.checkBoard[7][6] = "X";
					p.checkBoard[7][7] = "X";
					
					p.checkBoard[9][5] = "X";
					p.checkBoard[9][6] = "X";
					p.checkBoard[9][7] = "X";
					p.checkBoard[9][8] = "X";
					options.remove(2);
					Runner.displayBoard(p);
				}
			else if(choice == 4)
				{
					
					p.checkBoard[6][1] = "X";
					p.checkBoard[7][1] = "X";
					p.checkBoard[8][1] = "X";
					p.checkBoard[9][1] = "X";
					
					p.checkBoard[1][3] = "X";
					p.checkBoard[2][3] = "X";
					p.checkBoard[3][3] = "X";
					p.checkBoard[4][3] = "X";
					
					p.checkBoard[5][5] = "X";
					p.checkBoard[6][5] = "X";
					p.checkBoard[7][5] = "X";
					p.checkBoard[8][5] = "X";
					
					p.checkBoard[1][7] = "X";
					p.checkBoard[2][7] = "X";
					p.checkBoard[3][7] = "X";
					p.checkBoard[4][7] = "X";
					
					p.checkBoard[3][9] = "X";
					p.checkBoard[4][9] = "X";
					p.checkBoard[5][9] = "X";
					p.checkBoard[6][9] = "X";
					
					p.checkBoard[1][1] = "X";
					p.checkBoard[2][1] = "X";
					p.checkBoard[3][1] = "X";
					p.checkBoard[4][1] = "X";
					options.remove(3);
					Runner.displayBoard(p);
				}
			else if(choice == 5)
				{
					p.checkBoard[5][4] = "X";
					p.checkBoard[6][4] = "X";
					p.checkBoard[7][4] = "X";
					p.checkBoard[8][4] = "X";
					
					
					p.checkBoard[1][2] = "X";
					p.checkBoard[2][2] = "X";
					p.checkBoard[3][2] = "X";
					p.checkBoard[4][2] = "X";
					
					p.checkBoard[7][6] = "X";
					p.checkBoard[7][7] = "X";
					p.checkBoard[7][8] = "X";
					p.checkBoard[7][9] = "X";
					
					p.checkBoard[1][7] = "X";
					p.checkBoard[2][7] = "X";
					p.checkBoard[3][7] = "X";
					p.checkBoard[4][7] = "X";
					
					p.checkBoard[3][9] = "X";
					p.checkBoard[4][9] = "X";
					p.checkBoard[5][9] = "X";
					p.checkBoard[6][9] = "X";
					
					p.checkBoard[1][0] = "X";
					p.checkBoard[2][0] = "X";
					p.checkBoard[3][0] = "X";
					p.checkBoard[4][0] = "X";
					options.remove(4);
					Runner.displayBoard(p);
				}
			Runner.pause();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		}
	
