package br.com.dell.teste;

import java.sql.Connection;


import br.com.dell.DAO.NotebookDAO;
import br.com.dell.conexao.Conexao;
import br.com.dell.conexao.ConexaoDAO;

public class ProgramaDeleteSemWhere {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = ConexaoDAO.abrirConexao();
		
		NotebookDAO notebookDao = new NotebookDAO(con);
		
		System.out.println( notebookDao.deleteNotebook());
	
		Conexao.fecharConexao(con);

	}

}
