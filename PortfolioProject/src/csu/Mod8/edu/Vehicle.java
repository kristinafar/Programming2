package csu.Mod8.edu;

public class Vehicle {
	
	private String make;
	private String model;
	private Double milesperGal;
	
	Vehicle() {}
	
	Vehicle(String make, String model, Double milesperGal) {
		this.make = make;
		this.model = model;
		this.milesperGal = milesperGal;
		}
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public Double getMpg() {
		return milesperGal;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMpg(Double milesperGal) {
		 this.milesperGal = milesperGal;
	} 
	
	@Override
	   public String toString() {
	        return ("\nMake: " + getMake() + "," +
	               " Model: " + getModel() + "," +
	               " MPG: "+ getMpg() + "\n" );  
	   }
	
}


