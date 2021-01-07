package registration;

public class Address {
	private int flatNo;
	private String roadName;
	private String city;
	
	Address(){
		
	}
	

	public int getFlatNo() {
		return flatNo;
	}


	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}


	public String getRoadName() {
		return roadName;
	}


	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	Address(int flatNo, String roadName,String city ){
		this.flatNo=flatNo;
		this.roadName=roadName;
		this.city=city;
		
	}

	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", roadName=" + roadName + ", city=" + city + ", ]";
	}
	
	
	
	
}
