package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		String name, email;
		Date birthDate;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email:");
		email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		Date moment = Date.from(Instant.parse("ss/MM/yyyy HH:mm:ss"));
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(moment, OrderStatus.valueOf(status), client);
		
		System.out.println("How many items to this order?");
		int N = sc.nextInt();
		for (int i=0; i<N; i ++) {
			
		
		}
		
		
		
		
		
		
		
		
		for (int i=0; i< N; i++) {
			System.out.print("Enter #"+ i+1 + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, productPrice);
		}
		
		
		
		
		sc.close();
	}

}
