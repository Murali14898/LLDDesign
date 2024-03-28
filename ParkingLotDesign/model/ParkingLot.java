package ParkingLotDesign.model;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    List<VechileType> allowedVechiles;
    int capacity;
    private ParkingLotStatus status;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VechileType> getAllowedVechiles() {
        return allowedVechiles;
    }

    public void setAllowedVechiles(List<VechileType> allowedVechiles) {
        this.allowedVechiles = allowedVechiles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
}
