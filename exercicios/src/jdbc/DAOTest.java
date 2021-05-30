package jdbc;

public class DAOTest {

	public static void main(String[] args) {

		DAO dao = new DAO();

//		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "João"));
		System.out.println(dao.incluir(sql, "Ana"));
		System.out.println(dao.incluir(sql, "Julia"));
//		System.out.println(dao.incluir(sql, "Agora vai", 1001));

		dao.close();
	}
}
