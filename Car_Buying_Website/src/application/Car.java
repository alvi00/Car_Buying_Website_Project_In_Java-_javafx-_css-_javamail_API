package application;

public class Car implements Vehicle {
	protected String brandName;
	protected String carName;
	protected String carColor;
	protected String carmodelname;
	protected String carPrice;
	
	protected String username;
	protected String phonenumber;
	protected String countryname;
	protected String zipcode;
	protected String creditcardnumber;
	protected String login_name;
	protected String mail;
	

	public Car() {
		this.brandName = "Not initialized yet";
		this.carName = "Not initialized yet";
		this.carColor = "Not initialized yet";
		this.carPrice = "0.0";
		this.carmodelname="Not initialized yet";
		
		this.username = "Not initialized yet";
		this.phonenumber = "Not initialized yet";
		this.countryname = "Not initialized yet";
		this.zipcode = "Not initialized yet";
		this.creditcardnumber="Not initialized yet";
		this.mail="Not initialized yet";
	}
	
	@Override
	public void setCarmodelname(String carmodelname) {
		this.carmodelname = carmodelname;
	}

	@Override
	public String getCarmodelname() {
		return carmodelname;
	}

	@Override
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String getBrandName() {
		return brandName;
	}

	@Override
	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String getCarName() {
		return carName;
	}

	@Override
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@Override
	public String getCarColor() {
		return carColor;
	}

	@Override
	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String getCarPrice() {
		return carPrice;
	}
	
//The new infos are here
	
	
	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getUsername() {
		return username;
	}
	
	@Override
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String getPhonenumber() {
		return phonenumber;
	}
	
	@Override
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	@Override
	public String getCountryname() {
		return countryname;
	}
	
	@Override
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String getZipcode() {
		return zipcode;
	}
	
	
	@Override
	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	@Override
	public String getCreditcardnumber() {
		return creditcardnumber;
	}
	
	
	@Override
	public void set_login_name(String login_name) {
		this.login_name=login_name;
	}
	@Override
	public String get_login_name() {
		return login_name;
	}
	
	@Override
	public void set_email(String mail) {
		this.mail=mail;
	}
	@Override
	public String get_email() {
		return mail;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "The brand of the car is " + brandName+" ."+  "\n\nThe car name is " + carName +" "+carmodelname+" ."
				+ "\n\nThe color of the car is " + carColor+" ." + "\n\nThe price of the car is "
				+ carPrice+" ."+"\n\n The name of the user is "+username+" ."+"\n\nThe E-mail address is "+mail+" ."+" \n\n The Phone number of the user is "+phonenumber
				+"\n\n The Country of the user is "+countryname+" ." +"\n\nThe zipcode of the user is "+zipcode+" ."
				+"\n\nThe credit card number of the user is "+creditcardnumber+" .";
	}
}