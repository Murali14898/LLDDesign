package ParkingLotDesign.DTOs;

import ParkingLotDesign.model.Gate;
import ParkingLotDesign.model.ParkingSlot;
import ParkingLotDesign.model.Token;
import ParkingLotDesign.model.Vechile;

import java.util.Date;

public class IssueTokenResponseDTO {
    Token token;
    String number;
    Date entryTime;
    Vechile vechile;
    ParkingSlot parkingSlot;
    Gate generatedGate;

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

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
}
