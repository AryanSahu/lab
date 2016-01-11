package br.com.singularideas.labs.knowhub.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.singularideas.labs.knowhub.common.data.Publisher;

@Component
public class PublisherRowMapper implements RowMapper<Publisher> {

	@Override
	public Publisher mapRow(ResultSet rs, int row) throws SQLException {
		Publisher p = new Publisher();
		p.setId(rs.getLong("id"));
		p.setName(rs.getString("name"));
		p.setContact(rs.getString("contact"));
		p.setPassword(rs.getString("password"));
		p.setEmail(rs.getString("email"));
		
		return p;
	}

}
