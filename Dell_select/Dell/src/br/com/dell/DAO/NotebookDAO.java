package br.com.dell.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.dell.beans.Notebook;

public class NotebookDAO {
	
	private Connection con;
	
		
		public Connection getCon() {
			return con;
		}
	
		public void setCon(Connection con) {
			this.con = con;
		}
	
		public NotebookDAO(Connection con){
			setCon(con);
		}

		//metodo inserir
		public String inserirNotebook(Notebook notebook)
		{
			String sql = "insert into notebook(cor, peso, tamanhoTela) values (?,?,?)";
			
			try {
				
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, notebook.getCor());
				ps.setDouble(2, notebook.getPeso());
				ps.setDouble(3, notebook.getTamanhoTela());
				if(ps.executeUpdate()>0) {
					return "Inserido com sucesso!";
				}else {
					return "Erro ao inserir";
				}
				
				
			}catch (SQLException e)
			{
				return e.getMessage();
			}
			
		}
		
		//metodo deletar sem where
				public String deleteNotebook()
				{
					String sql = "delete from notebook";
					
					try {
						
						PreparedStatement ps = getCon().prepareStatement(sql);
				
						if(ps.executeUpdate()>0) {
							return "Deletado com sucesso!";
						}else {
							return "Erro ao inserir";
						}
						
					}catch (SQLException e)
					{
						return e.getMessage();
					}
					
				}
		
		
				//metodo deletar com where
				public String deletaNotebookcomWhere(Notebook notebook)
				{
					String sql = "delete from notebook where cor = (?)";
					
					try {
						PreparedStatement ps = getCon().prepareStatement(sql);
						ps.setString(1, notebook.getCor());
						
						if(ps.executeUpdate()>0) {
							return "Deletado";
						}else {
							return "Erro ao deletar";
						}
						
						
					}catch (SQLException e)
					{
						return e.getMessage();
					}
					
				}
				
				//metodo deletar com where com 2 parametros
				public String deletaNotebookWhereDois(Notebook notebook)
				{
					String sql = "delete from notebook where cor = (?) and peso = (?)";
					
					try {
						PreparedStatement ps = getCon().prepareStatement(sql);
						ps.setString(1, notebook.getCor());
						ps.setDouble(2, notebook.getPeso());
						if(ps.executeUpdate()>0) {
							return "Deletado";
						}else {
							return "Erro ao deletar";
						}
						
						
					}catch (SQLException e)
					{
						return e.getMessage();
					}
					
				}
				
				//metodo update com where
				public String updateNotebookWhere(Notebook notebook)
				{
					String sql = "update notebook set cor=(?) where peso =(?)";
					
					try {
						PreparedStatement ps = getCon().prepareStatement(sql);
						ps.setString(1, notebook.getCor());
						ps.setDouble(2, notebook.getPeso());
						if(ps.executeUpdate()>0) {
							return "Alterado com sucesso!";
						}else {
							return "Erro ao alterar";
						}
						
						
					}catch (SQLException e)
					{
						return e.getMessage();
					}
					
				}
				

				//metodo update sem where
				public String updateNotebookSemWhere(Notebook notebook)
				{
					String sql = "update notebook set cor=(?)";
					
					try {
						PreparedStatement ps = getCon().prepareStatement(sql);
						ps.setString(1, notebook.getCor());
						if(ps.executeUpdate()>0) {
							return "Alterado com sucesso!";
						}else {
							return "Erro ao alterar";
						}
						
						
					}catch (SQLException e)
					{
						return e.getMessage();
					}
					
				}
				
				
	//select com array - meotodo selecionar 


	public ArrayList<Notebook>  retornarDados(){//nome do metodo
		
		String sql = "Select * from notebook";
		ArrayList<Notebook> retornarNotebook = new ArrayList<Notebook>();//objeto "retornanotebook"
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Notebook notebook = new Notebook();
					notebook.setCor(rs.getString(1));
					notebook.setPeso(rs.getDouble(2));
					notebook.setTamanhoTela(rs.getDouble(3));
					retornarNotebook.add(notebook);
				}
				return retornarNotebook;
				
			}else{
				return null;
			}
			
		}catch(SQLException e) {
			return null;
		}
		
	}
				
				
				
				
				
				
				
				
				
				
				
		
		
}


