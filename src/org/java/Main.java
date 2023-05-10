package org.java;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

import org.java.obj.Person;

public class Main {

	private static final String FILENAME = "/tmp/tmp/nominativi.txt";
	
	public static void main(String[] args) {
	
		printPersonsToFile();
		searchByName();
		
		System.out.println("-------------");
		System.out.println("The end");
	}
	
	public static void searchByName() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ricerca nominativo: ");
		String searchName = sc.nextLine();
		
		try {
			
			File mioFile = new File(FILENAME);
			Scanner reader = new Scanner(mioFile);
			 
			while (reader.hasNextLine()) {
				
			   String fullname = reader.nextLine();
			   
			   if (fullname.toLowerCase().contains(searchName.toLowerCase())) 
				   System.out.println(fullname);
			}

			reader.close();
		} catch (Exception e) {
			
			System.err.println("Errore nella lettura di nominativi.txt\n" + e.getMessage());
		}
	}
	public static void printPersonsToFile() {
		
		try {
			
			FileWriter myWriter = new FileWriter(FILENAME);
			
			Person p = new Person(
					"Guybrush", 
					"Threewood", 
					LocalDate.parse("1989-05-03")
					);
			myWriter.write(p.getFullName() + "\n");
			
			p = new Person(
					"Marco", 
					"Rossi", 
					LocalDate.parse("1989-05-03")
					);
			myWriter.write(p.getFullName() + "\n");
			
			p = new Person(
					"Franca", 
					"Bianchi", 
					LocalDate.parse("1989-05-03")
					);
			myWriter.write(p.getFullName() + "\n");
			
			p = new Person(
					"Francesca", 
					"Gialli", 
					LocalDate.parse("1989-05-03")
					);
			myWriter.write(p.getFullName());
			
			myWriter.close();
		} catch (Exception e) {
			
			System.err.println("Errore nella creazione di Person\n" + e.getMessage());
		}
	}
}
