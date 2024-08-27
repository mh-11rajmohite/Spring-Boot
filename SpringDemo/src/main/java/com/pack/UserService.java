package com.pack;

public class UserService {

	EmailService eService;
	PasswordService pService;
	User user;

	public UserService() {
		super();
		// TODO Auto-generated constructor stub

		System.out.println("UserService constructor executed");

	}

	public EmailService geteService() {
		return eService;
	}

	public void seteService(EmailService eService) {
		this.eService = eService;
	}

	public PasswordService getpService() {
		return pService;
	}

	public void setpService(PasswordService pService) {
		this.pService = pService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
