package com.farang.model;

import java.sql.*;

public class Stakeholder {

	private String stakeholdernameTH, stakeholderlastnameTH, stakeholdernameEN, stakeholderlastnameEN, positionThai,
			positionEng, responsible, experience, institution, address, phone, fax, email;

	final String url = "jdbc:mysql://localhost:3307/commoditystandard";
	final String usr = "root";
	final String pass = "";

	public Connection conn;
	public Statement stmt;

	public String getStakeholdernameTH() {
		return stakeholdernameTH;
	}

	public void setStakeholdernameTH(String stakeholdernameTH) {
		this.stakeholdernameTH = stakeholdernameTH;
	}

	public String getStakeholderlastnameTH() {
		return stakeholderlastnameTH;
	}

	public void setStakeholderlastnameTH(String stakeholderlastnameTH) {
		this.stakeholderlastnameTH = stakeholderlastnameTH;
	}

	public String getStakeholdernameEN() {
		return stakeholdernameEN;
	}

	public void setStakeholdernameEN(String stakeholdernameEN) {
		this.stakeholdernameEN = stakeholdernameEN;
	}

	public String getStakeholderlastnameEN() {
		return stakeholderlastnameEN;
	}

	public void setStakeholderlastnameEN(String stakeholderlastnameEN) {
		this.stakeholderlastnameEN = stakeholderlastnameEN;
	}

	public String getPositionThai() {
		return positionThai;
	}

	public void setPositionThai(String positionThai) {
		this.positionThai = positionThai;
	}

	public String getPositionEng() {
		return positionEng;
	}

	public void setPositionEng(String positionEng) {
		this.positionEng = positionEng;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Stakeholder() {
		super();
	}

	public Stakeholder(String stakeholdernameTH, String stakeholderlastnameTH, String stakeholdernameEN,
			String stakeholderlastnameEN, String positionThai, String positionEng, String responsible,
			String experience, String institution, String address, String phone, String fax, String email) {
		super();

		this.stakeholdernameTH = stakeholdernameTH;
		this.stakeholderlastnameTH = stakeholderlastnameTH;
		this.stakeholdernameEN = stakeholdernameEN;
		this.stakeholderlastnameEN = stakeholderlastnameEN;
		this.positionThai = positionThai;
		this.positionEng = positionEng;
		this.responsible = responsible;
		this.experience = experience;
		this.institution = institution;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
	}

	public void connecDB() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		conn = DriverManager.getConnection(url, usr, pass);
		stmt = conn.createStatement();
	}

	public void closeDB() throws Exception {
		stmt.close();
		conn.close();
	}

	public boolean add() throws SQLException {
		String strSQL = "INSERT INTO stakeholders(nameThai, lastNameThai, nameEng, lastNameEng, positionThai, positionEng, responsible, experience, institution, address, phone, fax, email) values ('"+ this.getStakeholdernameTH() + "','" + this.getStakeholderlastnameTH() + "','"
				+ this.getStakeholdernameEN() + "','" + this.getStakeholderlastnameEN() + "','"
				+ this.getPositionThai() + "','" + this.getPositionEng() + "','" + this.getResponsible() + "','"
				+ this.getExperience() + "','" + this.getInstitution() + "','" + this.getAddress() + "','"
				+ this.getPhone() + "','" + this.getFax() + "','" + this.getEmail() + "')";

		boolean returnValue;

		try {
			System.out.println(strSQL);
			stmt.executeQuery(strSQL);
			returnValue = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			returnValue = false;
		}
		return returnValue;

	}

}
