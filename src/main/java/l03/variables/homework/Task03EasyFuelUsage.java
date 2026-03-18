package l03.variables.homework;

public class Task03EasyFuelUsage {
    public static void main(String[] args) {
//        Declare distanceKm (int) and fuelLiters (double) for a delivery trip.
//                Calculate litersPer100Km = (fuelLiters / distanceKm) * 100.
//        Add estimatedTripCost using a pricePerLiter variable.
//        Print all metrics with clear labels.
        int distanceKm = 60;
        double fuelLiters = 7.5;
        double pricePerLiter = 1.15;

        double litersPer100Km = (fuelLiters / distanceKm) * 100;

        double estimatedTripCost = fuelLiters * pricePerLiter;

        System.out.printf("Distance : %d KM | Fuel Used : %.2f Liters | Fuel Price : %.2f AZN per Liter | Fuel Usage : %.2f Liter per 100KM | Trip Cost : %.2f AZN",
                distanceKm, fuelLiters, pricePerLiter, litersPer100Km, estimatedTripCost);
    }
}
