import java.util.PriorityQueue;

public class Checkpoint {
    private String name;
    private PriorityQueue<Vehicle> vehicles;

    public Checkpoint(String name)
    {
        this.name = name;
        vehicles = new PriorityQueue<Vehicle>(Vehicle.VehicleEmergency.thenComparing(Vehicle.VehicleWeight));
    }

    public void AddVehicle(int weight, boolean isEmergencyVehicle)
    {
        vehicles.add(new Vehicle(weight, isEmergencyVehicle));
    }

    public void LetVehiclePass()
    {
        Vehicle car = vehicles.poll();
        String pre = car.isEmergencyVehicle ? "emergency vehicle " : "normal vehicle ";
        System.out.println(pre + "weighing " + car.weight + " kg passed checkpoint \"" + this.name + "\"" );
    }

    public void LetAllPass()
    {
        while(!vehicles.isEmpty())
        {
            LetVehiclePass();
        }
    }

}
