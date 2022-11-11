package br.com.dell.teste;

import java.sql.Connection;

import br.com.dell.beans.Computador;
import br.com.dell.conexao.ConexaoDAO;


public class Programa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = ConexaoDAO.abrirConexao();
		
		
		Computador computador = new Computador();
		
		computador.setCor("amarelo");
		computador.setPeso(2.555);
		
		System.out.println(computador.mostrarAtributos());

	}

}
