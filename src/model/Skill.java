package model;

public class Skill{
	
	private Long skillld ;
	
	private String skillName ;

	public Long getSkillld() {
		return skillld;
	}

	public void setSkillld(Long skillld) {
		this.skillld = skillld;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Skill(Long skillld, String skillName) {
	
		this.skillld = skillld;
		this.skillName = skillName;
	}
	
	
	
}
