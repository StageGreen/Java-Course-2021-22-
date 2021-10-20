import java.util.Comparator;

public class Vehicle implements Comparable<Vehicle>
{
    public int weight;
    public boolean isEmergencyVehicle;

    public  Vehicle(int weight, boolean isEmergencyVehicle)
    {
        this.weight = weight;
        this.isEmergencyVehicle = isEmergencyVehicle;
    }

    @Override
    public int compareTo(Vehicle vehicle) {

        if(this.isEmergencyVehicle && !vehicle.isEmergencyVehicle)
            return -1;
        else if(!this.isEmergencyVehicle && vehicle.isEmergencyVehicle)
            return 1;
        else
            return 0;
    }

    public static Comparator<Vehicle> VehicleEmergency =
            new Comparator<Vehicle>() {
                @Override
                public int compare(Vehicle vehicle1, Vehicle vehicle2)
                {
                    if(vehicle1.isEmergencyVehicle && !vehicle2.isEmergencyVehicle)
                        return -1;
                    else if(!vehicle1.isEmergencyVehicle && vehicle2.isEmergencyVehicle)
                        return 1;
                    else
                        return 0;
                }
            };

    public static Comparator<Vehicle> VehicleWeight =
            Comparator.comparingInt(vehicle -> vehicle.weight);
}
