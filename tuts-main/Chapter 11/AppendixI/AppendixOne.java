import java.util.*;
import java.io.*;

public class AppendixOne {

	public static void main(String[] sth) throws IOException {
		Scanner sc = new Scanner(System.in);
		//writeData(sc);
		readData(sc);
	}


	public static void readData(Scanner sc) throws IOException {
		System.out.print("\nEnter the name of the file to read the Inventory from: ");
		String n = sc.nextLine();
		InventoryItemFile f = new InventoryItemFile(n);
		//modifyRecord(sc, f);
		//displaySingleRecord(sc, f);
		displayMultipleRecords(sc, f);
		f.close();
	}


	public static void modifyRecord(Scanner sc, InventoryItemFile f) throws IOException {
		System.out.print("Which item do you wish to modify? ");
		f.manageRecord(sc.nextInt());
		sc.nextLine();
		System.out.println("\nEnter the new item details below:");
		System.out.print("Item Description: ");
		String s = sc.nextLine();
		System.out.print("Units Available: ");
		int n = sc.nextInt();
		sc.nextLine();
		f.addItem(new InventoryItem(s, n));
		System.out.println("Your new changes have been made. Here's your new inventory list: ");
		sc.nextLine();
		f.manageRecord(1);
		for (int i = 0; i < f.numberOfRecords(); i++)
			System.out.println("\nItem " + (i + 1) + ":" + f.readItem());
		System.out.println("\nThe file has been modified successfully.");
	}


	public static void displaySingleRecord(Scanner sc, InventoryItemFile f) throws IOException {
		System.out.print("Enter the item number to display: ");
		f.manageRecord(sc.nextInt());
		System.out.println("\nHere are your item details:" + f.readItem());
		System.out.println();
	}


	public static void displayMultipleRecords(Scanner sc, InventoryItemFile f) throws IOException {
		System.out.println("You have " + f.numberOfRecords() + " items in stock. They're listed below:");
		sc.nextLine();
		for (int i = 0; i < f.numberOfRecords(); i++)
			System.out.println("\nItem " + (i + 1) + ":" + f.readItem());
		System.out.println("The file has been read successfully.");
	}


	public static void writeData(Scanner sc) throws IOException {
		final int NUM_ITEMS = 5;
		System.out.println("\nHello. Enter the data for " + NUM_ITEMS + " inventory items....(press enter to start)...");
		sc.nextLine();
		String s;
		int n;
		InventoryItem[] items = new InventoryItem[NUM_ITEMS];
		for (int i = 0; i < NUM_ITEMS; i++) {
			System.out.print("Item Description: ");
			s = sc.nextLine();
			System.out.print("Units Available: ");
			n = sc.nextInt();
			items[i] = new InventoryItem(s, n);
			sc.nextLine();
		}
		InventoryItemFile v = new InventoryItemFile("Inventory.dat");
		for (InventoryItem i : items)
			v.addItem(i);
		v.close();
		System.out.println("The data was written to Inventory.dat file.");
	}
}