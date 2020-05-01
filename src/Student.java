import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Student {
	
	private int stdId;
	private String stdName;
	private long stdPhone;
	private String address;
	private String dOB;
	private String email;
	private char gender;
		
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
	public int getStdId() {
		return stdId;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public String getStdName() {
		return stdName;
	}

	public void setStdPhone(long stdPhone) {
		this.stdPhone = stdPhone;
	}

	public long getStdPhone() {
		return stdPhone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public String getdOB() {
		return dOB;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}

}