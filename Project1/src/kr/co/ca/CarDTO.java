package kr.co.ca;

import java.io.Serializable;

public class CarDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String did;
	private String cclr;
	private int cnum;
	
	public CarDTO() {
		// TODO Auto-generated constructor stub
	}

	public CarDTO(String did, String cclr, int cnum) {
		super();
		this.did = did;
		this.cclr = cclr;
		this.cnum = cnum;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getCclr() {
		return cclr;
	}

	public void setCclr(String cclr) {
		this.cclr = cclr;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((did == null) ? 0 : did.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDTO other = (CarDTO) obj;
		if (did == null) {
			if (other.did != null)
				return false;
		} else if (!did.equals(other.did))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "did :" + " " + did + " " + "color :" + " " + cclr + " " + "number :" + cnum;
	}
	
	

	
	
}
