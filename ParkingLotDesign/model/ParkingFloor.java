package ParkingLotDesign.model;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private List<ParkingSlot> parkingSlotList;
    int floorNumber;
    ParkingFloorStatus floorStatus;
    List<VechileType> allowedVechiles;

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public List<VechileType> getAllowedVechiles() {
        return allowedVechiles;
    }

    public void setAllowedVechiles(List<VechileType> allowedVechiles) {
        this.allowedVechiles = allowedVechiles;
    }
}
