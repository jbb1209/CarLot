package Cars;

public class Rims extends VehicleDecorator{
	
	Vehicle vehicle;
	
	public  Rims(Vehicle avehicle)
	{
		vehicle= avehicle;
		toString();
		getCost();
		
	}
	public String toString()
	{
		return vehicle.toString() + ", cool rims";
	}
	public double getCost()
	{
		return vehicle.getCost() + 200.00;
	}
	

}
