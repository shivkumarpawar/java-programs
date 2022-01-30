import java.util.*;

class Birthday {
	static {
		System.out.println("***welcome to Arpits Kingdom***");
	}

	{
		System.out.println("1.Hello, we welcome you for Arpit's birthday party");
	}
	{
		System.out.println("2.Here we have DJ Chetas with us");
	}
	{
		System.out.println("3.We have made all arrangements for you inside, so please step ahead and enjoy the party");
	}

	void drinks() {
		int c;
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter 007 for Whiskey");
		System.out.println("Please enter 420 for Vodka");
		System.out.println("Please enter 100 for Mojito");
		c = s.nextInt();
		switch (c) {

		case 007:

			String s1 = "";

			while (true) {
				// int pack = s.nextInt();
				System.out.println("You are ordering for whiskey 007");

				// System.out.println("Ok,here Your"+pack+"packs are ready");
				System.out.println("Do you want more sir y or n");
				s1 = s.nextLine();
				if (s1 == "y" || s1 == "Y")
					continue;
				else
					break;
			}
			break;

		case 420:
			System.out.println("You Ordered Vodka 420");
			break;

		case 100:
			System.out.println("You Ordered Mojito 100");
			break;

		default:
			System.out.println("Invalid Code");

			break;

		}
	}

	void thali() {
		String inputString = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Please make your Thali by entering the dishes you want");
		inputString = sc.nextLine();
		System.out.println("Your thali is ready:");
		System.out.println(inputString);

	}

	void good() {
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;

		for (i = 1; i <= 9; i++) {

			if (i < 5)
				k++;

			else
				k--;
			l = 1;
			for (j = 1; j <= 6; j++) {

				if (j >= 6 - k) {
					System.out.print(l);
					l++;
				} else
					System.out.print(" ");
			}
			System.out.println();

		}

	}

	void fine() {
		for (int i = 1; i <= 4; i++) {
			char l = 'A';
			int k = 1;
			for (int j = 1; j <= 8; j++) {
				if (j >= 4 + 1 - i && j <= 4 + i) {
					if (j <= 4) {
						System.out.print(l);
						l++;
					} else {
						System.out.print(k);
						k++;
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}

	void notGood() {
		for (int i = 1; i <= 4; i++) {
			char l = 'A';
			int k = 1;
			for (int j = 1; j <= 8; j++) {
				if (j >= 4 + 1 - i && j <= 4 + i) {
					if (j <= 4) {
						System.out.print(k);
						k++;
					} else {
						System.out.print(l);
						l++;
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Birthday b = new Birthday();
		// System.out.println("Welcome to Arpits kingdom");

		// b.welcome();
		System.out.println(" *******Drinks**********");
		b.drinks();
		System.out.println("********Enjoy the meal*********");
		b.thali();
		System.out.println("**** My Feedback******");
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 1. for Good\n" + "2.for Fine and \n" + " 3.for Not Good\n");
		input = sc.nextInt();

		switch (input) {
		case 1:
			b.good();
			break;
		case 2:
			b.fine();
			break;
		case 3:
			b.notGood();
			break;
		default:
			System.out.println("Please give the suitable feedback");
			break;
		}
	}
}
