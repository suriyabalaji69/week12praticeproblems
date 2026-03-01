Public class EarthVolume {
    public static void main(String[] args) {
        double rKm = 6378;
        double pi = 3.14159;
        double volKm = (4.0/3.0) * pi * Math.pow(rKm, 3);
        double rMiles = rKm / 1.6;
        double volMiles = (4.0/3.0) * pi * Math.pow(rMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volKm + 
            " and cubic miles is " + volMiles);
    }
}