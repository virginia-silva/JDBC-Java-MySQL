package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();

		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");

		Integer linhasModificadas = stm.getUpdateCount();

		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
		stm.close();
		connection.close();
	}

}
