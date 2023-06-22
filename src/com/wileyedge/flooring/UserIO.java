package com.wileyedge.flooring;

import java.util.Scanner;

import com.wileyedge.flooring.view.FlooringView;
import com.wileyedge.flooring.view.View;

public class UserIO {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		View view = new FlooringView(sc);
		String menu = "  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n" + 
				"  * <<Flooring Program>>\n" + 
				"  * 1. Display Orders\n" + 
				"  * 2. Add an Order\n" + 
				"  * 3. Edit an Order\n" + 
				"  * 4. Remove an Order\n" + 
				"  * 5. Export All Data\n" + 
				"  * 6. Quit\n" + 
				"  *\n" + 
				"  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
		int option = 0;
		do {
			System.out.println(menu);
			option = sc.nextInt();
			switch (option) {
			case 1:
				view.displayOrders();
			case 2:
				view.addOrder();
			case 3:
				view.editOrder();
			case 4:
				view.removeOrder();
			case 5:
				view.exportData();
			}
		} while (option != 6);
	}
	
}