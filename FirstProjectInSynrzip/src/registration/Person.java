package registration;

public class Person {
	private String firstName;
	private String middleName;
	private String LastName;
	private long mobileNo;
	private Address addr;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName + ", LastName=" + LastName
				+ ", mobileNo=" + mobileNo + ", addr=" + addr.toString() + "]";
	}
	
	public void person_details() {
		
		System.out.println("First Name :"+firstName);
		System.out.println("Middle Name :"+middleName);
		System.out.println("Last Name :"+LastName);
		System.out.println("Mobile No :"+mobileNo);
		System.out.println("Address :"+getAddr().toString());
		
	}
	
	
	

	

}
