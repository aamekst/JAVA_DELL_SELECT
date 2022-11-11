package br.com.dell.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
	
	public Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3307","root","*123456HAS*");
	}
}


