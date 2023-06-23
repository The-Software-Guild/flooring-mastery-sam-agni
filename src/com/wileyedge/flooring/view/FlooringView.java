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
		String ordersFrom = null;
		boolean failed = true;
		while (failed) {
			System.out.print("Display orders from (dd/MM/yyyy): ");
			ordersFrom = sc.next();
			try {
				controller.displayOrders(ordersFrom);
				failed = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void addOrder() {
		System.out.print("Order date (dd/MM/yyyy): ");
		String orderDate = sc.next();
		System.out.print("Customer name: ");
		String customerName = sc.next();
		System.out.print("State: ");
		String state = sc.next();
		System.out.print("Product type: ");
		String productType = sc.next();
		System.out.print("Area: ");
		String area = sc.next();
		boolean failed = true;
		while (failed) {
			try {
				controller.parseAddOrder(orderDate, customerName, state, productType, area);
				failed = false;
			} catch (Exception e) {
				
			}
		}
		controller.addOrder(orderDate, customerName, state, productType, area);
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
