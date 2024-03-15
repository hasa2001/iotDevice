package ejb.impl;

import ejb.remote.Iot;
import jakarta.ejb.Stateless;

@Stateless
public class IotBean implements Iot{

    private double vehicleSpeed;
    private boolean trafficLightStatus;
    private double latitude;
    private double longitude;

    public IotBean() {
    }

    public IotBean(double vehicleSpeed, boolean trafficLightStatus, double latitude, double longitude) {
        this.vehicleSpeed = vehicleSpeed;
        this.trafficLightStatus = trafficLightStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public boolean isTrafficLightStatus() {
        return trafficLightStatus;
    }

    public void setTrafficLightStatus(boolean trafficLightStatus) {
        this.trafficLightStatus = trafficLightStatus;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public Iot simulateRandomData() {
        double randomSpeed = Math.random() * 60 + 20;
        boolean randomLightStatus = Math.random() < 0.5;
        double randomLatitude = Math.random() * 180 - 90;
        double randomLongitude = Math.random() * 360 - 180;

        return new IotBean(randomSpeed, randomLightStatus, randomLatitude, randomLongitude);
    }
}
