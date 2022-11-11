package br.com.dell.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		// try {
		String url = "jdbc:mysql://localhost:3307";
		String USER = "root";
		String PASS = "*123456HAS*";
		con = DriverManager.getConnection(url, USER, PASS);
	

		//con = DriverManager.getConnection("jdbc:mysql://localhost:3307", "root", "*123456HAS*");
		System.out.println("Conexão aberta.");
		fecharConexao(con);
		/*
		 * } catch (ClassNotFoundException e) { System.out.println(e.getMessage() +
		 * " Erro no envio dos dados"); } catch (SQLException e) {
		 * System.out.println(e.getMessage() + " Erro no envio dos dados"); } catch
		 * (Exception e) { System.out.println(e.getMessage() +
		 * " Erro no envio dos dados"); }
		 */
		// return con;
	}

	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("Conexão fechada.");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " Erro no envio dos dados: SQLException");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Erro no envio dos dados: Exception");
		}
	}
		
}
