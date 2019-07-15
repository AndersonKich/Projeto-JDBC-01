package aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();//Inicia a conecção com o banco de dados
			
			st = conn.createStatement();//Instancia uma interface para comandos SQL
			
			rs = st.executeQuery("Select * From department");//Inserir comandos SQL
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+ ","+ rs.getString("Name"));
				
			}
			
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
