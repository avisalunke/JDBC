package controller;

import java.util.Scanner;

import DBConnection.connection;
import services.dogServices;

public class Controller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		
		while(i==0) {
			
			System.out.println("eneter 1 to insert");
			System.out.println("enter 2 delete");
			System.out.println("enter 3 update ");
			System.out.println("enter 4 show all");
			System.out.println("enter 5 to logged off");
			
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("enter id to insert");
				int id=sc.nextInt();
				System.out.println("enter name of dog");
				String name=sc.next();
				dogServices.insertDog(id, name);
		break;	}
			case 2:{
				System.out.println("enter id to delete");
				int id=sc.nextInt();
				dogServices.deleteDog(id);
				
				break;	}
			case 3:{
				System.out.println("enter id to update");
				int id=sc.nextInt();
				System.out.println("enter name of dog");
				String name=sc.next();
				
				dogServices.updatedog(id, name);
				break;}
			case 4:{
				
				dogServices.showdogs();
				break;}
			case 5:{
				System.out.println("you logged off from system");
				connection.con().close();
				
				sc.close();
				
				i=8;
				
				break;}
			}
			
		}
	}

}
