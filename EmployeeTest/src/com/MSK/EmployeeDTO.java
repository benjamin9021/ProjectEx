package com.MSK;

public class EmployeeDTO {
	
	private String eId; 
	private String eName;
	private int eTel;
	private int eAge;
	private Department dInfo;
	
	public EmployeeDTO() {
		
		
		
		
		
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteTel() {
		return eTel;
	}

	public void seteTel(int eTel) {
		this.eTel = eTel;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public Department getdInfo() {
		return dInfo;
	}

	public void setdInfo(Department dInfo) {
		this.dInfo = dInfo;
	}
}
