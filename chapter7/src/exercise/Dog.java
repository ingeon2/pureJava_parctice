package exercise;

public class Dog {
	
	private String Name;
	private String type;
	
	public Dog(String Name , String type) {
		this.Name = Name;
		this.type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = Name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String showDogInfo() {
		return Name + " , " + type;
	}
	
	

}
