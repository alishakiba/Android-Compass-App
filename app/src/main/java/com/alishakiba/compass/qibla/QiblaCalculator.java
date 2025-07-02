package com.alishakiba.compass.qibla;

public class QiblaCalculator {
    // Coordinates of the Kaaba in Mecca
    private static final double KAABA_LAT = 21.4225;
    private static final double KAABA_LON = 39.8262;

    /**
     * Calculates the initial bearing (Qibla direction) from the user's location to the Kaaba.
     * @param userLat User latitude in degrees
     * @param userLon User longitude in degrees
     * @return Qibla direction (bearing) in degrees from North (0-360)
     */
    public static double calculateQiblaDirection(double userLat, double userLon) {
        double lat1 = Math.toRadians(userLat);
        double lon1 = Math.toRadians(userLon);
        double lat2 = Math.toRadians(KAABA_LAT);
        double lon2 = Math.toRadians(KAABA_LON);

        double deltaLon = lon2 - lon1;
        double y = Math.sin(deltaLon) * Math.cos(lat2);
        double x = Math.cos(lat1) * Math.sin(lat2) -
                   Math.sin(lat1) * Math.cos(lat2) * Math.cos(deltaLon);

        double bearing = Math.toDegrees(Math.atan2(y, x));
        // Normalize to 0-360
        return (bearing + 360) % 360;
    }
}
