
package mpm.core.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import mpm.core.dominio.EntidadeDominio;


public class ClienteDAO extends AbstractJdbcDAO {

	public ClienteDAO(String table, String idTable) {
		super(table, idTable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void salvar(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
