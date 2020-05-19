package Cars;

public class Paint extends VehicleDecorator{
	
	Vehicle vehicle;
	public Paint(Vehicle avehicle)
	{
		vehicle= avehicle;
		toString();
		getCost();
		
	}
	public String toString()
	{
		return vehicle.toString() + ", fancy paint";
	}
	public double getCost()
	{
		return vehicle.getCost() + 150;
	}
	

}
