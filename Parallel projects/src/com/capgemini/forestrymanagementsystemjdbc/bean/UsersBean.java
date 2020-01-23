package com.capgemini.forestrymanagementsystemjdbc.bean;

import java.io.Serializable;

public class UsersBean implements Serializable{
	
		private String userName;
		private String password;
		private String role;
		private String email;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "ApplicationBean [userName=" + userName + ", password=" + password + ", role=" + role + ", email="
					+ email + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getRole()="
					+ getRole() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}

	}

