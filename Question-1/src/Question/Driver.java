package Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public String ID = new String();
    public String name = new String();
    
    public String modelNumber  = new String();
    public String engineType  = new String();
    public String enginePower  = new String();
    public String tireSize  = new String();
    
  
    public String newCar = new String();
    public String turbo = new String();
    public String weight = new String();
   
 
    public static void main(String[] args) {
    	new Driver();
    	
    }
 
    public Driver() {
 
        Scanner input = new Scanner(System.in);
        ArrayList<VehicleType> vehiclePack = new ArrayList<VehicleType>();
 
        System.out.println("Welcome to the Vehicle interface.");
        System.out.println("Please select a number from the options below.");
        System.out.println("");
 
        while (true) {
            System.out.println("1: Add a Vehicle Type to the vehicle Pack.");
            System.out.println("2: Remove a Vehicle Type from the vehicle Pack.");
            System.out.println("3: Search for a specific Vehicle Type.");
            System.out.println("4: Display your Vehicle Type pack.");
            System.out.println("0: Exit the Vehicle pack interface.");
 
            // Get the user input
            int userChoice = input.nextInt();
 
            switch (userChoice) {
                case 1:
                    typeSwitch(vehiclePack);
                    break;
                case 2:
                	removeVechicle(vehiclePack);
                    break;
                case 3:
                    searchPlants(vehiclePack);
                    break;
                case 4:
                	displayList(vehiclePack);
                    break;
                case 0:
                    exitInterface();
                    break;
                default:
                    System.out.println("Invalid entry. \nPlease choose between 1-5, or 0: ");
                    break;
            }
        }
    }
   
    public void typeSwitch(ArrayList<VehicleType> vehiclePack) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Please enter what type of Vehicle you are adding: ");
        System.out.println("1: Normal");
        System.out.println("2: Sports");
        System.out.println("3: Heavy");
 
        int type = input.nextInt();
 
        if (type >= 1 && type <= 3) {
 
            switch (type) {
                case 1:
                    addNormal(vehiclePack);
                    break;
                case 2:
                    addSports(vehiclePack);
                    break;
                case 3:
                    addHeavy(vehiclePack);
                    break;
                }
            }
        else
        {
            System.out.println("Invalid Entry. Please choose between 1-3: ");
            typeSwitch(vehiclePack);
        }
    }
    
    private void addNormal(ArrayList<VehicleType> vehiclePack) {
 
    	 Vehicle normalVehicle = new Vehicle(ID, name,modelNumber,engineType,enginePower,tireSize);
    	//Vehicle normalVehicle = new vehiclePack(ID, name);
 
        Scanner input = new Scanner(System.in);
        if(vehiclePack.size() < 25)
        {
            System.out.println("Enter the ID number of the Vehicle you wish to add (E.g. V1): ");
            normalVehicle.setID(input.nextLine());
            
            System.out.println("Enter Vehicle Type Name: ");
            normalVehicle.setName(input.nextLine());
           
            System.out.println("Enter the model Number: ");
            normalVehicle.setModelNumber(input.nextLine());
            
            System.out.println("Enter the  Type of Engine : ");
            normalVehicle.setEngineType(input.nextLine());
            
            System.out.println("Enter the Power Engine : ");
            normalVehicle.setEnginePower(input.nextLine());
            
            System.out.println("Enter the  Tire Size of Engine : ");
            normalVehicle.setTireSize(input.nextLine());
 
            vehiclePack.add(normalVehicle);
        }
        else
        {
            System.out.println("You may only hold 25 items in your Vehicle pack. Please remove one before adding another.");
        }
    }

    private void addSports(ArrayList<VehicleType> vehiclePack) {
    	
   	 Sports sports = new Sports(ID, name,modelNumber,engineType,enginePower,tireSize,turbo,newCar);
   	

       Scanner input = new Scanner(System.in);
       if(vehiclePack.size() < 25)
       {
           System.out.println("Enter the ID number of the Vehicle you wish to add (E.g.  V2): ");
           sports.setID(input.nextLine());
           
           System.out.println("Enter Vehicle Type Name: ");
           sports.setName(input.nextLine());
          
           System.out.println("Enter the model Number: ");
           sports.setModelNumber(input.nextLine());
           
           System.out.println("Enter the Type of Engine : ");
           sports.setEngineType(input.nextLine());
           
           System.out.println("Enter the Power of  Engine : ");
           sports.setEnginePower(input.nextLine());
           
           System.out.println("Enter the Tire Size of  Engine : ");
           sports.setTireSize(input.nextLine());
           
           System.out.println("Is this a Turbo vehicle ? Yes or No: : ");
           sports.setTurbo(input.nextLine());

           System.out.println("Is this a New vehicle ? Yes or No: : ");
           sports.setTurbo(input.nextLine());
          

           vehiclePack.add(sports);
       }
       else
       {
           System.out.println("You may only hold 25 items in your Vehicle pack. Please remove one before adding another.");
       }
   }
    
    private void addHeavy(ArrayList<VehicleType> vehiclePack) {
   	 
    	Heavy heavy = new Heavy(ID, name,modelNumber,engineType,enginePower,tireSize,weight);
      	//Vehicle normalVehicle = new vehiclePack(ID, name);

          Scanner input = new Scanner(System.in);
          if(vehiclePack.size() < 25)
          {
        	  System.out.println("Enter the ID number of the Vehicle you wish to add (E.g. V3): ");
        	  heavy.setID(input.nextLine());
              
              System.out.println("Enter Vehicle Type Name: ");
              heavy.setName(input.nextLine());
             
              System.out.println("Enter the model Number: ");
              heavy.setModelNumber(input.nextLine());
              
              System.out.println("Enter the Type of  Engine : ");
              heavy.setEngineType(input.nextLine());
              
              System.out.println("Enter the Power of Engine : ");
              heavy.setEnginePower(input.nextLine());
              
              System.out.println("Enter the Tire Size of Engine : ");
              heavy.setTireSize(input.nextLine());
              
              System.out.println("Is this a Weighted vehicle ? Yes or No: : ");
              heavy.setWeight(input.nextLine());

              vehiclePack.add(heavy);
          }
          else
          {
              System.out.println("You may only hold 25 items in your Vehicle pack. Please remove one before adding another.");
          }
      }
  
    private void removeVechicle(ArrayList<VehicleType> vehiclePack) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Which type of Vehicle do you wish to remove?");
        System.out.println("1: Normal");
        System.out.println("2: Sports");
        System.out.println("3: Heavy");
 
        int type = input.nextInt();
        switch (type) {
 
            case 1:
            	 

                System.out.println("Enter the ID number the vehicle remove: ");
                String id = input.nextLine();
                
                input.nextLine();
                System.out.println("Enter id: ");
                String name = input.nextLine();
 
                System.out.println("Enter Model Name: ");
                String modelNumber = input.nextLine();
                
                System.out.println("Enter Engine Type: ");
                String engineType = input.nextLine();
                
                System.out.println("Enter Power Engine: ");
                String enginePower = input.nextLine();
                
                System.out.println("Enter the TireSize: ");
                String tireSize = input.nextLine();
 
 
                boolean found = false;
 
 
                for (VehicleType vehiclesType : vehiclePack) {
                    if(vehiclesType instanceof VehicleType) {
                    Vehicle flower = (Vehicle) vehiclesType;
                    if(		flower.getID().equals(id) && 
                    		flower.getName().equals(name)&&
                    		flower.getModelNumber().equals(modelNumber)&&
                            flower.getEngineType().equals(engineType) && 
                            flower.getEnginePower().equals(enginePower)&&
                            flower.getTireSize().equals(tireSize)) {
                        vehiclePack.remove(vehiclesType);
                        found = true;
                        break;
                    }
                    }
                }
                if (found)
                {
                    System.out.println("That Vehicle was successfully removed from  inventory.");
                } else
                {
                    System.out.println("That Vehicle  was not found in  inventory.");
                }
                break;
            case 2:
                break;
            case 3:
                break;
        }
 
    }

    private void searchPlants(ArrayList<VehicleType> vehiclePack) {
 
    }
   
    private void displayList(ArrayList<VehicleType> vehiclePack) {
 
        for(VehicleType vehicle : vehiclePack) {
        	
            System.out.println(vehicle);
        }
 
    }
   
    private void exitInterface() {
 
    }
}