package Question;


public class VehicleType {

		public String ID;
	    public String name;
	 
	    public VehicleType(String ID, String name) {
	        this.ID = ID;
	        this.name = name;
	    }
	    public void setID(String ID) {this.ID = ID;}
	    public void setName(String name) {this.name = name;}
	 
	    public String getID() {return ID;}
	    public String getName() {return name;}
	 
	    public String toString() {
	        return "ID: " + this.ID + ", Name: " + this.name;
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if(!(obj instanceof VehicleType)) {
	            return false;
	        }
	        VehicleType vehicleType = (VehicleType) obj;
	        return this.ID.equals(vehicleType.ID) && this.name.equals(vehicleType.name);
	 
	    }
}
