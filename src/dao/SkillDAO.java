package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public Skill getSkillBylD(Long id) throws SQLException, Exception {
		
		ConnectionManager con = new ConnectionManager();
		
		Statement st = con.getConnection().createStatement();
		
		ResultSet rs = st.executeQuery("select * from skill");
		Skill skill=null;
		
		while(rs.next())
		{
			long id1=rs.getLong(1);
			
			String name=rs.getString(2);
			
			skill.setSkillld(id1);
			skill.setSkillName(name);
			
		}
	
	return skill;
	}
}
