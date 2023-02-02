package org.lessons.java.christmas.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 List<Regalo> desideri = new ArrayList<>();
		 Scanner scanner = new Scanner(System.in);
		 String scelta="";
		 System.out.println("Ecco la tua lista dei desideri!");
		do {
			 System.out.println("Per inserire un desiderio premi d per uscire premi e");
			 scelta= scanner.nextLine();
			 if(scelta.equals("d")) {
				 System.out.println("Inserisci il tuo desiderio!");
				 desideri.add(new Regalo(scanner.nextLine())); 
				 System.out.println("nella tua lista sono presenti n: " + desideri.size() + " desideri");
			 }else if(scelta.equals("e")) {
				 System.out.println("Grazie per aver inserito i tuoi desideri!");
				Collections.sort(desideri); // classe comparable con metodo compareto() 
				 // ordinare in base alla lunghezza
				 Collections.sort(desideri, new RegaloComparator());
				 System.out.println("La tua lista contiene: ");
				 for(Regalo str:desideri) {
					 System.out.println(str);
				 }
			 }else {
				 System.out.println("L'input inserito non e' valdio, si prega di riprovare");
			 }
		}while(!scelta.equals("e"));
		scanner.close();
	}

}
