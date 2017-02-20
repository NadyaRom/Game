package game;

import java.util.Scanner;

public class Main {

	//	Написати гру в якій імітується кидання кубиків комп'ютером і 
	//	користувачем. У грі 2 кубика і на кожному з них може випасти 
	//	від 1 до 6 очок. Реалізувати  визначення програмою першого ходить. 
	//	Кожен робить по чотири кидки. Після кидків показати, намальовані 
	//	символами кубики і кількість очок, що випали на них.
	//	Після пари кидків (кидок комп'ютера + кидок користувача) 
	//	виводити на екран проміжний результат -кількість набраних очок 
	//	гравцем і комп'ютером. В кінці повідомити про те, хто виграв 
	//	за підсумками всіх кидків.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name: ");
		scanner.next();
		System.out.println();
		firstStep();


	}
	public static int random(int min, int max){
		return (int)Math.round(Math.random()*(max-min)+min);

	}

	public static void firstStep(){
		Scanner scanner = new Scanner(System.in);
		int comp = random(1, 6);
		int comp2 = random(1, 6);
		int you = random(1, 6);
		int you2 = random(1, 6);
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 4; i++) {
			if(comp>=you){
				System.out.print("Comp goes.Push Y and Enter to throw cubes: ");
				String b = scanner.next();
				int k = game2(comp);
				System.out.println();
				int c = game2(comp2);
				sum2 = sum2 + (k + c);
				System.out.println("Total: "+ sum2);
				if(b.equalsIgnoreCase("y")){
					System.out.print("You go.Push Y and Enter to throw cubes: ");
					scanner.next();
					k = game2(you);
					System.out.println();
					c = game2(you2);
					sum1 = sum1 + (k + c);
					System.out.println("Total: "+ sum1);
				} 
			}
			if(comp<you){
				System.out.print("You go.Push Y and Enter to throw cubes: ");
				String b = scanner.next();
				int k = game2(you);
				System.out.println();
				int c = game2(you2);
				sum1 = sum1 + (k + c);
				System.out.println("Total: "+ sum1);
				if(b.equalsIgnoreCase("y")){
					System.out.print("Comp goes. Push Y and Enter to throw cubes: ");
					scanner.next();
					k = game2(comp);
					System.out.println();
					c = game2(comp2);
					sum2 = sum2 +(k + c);
					System.out.println("Total: "+ sum2);
				}

			} 
			System.out.println("--------------------------------------------------------");
			System.out.println("Comp: "+ sum2 +" || "+"You: "+ sum1);
			System.out.println();
			System.out.print(sum2>sum1?"After "+ i +" throw Comp is winning!":"After "+ i +" throw You are winning!");
			System.out.println();
		}
		System.out.println(sum2>sum1?"The winner of this game is Comp!"+"\n"+"Wish you good luck for the next time!":
			"The winner of this game is You!"+"\n"+"Congratulations");
	}
	public static int game2(int k) {
		switch (k) {
		case 1:
			forIter(1, 5);
			break;
		case 2: 
			forIter(2, 4);
			break;
		case 3:
			forIter(3, 3);
			break;
		case 4:
			forIter(4, 2);
			break;
		case 5:
			forIter(5, 1);
			break;
		case 6:
			forIter(6, 0);
		}
		return k;
	}

	public static void forIter(int a, int b){
		for (int i = 0; i < a; i++) {
			System.out.println("@@ @@@");
		}
		for (int i = 0; i < b; i++) {
			System.out.println("@@@@@@");
		}
	}

}




