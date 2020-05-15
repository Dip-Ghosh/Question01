package Question;

	public class Heavy extends VehicleType {

		public String modelNumber;
	    public String engineType;
	    public String enginePower;
	    public String tireSize;
	    public String weight;
	    public int  visitors =30;
		
	    
	   
	    
	    public Heavy(String ID, String name,String modelNumber, String engineType, String enginePower, String tireSize,String weight){
	    	super(ID, name);
	        this.modelNumber=modelNumber;
	        this.engineType=engineType;
	        this.enginePower=enginePower;
	        this.tireSize=tireSize;
	        this.weight=weight;
	    }

		public String getWeight() {
			return weight;
		}




		public void setWeight(String weight) {
			this.weight = weight;
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
		        return super.toString() +  "Model Number: " + this.modelNumber + ",Engine Type: " + this.engineType + ", Engine Power " 
		        			+ this.enginePower + ", Tire Size" + this.tireSize + ", Weight " + this.weight + " ,Total visitors :" + visitors;
		 }
		 
		    @Override
		    public boolean equals(Object obj) {
		        if(!(obj instanceof Heavy)) {
		            return false;
		        }
		        Heavy heavy = (Heavy) obj;
		        return  this.ID.equals(heavy.ID) && 
		        		this.name.equals(heavy.name)&& 
		        		this.modelNumber.equals(heavy.modelNumber)&&
		        		this.engineType.equals(heavy.engineType)&&
		        		this.enginePower.equals(heavy.enginePower)&&
		        		this.tireSize.equals(heavy.tireSize) &&
		        		this.weight.equals(heavy.weight) ;
		    }

	}
