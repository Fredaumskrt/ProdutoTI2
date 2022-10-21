package model;

public class User {
	private int Id;
	private String UserName;
	private String Email;
	private String CPF;
	private String Cellphone;
	private String Address;
	private String UserPass;
	
	public User() {}
	
	
	public User (int id, String userName, String email, String cpf, String cellphone, String address, String userPass) {
		setId(id);
		setUserName(userName);
		setEmail(email);
		setCPF(cpf);
		setCellphone(cellphone);
		setAddress(address);
		SetUserPass(userPass);
	}	
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		this.Id = id;
	}
		
	public String getUserName() {
	    return UserName;
	}

	public void setUserName(String userName) {
	    this.UserName = userName;
	}	
	public String getEmail() {
	    return Email;
	}

	public void setEmail(String email) {
	    this.Email = email;
	}	
	public String getCPF() {
	    return CPF;
	}

	public void setCPF(String CPF) {
	    this.CPF = CPF;
	}	
	public String getCellphone() {
	    return Cellphone;
	}

	public void setCellphone(String cellPhone) {
	    this.Cellphone = cellPhone;
	}	
	public String getAddress() {
	    return Address;
	}

	public void setAddress(String address) {
	    this.Address = address;
	}	
	public String getUserPass() {
	    return UserPass;
	}

	public void SetUserPass (String userPass) {
	    this.UserPass = userPass;
	}	
	
	
	public String toString() {
		return "Id: " + Id + "   Name:" + UserName + "   CPF: " + CPF + " ";
	}


}