import java.util.Scanner;

public class ShipPlacements
	{
		public static void shipDecisions()
		{
			for(int i = 0; i < 5; i++)
				{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			
			System.out.println("What ship do you want to place?");
			System.out.println("(1) - Carrier");
			System.out.println("(2) - Battleship");
			System.out.println("(3) - Cruiser");
			System.out.println("(4) - Submarine");
			System.out.println("(5) - Destroyer");
			int choice = userIntInput.nextInt();
			switch(choice)
			{
				case 1:
						{
							System.out.println("You picked the carrier, so you get to choose a 5 in a row location for this ship");
							System.out.println("Do you want the ship to be vertical or horizontal");
							System.out.println("(1) - Horizontal");
							System.out.println("(2) - Vertical");
							System.out.println("Which one do you want to choose?");
							int choice2 = userIntInput.nextInt();
									System.out.println("You chose Horizontal, now you get to choose the letter");
									System.out.println("Your letter choice is A - J, make your choice with a capital letter");
									String choice4 = userStringInput.nextLine();
									switch(choice4)
									{
										case "A":
												{
													Runner.row = 0;
												}
										case "B":
												{
													Runner.row = 1;
												}
										case "C":
												{
													Runner.row = 2;
												}
										case "D":
												{
													Runner.row = 3;
												}
										case "E":
												{
													Runner.row = 4;
												}
										case "F":
												{
													Runner.row = 5;
												}
										case "G":
												{
													Runner.row = 6;
												}
										case "H":
												{
													Runner.row = 7;
												}
										case "I":
												{
													Runner.row = 8;
												}
										case "J":
												{
													Runner.row = 9;
												}
									}
								
									System.out.println("Your number choice is 1 - 10");
									int choice3 = userIntInput.nextInt();
									Runner.col = choice3;
									Runner.col = Runner.col - 1;
									if(Runner.checkBoard[Runner.row][Runner.col].equals("X"))
										{
											System.out.println("That space is occupied already, pick a new number ");
											System.out.println("Your number choice is 1 - 10");
											int newChoice = userIntInput.nextInt();
											Runner.col = newChoice;
										}
									else if(Runner.checkBoard[Runner.row][Runner.col].equals(" "));
										{
											System.out.println("Filling this ship now now");
											if(choice2 == 1)
												{
													Runner.checkBoard[Runner.row][Runner.col] = "X";
													Runner.checkBoard[Runner.row][Runner.col + 1] = "X";
													Runner.checkBoard[Runner.row][Runner.col + 2] = "X";
													Runner.checkBoard[Runner.row][Runner.col + 3] = "X";
													Runner.checkBoard[Runner.row][Runner.col + 4] = "X";
												}
											else if(choice2 == 2)
												{
													Runner.checkBoard[Runner.row][Runner.col] = "X";
													Runner.checkBoard[Runner.row + 1][Runner.col] = "X";
													Runner.checkBoard[Runner.row + 2][Runner.col] = "X";
													Runner.checkBoard[Runner.row + 3][Runner.col] = "X";
													Runner.checkBoard[Runner.row + 4][Runner.col] = "X";
												}
										}
						}
				case 2:
						{
							
								
							
						}
					}
				
			
			
		}
		}
	}
