package dao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO {
	
	 static List<Player> list=new ArrayList<Player>();
	public List< Player > getAllPlayers() throws Exception {
		
		ConnectionManager con = new ConnectionManager();
		Statement stmt=  con.getConnection().createStatement();
			
			ResultSet rs =stmt.executeQuery("select * from player");
			ResultSet rs1 = stmt.executeQuery("select * from skill");
			    long playerId;
			    
				String playerName;
				String playerCountry;
				long skillId ;
				String skillName ;
		  
			while(rs.next() || rs1.next())
		    {
				playerId=rs.getLong(1);
				playerName=rs.getString(2);
				playerCountry=rs.getString(3);

				skillId = rs1.getLong(1);
				skillName = rs1.getString(2);
				Skill skill=new Skill(skillId,skillName);
				Player player =new Player(playerId,playerName,playerCountry,skill);
		    }
		return list;
	}
}
