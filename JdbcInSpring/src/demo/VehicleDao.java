package demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class VehicleDao {
private JdbcTemplate jdbcTemplate;
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
	this.jdbcTemplate=jdbcTemplate;
}

public int saveVehicle(Vehicle v){
	String query="insert into vehicle values("+v.getVno()+",'"+v.getColor()+"',"+v.getSeat()+","+v.getWheel()+")";
   return jdbcTemplate.update(query);
}

public int updateVehicle(Vehicle v){
	String query="update vehicle set color='"+v.getColor()+"',wheel="+v.getWheel()+" where vno="+v.getVno();
   return jdbcTemplate.update(query);
}

public int deleteVehicle(Vehicle v){
	String query="delete from vehicle where vno="+v.getVno();
   return jdbcTemplate.update(query);
}
}
