package animalPower;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class AnimalSelector
{
	// This is a program that allows you to pick two animals and race them, then
	// it will show the power of each animal.

	// Created by Clinton Elliott

	public static void main(String[] args)
	{
		// int questionInput = 0;
		double power1 = 0.0;
		// double power2 = 0.0;
		double calcHP = 0.0;
		NumberFormat formatter = new DecimalFormat("0.0000");
		NumberFormat secondFormatter = new DecimalFormat("0.00");
		// double comparedPower1 = 0.0;
		// double comparedPower2 = 0.0;
		String animalInput = new String();
		boolean isAnimalMatch = false;
		// boolean exit = false;
		// boolean hasLowerCase = false;
		int n = 0;
		String[] animalList = new String[] { "Horse", "Cat", "Dog", "Ox",
				"Buffalo", "Donkey", "Mule", "Camel", "Man", "CJ" };
		double[] powerList = new double[] { 587.0, 6.0, 42.0, 391.0, 520.0,
				147.0, 293.0, 650.0, 61.0, 1000000.0 };
		// int[] speedList = new int[] { 40, 29, 31, 30, 34, 28, 15, 40, 18,
		// 10000 };
		double[] speedList = new double[] { 40, 0.5, 4, 30, 34, 28, 15, 40, 6,
				10000 };
		// info from a-z-animals.com, modified by dividing animal weight by
		// sprayer weight (guessed at 500 pounds), then multiplying that ratio
		// by top speed. I found distance from the shop to the play area by
		// using
		// GMaps and using their distance scale. I found it to be about 5200
		// feet or almost one mile.
		Scanner scan = new Scanner(System.in);
		System.out
				.println("Welcome to the animal power calculator (beta 1.1), created by CJ Elliott. \n");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ie)
		{
			// Handle exception
		}

		// while (exit != true)
		// {
		System.out.println("Please enter an animal from the following list: ");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ie)
		{
		}
		System.out
				.println("Horse, cat, dog, ox, buffalo, donkey, mule, camel, or man.");

		while (isAnimalMatch == false)
		{
			animalInput = scan.nextLine();
			String animalInputUC = animalInput.substring(0, 1).toUpperCase()
					+ animalInput.substring(1);
			while (n < (animalList.length) && isAnimalMatch == false)
			{
				if (animalInputUC.equals(animalList[n]))
				{
					isAnimalMatch = true;
				} else
				{
					n++;
				}
			}
			if (isAnimalMatch == false)
			{
				System.out
						.println("Sorry, I don't support that animal yet. Try again please.");
				n = 0;
			}
		}

		/*
		 * while (n <= (animalList.length) && isAnimalMatch == false) { if
		 * (animalInput.equals(animalList[n])) {
		 */
		String pickedAnimal = animalList[n].toLowerCase();
		System.out.println("\nYou picked " + pickedAnimal
				+ " for your animal. Good choice.");
		power1 = powerList[n];
		calcHP = (power1 / 587);
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException ie)
		{
		}
		System.out.println("A healthy " + pickedAnimal + " can output "
				+ power1 + " watts of power at its max.\n");
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException ie)
		{
		}
		System.out.printf("Calculating approximate horsepower.");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ie)
		{
		}
		System.out.printf(" .");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ie)
		{
		}
		System.out.printf(" .");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ie)
		{
		}
		System.out.printf(" .");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ie)
		{
			// Handle exception
		}
		System.out.println(" .");
		System.out
				.println("The power of the animal you chose is equivalent to "
						+ formatter.format(calcHP) + " horsepower.\n");

		double pullTime = 1 / ((speedList[n] / 5.4) / 60);
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException ie)
		{
		}
		System.out
				.println("This means that it would take a "
						+ pickedAnimal
						+ " about "
						+ secondFormatter.format(pullTime)
						+ " minutes to pull the sprayer from the shop to the play area. \n");

		// System.out.println("Type 1 if you want to race two animals, or enter 2 if you want to start over:");
		// questionInput = scan.nextInt();
		// if(questionInput == 1)
		// {
		// System.out.println("Enter the animal you want to race against the first animal:");
		// isAnimalMatch = false;
		// n = 0;
		// while (isAnimalMatch == false)
		// {
		// String secondAnimalInput = scan.nextLine();
		// String secondAnimalInputUC = secondAnimalInput.substring(0,
		// 1).toUpperCase()
		// + secondAnimalInput.substring(1);
		// while (n < (animalList.length) && isAnimalMatch == false)
		// {
		// if (secondAnimalInputUC.equals(animalList[n]))
		// {
		// isAnimalMatch = true;
		// } else
		// {
		// n++;
		// }
		// }
		// if (isAnimalMatch == false)
		// {
		// System.out
		// .println("Sorry, I don't support that animal yet. Try again please.");
		// n = 0;
		// }
		// }
		// String secondAnimal = animalList[n].toLowerCase();
		// System.out.println("\nYou picked " + secondAnimal
		// + " for your animal. Good choice.");
		// power2 = powerList[n];
		//
		// }

		// System.out
		// .println("type 1 to start the program again, 2 to exit: \n");
		// int exitInput = scan.nextInt();
		// if (exitInput == 2)
		// {
		// exit = true;
		// } else
		// {
		// n = 0;
		// }
		// }

		try
		{
			Thread.sleep(4000);
		} catch (InterruptedException ie)
		{
		}
		System.out
				.println("Please purchase this program from me, Three Rivers.");
		scan.close();
	}
}
