package com.wileyedge.flooring.view;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FlooringView implements View {
	private Scanner sc;
	private Controller controller;

	public FlooringView(Scanner sc) {
		this.sc = sc;
		this.controller = new FlooringController();
	}

	@Override
	public void displayOrders() {
		System.out.print("Display orders from (dd/MM/yyyy): ");
		String ordersFrom = sc.next();
		LocalDate date = checkValidDate(ordersFrom);
		while (date == null) {
			System.out.println("Invalid date, please try again");
			System.out.print("Display orders from (dd/MM/yyyy): ");
			ordersFrom = sc.next();
			date = checkValidDate(ordersFrom);
		}
		controller.displayOrders(date);
	}
	
	private LocalDate checkValidDate(String dob) {
		LocalDate date = null;
		try {
			date = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		} catch (DateTimeException e) {
			return null;
		}
		return date;
	}

	@Override
	public void addOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exportData() {
		// TODO Auto-generated method stub

	}

}
