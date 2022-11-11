package br.com.dell.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

	public static Connection abrirConexao() throws Exception {
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3307/teste";
			
			
			String USER = "root";
			String PASS = "*123456HAS*";
			con = DriverManager.getConnection(url, USER, PASS);
			System.out.println("Conexão aberta.");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + " Erro no envio dos dados");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " Erro no envio dos dados");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Erro no envio dos dados");
		}
		return con;
	}
	
	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("Conexão fechada.");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " Erro ao fechar");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Erro ao fechar");
		}
	}

}
