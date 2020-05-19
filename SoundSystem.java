package Cars;

public class SoundSystem extends VehicleDecorator{
	
	Vehicle vehicle;
	
	public SoundSystem(Vehicle avehicle)
	{
		vehicle= avehicle;
		toString();
		getCost();
		
	}
	public String toString()
	{
		return vehicle.toString() + ", awesome sound";
	}
	public double getCost()
	{
		return vehicle.getCost() + 350.00;
	}
	

}
