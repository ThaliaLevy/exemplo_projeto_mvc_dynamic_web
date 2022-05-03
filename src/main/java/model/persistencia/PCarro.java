package model.persistencia;

import java.sql.SQLException;

import model.entidade.Carro;

public class PCarro {

	public boolean conect() {

		return true;
	}

	public boolean create(Carro c) {
		try {
			Conexao cn = new Conexao();
			cn.sql = "create database if not exists BDCarro";
			cn.ps = cn.conn.prepareStatement(cn.sql);
			cn.ps.execute();

			cn.sql = "use BDCarro";
			cn.ps = cn.conn.prepareStatement(cn.sql);
			cn.ps.execute();
			
			cn.sql = "create table if not exists Carro(id int auto_increment primary key, nome varchar(20), placa varchar(20), marca varchar(20), ano int);";
			cn.ps = cn.conn.prepareStatement(cn.sql);
			cn.ps.execute();

			cn.sql = "insert into Carro(nome, placa, marca, ano) values(?, ?, ?, ?)";
			cn.ps = cn.conn.prepareStatement(cn.sql);
			cn.ps.setString(1, c.getNome());
			cn.ps.setString(2, c.getPlaca());
			cn.ps.setString(3, c.getMarca());
			cn.ps.setInt(4, c.getAno());
			cn.ps.execute();
			
			 /* contando tamanho da tabela, numero de colunas, etc
			 
			Statement stm = cn.conn.createStatement();
			ResultSet result = stm.executeQuery("SELECT * FROM Cliente");
			ResultSetMetaData rsmd = result.getMetaData();
			result.next();
			
			int quantidadeColunas = rsmd.getColumnCount();
			
			for(int i = 1; i <= quantidadeColunas; i++) {
				rsmd.getColumnName(1);
				rsmd.getTableName(1);
				rsmd.getColumnDisplaySize(1);
			} */

			cn.conn.close();
			return true;
		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}

	}

	public boolean read() {

		return true;
	}

	public boolean update() {

		return true;
	}

	public boolean delete() {

		return true;
	}
}
