package Question;

public class Sports extends VehicleType {

	public String modelNumber;
    public String engineType;
    public String enginePower;
    public String tireSize;
    public String turbo;
    public int visitors =30 ;
    public String newCar;
    
    

    
    public Sports(String ID, String name,String modelNumber, String engineType, String enginePower, String tireSize,String turbo,String newCar){
    	super(ID, name);
        this.modelNumber=modelNumber;
        this.engineType=engineType;
        this.enginePower=enginePower;
        this.tireSize=tireSize;
        this.turbo=turbo;
        this.newCar= newCar;
      
    }

    
	public String getNewCar() {
		return newCar;
	}


	public void setNewCar(String newCar) {
		this.newCar = newCar;
	}

	public void totalVisitors()
	{
		if(this.newCar == "yes" || this.newCar == "Yes")
		{
			visitors = visitors +20;
		}
		else {
			visitors = 30;
		}
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
	
	
	 
	    public String getTurbo() {
		return turbo;
	}


	public void setTurbo(String turbo) {
		this.turbo = turbo;
	}

	public String toString() {
	        return super.toString() +  "Model Number: " + this.modelNumber + ",Engine Type: " + this.engineType + ", Engine Power "
	        			+ this.enginePower + ", Tire Size " + this.tireSize + ", Turbo " + this.turbo+ " ,Total visitors :" +  visitors;
	 }

		@Override
	    public boolean equals(Object obj) {
	        if(!(obj instanceof Vehicle)) {
	            return false;
	        }
	        Sports sports = (Sports) obj;
	        return  this.ID.equals(sports.ID) && 
	        		this.name.equals(sports.name)&& 
	        		this.modelNumber.equals(sports.modelNumber)&&
	        		this.engineType.equals(sports.engineType)&&
	        		this.enginePower.equals(sports.enginePower)&&
	        		this.tireSize.equals(sports.tireSize) &&
	        		this.turbo.equals(sports.turbo);
	    }


}
