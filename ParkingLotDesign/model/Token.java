package ParkingLotDesign.model;

import java.util.Date;

public class Token extends BaseModel {
    String number;
    Date entryTime;
    Vechile vechile;
    ParkingSlot parkingSlot;
    Gate generatedGate;
    Operator generateBy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vechile getVechile() {
        return vechile;
    }

    public void setVechile(Vechile vechile) {
        this.vechile = vechile;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Gate getGeneratedGate() {
        return generatedGate;
    }

    public void setGeneratedGate(Gate generatedGate) {
        this.generatedGate = generatedGate;
    }

    public Operator getGenerateBy() {
        return generateBy;
    }

    public void setGenerateBy(Operator generateBy) {
        this.generateBy = generateBy;
    }
}
