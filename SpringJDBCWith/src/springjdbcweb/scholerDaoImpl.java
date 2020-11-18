package springjdbcweb;

import org.springframework.jdbc.core.JdbcTemplate;

public class scholerDaoImpl implements scholerdao {
    private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplate = jdbcTemplete;
	}
	@Override
	public int insert(scholer e) {
		String q=String.format("insert into scholer values(%d,%d,'%s','%s','%s','%s','%s')", e.getScid(),e.getMarks(),e.getName(),e.getEmail(),e.getPhno(),e.getStatus(),e.getAdress());
		System.out.println(q);
		return jdbcTemplate.update(q);
		
		 
	}

}
