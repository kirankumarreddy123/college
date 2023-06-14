package com.example.Grievance.model;

// import org.hibernate.annotations.RowId;

import jakarta.persistence.*;

@Entity
@Table(name = "Grievance")
public class Grievance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "First_name")
	private String First_name;

	@Column(name = "Last_name")
	private String Last_name;

    @Column(name = "Roll_NO")
	private String Roll_no;

	@Column(name = "User")
	private String User;

    @Column(name = "Date_of_Birth")
	private String Date_of_Birth;

    @Column(name = "Department")
	private String Department;

    @Column(name = "Phone_number")
	private String Phone_number;

    @Column(name = "Email_Id")
	private String Email_Id;

    @Column(name = "Password")
	private String password;

    @Column(name = "Conform_Password")
	private String Conform_Password;

    @Column(name = "Gender")
	private String Gender;

	public Grievance() {

	}

	public  Grievance(String First_name, String Last_name,String Roll_no,String User,String Date_of_Birth,String Department,String Phone_number,String Email_Id,String password,String Conform_Password,String Gender) {
		this.First_name = First_name;
		this.Last_name = Last_name;
        this.Roll_no = Roll_no;
		this.User = User;
        this.Date_of_Birth = Date_of_Birth;
        this.Department = Department;
        this.Phone_number = Phone_number;
        this.Email_Id = Email_Id;
        this.password = password;
        this.Conform_Password = Conform_Password;
        this.Gender = Gender;
	}

	public long getId() {
		return id;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String First_name) {
		this.First_name = First_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String  Last_name) {
		this.Last_name = Last_name;
	}

	public String getRoll_NO() {
		return Roll_no;
	}

	public void setRoll_NO(String Roll_no) {
		this.Roll_no = Roll_no;
	}

    public String getUser() {
		return User;
	}

	public void setUser(String User) {
		this.User =User;
	}

    public String getDate_of_Birth() {
		return Date_of_Birth;
	}

	public void setDate_of_Birth(String Date_of_Birth) {
		this.Date_of_Birth =Date_of_Birth;
	}

    public String getDepartment() {
		return Department;
	}

	public void setDepartment(String Department) {
		this.Department =Department;
	}

    public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String Phone_number) {
		this.Phone_number = Phone_number;
	}

    public String getEmail_Id () {
		return Email_Id ;
	}

	public void setEmail_Id (String Email_Id ) {
		this.Email_Id  =Email_Id ;
	}

    public String getpassword () {
		return password ;
	}

	public void setpassword (String password ) {
		this.password  = password ;
	}   
    public String getConform_Password () {
		return Conform_Password ;
	}

	public void setConform_Password (String Conform_Password ) {
		this.Conform_Password  = Conform_Password ;
	}   
    public String getGender () {
		return Gender ;
	}

	public void setGender(String Gender) {
		this.Gender  = Gender ;
	}

	@Override
	public String toString() {
		return "Grievance [id=" + id + ", First_name=" + First_name + ", Last_name=" + Last_name + ", Roll_no="
				+ Roll_no + ", User=" + User + ", Date_of_Birth=" + Date_of_Birth + ", Department=" + Department
				+ ", Phone_number=" + Phone_number + ", Email_Id=" + Email_Id + ", password=" + password
				+ ", Conform_Password=" + Conform_Password + ", Gender=" + Gender + "]";
	}   


	

}