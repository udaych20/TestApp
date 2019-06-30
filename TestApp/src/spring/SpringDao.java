package spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("jdbcTemplate1")
	public JdbcTemplate jdbcTemplate1;

	public List<Map<String, Object>> getDataClassic() {
		List<Map<String, Object>> queryForList = jdbcTemplate
				.queryForList("SELECT * FROM customers where customerNumber=103");
		return queryForList;
	}

	public List<Map<String, Object>> getDataFromUday(){
		List<Map<String, Object>> queryForList = jdbcTemplate1.queryForList("SELECT * FROM employee where eno=1");
		return queryForList;
	}

}
