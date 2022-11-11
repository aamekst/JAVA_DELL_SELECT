package br.com.dell.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.dell.DAO.NotebookDAO;
import br.com.dell.beans.Notebook;
import br.com.dell.conexao.Conexao;
import br.com.dell.conexao.ConexaoDAO;

public class ProgramaSelecionar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Connection con = ConexaoDAO.abrirConexao();
		
		Notebook notebook = new Notebook ();

		NotebookDAO notebookDao = new NotebookDAO(con);
		
		//select
		
		
		ArrayList<Notebook> lista = notebookDao.retornarDados();
		if(lista != null) {
			for (Notebook n : lista) {
				System.out.println("Cor do notebook: " + n.getCor());
				System.out.println("Peso do notebook: " + n.getPeso());
				System.out.println("Tamanho da tela:  " + n.getTamanhoTela());				
			}
			
		}
	

		Conexao.fecharConexao(con);


	}

}
