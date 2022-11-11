package br.com.dell.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.dell.DAO.NotebookDAO;
import br.com.dell.beans.Notebook;
import br.com.dell.conexao.Conexao;
import br.com.dell.conexao.ConexaoDAO;

public class ProgramaDeleteComWhere2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = ConexaoDAO.abrirConexao();
		Notebook notebook = new Notebook ();

		NotebookDAO notebookDao = new NotebookDAO(con);
		
		notebook.setCor(JOptionPane.showInputDialog("Digite a cor:" ));
		notebook.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:" )));


		System.out.println( notebookDao.deletaNotebookcomWhere(notebook));
	
		Conexao.fecharConexao(con);

	}

}
