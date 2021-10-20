public class main {
    public static void main(String[] args) {
        Checkpoint border = new Checkpoint("Serbian border");
        border.AddVehicle(1355, false);
        border.AddVehicle(2413, true);
        border.AddVehicle(1610, true);
        border.AddVehicle(2301, false);
        border.AddVehicle(1346, true);
        border.AddVehicle(1595, false);
        border.AddVehicle(1864, true);
        border.AddVehicle(1400, false);

        border.LetAllPass();
    }
}
