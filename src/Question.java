
import java.util.*;

class Question {
	int f = 0, ap = 0;
	 int Lifeline  = 1;
	int ans, count = 0;

	void question1() {
		Scanner sc = new Scanner(System.in);
		String q1 = "1.What is the basic syntax of a Java program?";

		String op1[] = { "1) public class { }", "2) public void main(String[] args) { }", "3) class { }", "4) public class { public void main(String[] args) { } }" };
		System.out.println(q1);
		for (String o : op1) {
			System.out.println(o);
		}
		System.out.println("5.Lifeline");
		System.out.println("6.Quit");
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 4) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else if (ans == 5) {
			System.out.println("Choose any one of the lifeline 1.50-50"
					+ "2.Audiance poll");
			int l = sc.nextInt();
			if (l == 1) {
				f += 1;
				System.out.println(op1[1] + "" + op1[2]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 4) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			} else if (l == 2) {
				ap += 1;
				System.out.println("Audiance poll is as folllows");
				System.out.println(op1[0] + "->5%");
				System.out.println(op1[1] + "->40%");
				System.out.println(op1[2] + "->12%");
				System.out.println(op1[3] + "->70%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 4) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}
			} else {
				System.out.println("Enter valid Number");
			}
		} else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}
	}
	
	
	

	void question2() {
		Scanner sc = new Scanner(System.in);
		String q2 = "2.What is the purpose of the main method in Java??";

		String op2[] = { "1)To initialize variables ", "2)To define a class", "3)To start the execution of a Java program  ", "4)To end the execution of a Java program " };
		System.out.println(q2);
		for (String o : op2) {
			System.out.println(o);
		}
		System.out.println("5.Lifeline");
		System.out.println("6.Quit");
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 3) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else if (ans == 5) {
			if (f == 1) {
				ap+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op2[0] + "->8%");
				System.out.println(op2[1] + "->2%");
				System.out.println(op2[2] + "->10%");
				System.out.println(op2[3] + "->80%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 3) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			else if (ap == 1) {
				f+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op2[1] + " " + op2[3]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 3) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			
			else {
				System.out.println("Choose any one of the lifeline 1.50-50 "
						+ "2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			f+=1;
			System.out.println(op2[1] + " " + op2[3]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 3) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		}
		
		else if (l == 2) {
			ap+=1;
			System.out.println("Audiance poll is as folllows");
			System.out.println(op2[0] + "->8%");
			System.out.println(op2[1] + "->2%");
			System.out.println(op2[2] + "->10%");
			System.out.println(op2[3] + "->80%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 3) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}}}}
	   
	
	
	
	
	void question3() {
		Scanner sc = new Scanner(System.in);
		String q2 = "3.What is the difference between = and == in Java??";

		String op2[] = { "1)= is used for assignment, while == is used for comparison s ",
			"2)= is used for comparison, while == is used for assignment", "3) = is used for both assignment and comparison ", "4)== is used for both assignment and comparison  " };
		System.out.println(q2);
		for (String o : op2) {
			System.out.println(o);
		}
		System.out.println("5.Lifeline");
		System.out.println("\n6.Quit");
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 1) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else if (ans == 5) {
			if (f == 1) {
				ap+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op2[0] + "->80%");
				System.out.println(op2[1] + "->2%");
				System.out.println(op2[2] + "->10%");
				System.out.println(op2[3] + "->8%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 1) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			else if (ap == 1) {
				f+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op2[1] + "\n" + op2[3]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 1) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			
			else {
				System.out.println("Choose any one of the lifeline 1.50-50 "
						+ "2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			f+=1;
			System.out.println(op2[1] + "\n" + op2[3]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 4) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		}
		
		else if (l == 2) {
			ap+=1;
			System.out.println("Audiance poll is as follows");
			System.out.println(op2[0] + "->80%");
			System.out.println(op2[1] + "->2%");
			System.out.println(op2[2] + "->10%");
			System.out.println(op2[3] + "->8%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}}}}

	
	
	

	void question4() {
		Scanner sc = new Scanner(System.in);
		String q2 = "4.What is a variable in Java?";

		String op2[] = { "A)A constant value ",
			"B)A storage location that holds a valuet", "C)A method that performs an action ", "D)A class that defines a new data type " };
		System.out.println(q2);
		for (String o : op2) {
			System.out.println(o);
		}
		System.out.println("5.Lifeline");
		System.out.println("\n6.Quit");
		System.out.println("Choose Your Option");
		ans = sc.nextInt();
		if (ans == 2) {
			System.out.println("Correct answer..!");
			count += 1;
			System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
		} else if (ans == 5) {
			if (f == 1) {
				ap+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1) Audiance poll\n enter 1 to continue");
				int au_p=sc.nextInt();
				if(au_p==1) {
				System.out.println("Audiance poll is as folllows");
				System.out.println(op2[0] + "->8%");
				System.out.println(op2[1] + "->80%");
				System.out.println(op2[2] + "->10%");
				System.out.println(op2[3] + "->2%");
				System.out.println("Now,choose your option according to audiance poll");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}}
				else {
					System.out.println("Your option is invalid");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			else if (ap == 1) {
				f+=1;
				System.out.println("you left with only one lifeline");
				System.out.println("1)50-50\n enter 1 to continue");
				int ff=sc.nextInt();
				
				System.out.println("1) 50-50");
				System.out.println(op2[1] + "\n" + op2[3]);
				System.out.println("Now,choose among this two");
				int a = sc.nextInt();
				if (a == 2) {
					System.out.println("Correct answer..!");
					count += 1;
					System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
				} else {
					System.out.println("wrong answer...");
					System.out.println("You'r game has quit with score " + count);
					System.exit(0);
				}

			} 
			
			else {
				System.out.println("Choose any one of the lifeline 1.50-50 "
						+ "2.Audiance poll");
		
		int l = sc.nextInt();
		if (l == 1) {
			f+=1;
			System.out.println(op2[1] + "\n" + op2[3]);
			System.out.println("Now,choose among this two");
			int a = sc.nextInt();
			if (a == 4) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		}
		
		else if (l == 2) {
			ap+=1;
			System.out.println("Audiance poll is as folllows");
			System.out.println(op2[0] + "->8%");
			System.out.println(op2[1] + "->2%");
			System.out.println(op2[2] + "->10%");
			System.out.println(op2[3] + "->80%");
			System.out.println("Now,choose your option according to audiance poll");
			int a = sc.nextInt();
			if (a == 2) {
				System.out.println("Correct answer..!");
				count += 1;
				System.out.println("CONGRATULATIONS...YOUR SCORE INCREASED TO.." + count);
			} else {
				System.out.println("wrong answer...");
				System.out.println("You'r game has quit with score " + count);
				System.exit(0);
			}
		} else if (ans > 4) {
			System.out.println("Enter valid Number");
		}

		else {
			System.out.println("wrong answer...you are not eligible to continue the quiz");
			System.exit(0);
		}}}
	
	System.out.println("-------------------QUIZ COMPLETED SUCCESFULLY---------------------------");
}
}