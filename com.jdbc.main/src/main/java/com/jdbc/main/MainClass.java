package com.jdbc.main;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[] ) {
		DataBaseService dbServ=new DataBaseService();
		try(Scanner inp=new Scanner(System.in);){
			boolean isRunning = true;
			while (isRunning) {
				System.out.println("MENU DRIVEN");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. Show Emp Recore");
				System.out.println("5. Show All");
				System.out.println("6. Exit");
				System.out.println(" - Enter Your Choice");
				
				int keys=Integer.parseInt(inp.nextLine());
				switch (keys) {
				case 1:
					System.out.println("Insert");
					dbServ.insEmp(new Employee(inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.next(),Double.parseDouble(inp.nextLine())));
					break;
				case 2:
					dbServ.updEmpID("E002");
					break;
				case 3:
					dbServ.delEmpID("E003");
					break;
				case 4:
					dbServ.getEmpID("E005");
					break;
				case 5:
					dbServ.getalEmp("E002");
					break;
				case 6:
					dbServ.updEmpID("Finish");
					break;
					default:
						System.out.println("Invalid input..\n input any number between 1-6");
				}
			}
			
		}
	}

}
