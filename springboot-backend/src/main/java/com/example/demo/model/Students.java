package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import java.sql.Date;
import java.util.Calendar;

@Entity
@Table(name = "Students")
public class Students {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstname")
  private String firstname="";
	@Column(name = "lastname")
  private String lastname="";
	
	@Id
	@NonNull
	@Column(name="studentID")
  private String studentID="";
  @Column(name = "email")
  private String email="";
  @Column(name = "street")
  private String street="";
  @Column(name = "city")
  private String city="";
	@Column(name = "state")
  private String state="";
	@Column(name = "zip")
  private String zip="";
	//@Column(name = "data")
  //private String data="";
  @Column(name = "phone")
  private String phone="";
  //@Column(name = "url")
  //private String url="";
  @Column(name = "dsurvey")
  private String dsurvey="";
  @Column(name = "likes")
  private String likes="";
  @Column(name = "interest")
  private String interest="";
  //@Column(name = "comments")
  //private String comments="";
  //@Column(name = "gradmonth")
  //private String gradmonth="";
  //@Column(name = "gradyear")
  //private String gradyear="";
  @Column(name = "recommend")
  private String recommend="";
  //@Column(name = "mean")
	//private String mean;
	//@Column(name = "std")
	//private String std;
	@Column(name = "recent_date")
	private Date recent_date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
	public Students() {
		
	}
	public Students(String firstname, String lastname, String studentID, String email,String street, String city, String state, String zip, String data, String phone, String url, String dsurvey, String likes, String interest, String comments, String gradmonth, String gradyear, String recommend, String mean, String std, Date recent_date ) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentID = studentID;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		//this.data = data;
		this.phone = phone;
		//this.url = url;
		this.dsurvey = dsurvey;
		this.likes = likes;
		this.interest = interest;
		//this.comments = comments;
		//this.gradmonth = gradmonth;
		//this.gradyear = gradyear;
		this.recommend = recommend;
		//this.mean = mean;
		//this.std = std;
		Calendar calendar = Calendar.getInstance();
		java.sql.Date JDateObj = new java.sql.Date(calendar.getTime().getTime());
		this.recent_date = JDateObj;
	}
  
  public void setFirstName(String firstname) {
      this.firstname = firstname;
  }
  
  public String getFirstName() {
      return firstname;
  }
  
  public void setLastName(String lastname) {
      this.lastname = lastname;
  }
  public String getLastName() {
      return lastname;
  }
  
  public void setStudentID(String studentID) {
      this.studentID = studentID;
  }
  
  public String getStudentID() {
      return studentID;
  }
  
  public void setEmail(String email) {
      this.email = email;
  }
  
  public String getEmail() {
      return email;
  }
  
  
  public void setStreet(String street) {
      this.street = street;
  }
  public String getStreet() {
      return street;
  }
  
  public void setCity(String city) {
      this.city = city;
  }
  
  public String getCity() {
      return city;
  }
  
  public void setState(String state) {
      this.state = state;
  }
  
  public String getState() {
      return state;
  }
  
  public void setZip(String zip) {
      this.zip = zip;
  }
  
  public String getZip() {
      return zip;
  }
  
//  public void setData(String data) {
//      this.data = data;
//  }
//  
//  public String getData() {
//      return data;
//  }
  
  public void setPhone(String phone) {
      this.phone = phone;
  }
  
  public String getPhone() {
      return phone;
  }
  
//  public void setURL(String url) {
//      this.url = url;
//  }
//  
//  public String getURL() {
//      return url;
//  }
  
  public void setDate(String dsurvey) {
      this.dsurvey = dsurvey;
  }
  
  public String getDate() {
      return dsurvey;
  }
  
  public void setLikes(String likes) {
      this.likes = likes;
  }
  
  public String getLikes() {
      return likes;
  }
  
  public void setInterest(String interest) {
      this.interest = interest;
  }
  
  public String getInterest() {
      return interest;
  }
  
//  public void setComments(String comments) {
//      this.comments = comments;
//  }
//  
//  public String getComments() {
//      return comments;
//  }
//  
//  public void setGradMonth(String gradmonth) {
//      this.gradmonth = gradmonth;
//  }
//  
//  public String getGradMonth() {
//      return gradmonth;
//  }
//  
//  public void setGradYear(String gradyear) {
//      this.gradyear = gradyear;
//  }
//  
//  public String getGradYear() {
//      return gradyear;
//  }
  
  public void setRecommend(String recommend) {
      this.recommend = recommend;
  }
  
  public String getRecommend() {
      return recommend;
  }
  
//  public String getMean() {
//		return mean;
//	}
//
//	public void setMean(String mean) {
//		this.mean = mean;
//	}
//
//	public String getStd() {
//		return std;
//	}
//
//	public void setStd(String std) {
//		this.std = std;
//	}
	
	public Date getRecent_date() {
		return recent_date;
	}
  
	public void setRecent_date(Date recent_date) {
		Calendar calendar = Calendar.getInstance();
		java.sql.Date JDateObj = new java.sql.Date(calendar.getTime().getTime());
		this.recent_date = JDateObj;
	}
}