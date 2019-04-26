package com.cc.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long userId;
	    private String name;
	    private String userType;
	    private String gender;
	    private String nationality;
	    private String dietPreference;
	    private String otherInfo;
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getDietPreference() {
			return dietPreference;
		}
		public void setDietPreference(String dietPreference) {
			this.dietPreference = dietPreference;
		}
		public String getOtherInfo() {
			return otherInfo;
		}
		public void setOtherInfo(String otherInfo) {
			this.otherInfo = otherInfo;
		}
	    
}
