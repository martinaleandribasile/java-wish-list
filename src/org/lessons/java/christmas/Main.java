package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 List<String> desideri = new ArrayList<String>();
		 Scanner scanner = new Scanner(System.in);
		 String scelta="";
		 System.out.println("Ecco la tua lista dei desideri!");
		do {
			 System.out.println("Per inserire un desiderio premi d per uscire premi e");
			 scelta= scanner.nextLine();
			 if(scelta.equals("d")) {
				 System.out.println("Inserisci il tuo desiderio!");
				 desideri.add(scanner.nextLine()); 
				 System.out.println("nella tua lista sono presenti n: " + desideri.size() + " desideri");
			 }else if(scelta.equals("e")) {
				 System.out.println("Grazie per aver inserito i tuoi desideri!");
				 Collections.sort(desideri);
				 System.out.println("La tua lista contiene: ");
				 for(String str:desideri) {
					 System.out.println(str);
				 }
			 }else {
				 System.out.println("L'input inserito non e' valdio, si prega di riprovare");
			 }
		}while(!scelta.equals("e"));
		scanner.close();
	}

}
