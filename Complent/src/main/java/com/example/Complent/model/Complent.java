package com.example.Complent.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Complent")
public class Complent{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "Roll_NO")
	private String Roll_NO;

	@Column(name = "Department")
	private String Department;
    
    @Column(name = "Gender")
	private String Gender;

	@Column(name = "Mobile_no")
	private String Mobile_no;

    @Column(name = "grivance_category")
	private String grivance_category;

    @Column(name = "grivance_Description")
	private String grivance_Description;

    public String ggetDepartment;

	public Complent() {

	}
    public  Complent(String Roll_NO, String Department,String Gender,String Mobile_no,String grivance_category,String grivance_Description) {
		this.Roll_NO = Roll_NO;
		this. Department =  Department;
        this.Gender = Gender;
		this.Mobile_no = Mobile_no;
        this.grivance_category =grivance_category;
        this.Department = Department;
        this.grivance_Description = grivance_Description;
        
	}
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRoll_NO() {
        return Roll_NO;
    }
    public void setRoll_NO(String roll_NO) {
        Roll_NO = roll_NO;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public String getMobile_no() {
        return Mobile_no;
    }
    public void setMobile_no(String mobile_no) {
        Mobile_no = mobile_no;
    }
    public String getGrivance_category() {
        return grivance_category;
    }
    public void setGrivance_category(String grivance_category) {
        this.grivance_category = grivance_category;
    }
    public String getGrivance_Description() {
        return grivance_Description;
    }
    public void setGrivance_Description(String grivance_Description) {
        this.grivance_Description = grivance_Description;
    }
    @Override
    public String toString() {
        return "Complent [id=" + id + ", Roll_NO=" + Roll_NO + ", Department=" + Department + ", Gender=" + Gender
                + ", Mobile_no=" + Mobile_no + ", grivance_category=" + grivance_category + ", grivance_Description="
                + grivance_Description + "]";
    }
}
