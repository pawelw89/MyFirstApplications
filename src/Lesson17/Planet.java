package Lesson17;

public enum Planet {
    EARTH(6371, "Ziemia"),
    VENUS(6051.8, "Wenus"),
    MARS(3389.5, "Mars");

    private double radius;

    private String polishName;

    Planet(double radius, String polishName) {
        this.radius = radius;
        this.polishName = polishName;
    }

    private Planet (double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getEquatorLength() {
        return radius * 2 * Math.PI;
    }

    public String getPolishName() {
        return polishName;
    }

    public static Planet fromPolishName(String polishName) {
        for(Planet planet : values()) {
            if(planet.polishName.equals(polishName)) {
                return planet;
            }
        }
        throw new IllegalArgumentException("There are no planet with Polish name: " + polishName);
    }
}
