package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

//		jdbc:mysql://localhost:3306 -- se eu não informar a porta ele pega como default a 3306
//		localhost?{paramentros}
//		verifyServerCertificate=false - não verificar certificado do servidor
//		useSSL=true para conexão segura
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "12345678";

//		DriverManager lança uma exceção, obrigando a ser tratado ou lançado (throws)
		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}

}
