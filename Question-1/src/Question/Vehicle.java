package Question;


public class Vehicle extends VehicleType {

	public String modelNumber;
    public String engineType;
    public String enginePower;
    public String tireSize;
    public int visitors = 30;

    
    public Vehicle(String ID, String name,String modelNumber, String engineType, String enginePower, String tireSize){
    	super(ID, name);
        this.modelNumber=modelNumber;
        this.engineType=engineType;
        this.enginePower=enginePower;
        this.tireSize=tireSize;
    }

    
	public String getModelNumber() {
		return modelNumber;
	}

	
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}


	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public String getEnginePower() {
		return enginePower;
	}


	public void setEnginePower(String enginePower) {
		this.enginePower = enginePower;
	}


	public String getTireSize() {
		return tireSize;
	}


	public void setTireSize(String tireSize) {


		this.tireSize = tireSize;
	}
	
	 
	 public String toString() {
	        return super.toString() +  " ,Model Number: " + this.modelNumber + ",Engine Type: " + this.engineType + ", Engine Power: " + this.enginePower + ", Tire Size: " + this.tireSize + " ,Total visitors :" +  visitors;
	 }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if(!(obj instanceof Vehicle)) {
	            return false;
	        }
	        Vehicle vehicle = (Vehicle) obj;
	        return  this.ID.equals(vehicle.ID) && 
	        		this.name.equals(vehicle.name)&& 
	        		this.modelNumber.equals(vehicle.modelNumber)&&
	        		this.engineType.equals(vehicle.engineType)&&
	        		this.enginePower.equals(vehicle.enginePower)&&
	        		this.enginePower.equals(vehicle.tireSize);
	    }
}

