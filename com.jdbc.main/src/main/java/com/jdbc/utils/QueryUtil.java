package com.jdbc.utils;

public class QueryUtil {
	public static String insEmpQury() {
		return"insert into employee(empno,name,address,mobile,salary)values(?,?,?,?,?)";
	}
	public static String selAllEmpQry() {
		return"select * from employee";
	}
	public static String selEmpID(String eno) {
		return("Select * from employee where EMPNO ='"+eno +"'");
	}
	public static String delEmpID(String eno) {
		return("Delete from Employee where EMPNO ='"+ eno +"'");
	}
	public static String updEmpID(String eno,int sal) {
		return("UPDATE EMPLOYEE SET SALARY ="+ sal+"where empno='"+eno+"'");
	}
}
