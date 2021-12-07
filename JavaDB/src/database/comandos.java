package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class comandos {
	
	private int id;
	private String nome;
	private String cpf;
	private String placa;
	private String tipo;
	
	
	
	public comandos(String nome1, String cpf1, String placa1, String tipo1) {
		this.nome = nome1;
		this.cpf = cpf1;
		this.placa = placa1;
		this.tipo = tipo1;
		
	}
	
		
	public void entrada() {
		
		try {
			Connection con = Main.getConnection();
			String sql = "insert into clientes(nome, cpf, placa, tipo) values (?, ?, ?, ?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, nome);
			stmt.setString(2, cpf);
			stmt.setString(3, placa);
			stmt.setString(4, tipo);
			
			stmt.execute();
			
			stmt.close();
			con.close();
			JOptionPane.showMessageDialog(null, "Entrada Realizada!");
			
						
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
		
	
		
}
