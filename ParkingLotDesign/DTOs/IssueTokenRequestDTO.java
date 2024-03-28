package ParkingLotDesign.DTOs;

import ParkingLotDesign.model.VechileType;

public class IssueTokenRequestDTO {
    private String vechileNumber;
    String OwnerName;
    long GateId;
    VechileType vechileType;

    public String getVechileNumber() {
        return vechileNumber;
    }

    public void setVechileNumber(String vechileNumber) {
        this.vechileNumber = vechileNumber;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public long getGateId() {
        return GateId;
    }

    public void setGateId(long gateId) {
        GateId = gateId;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }
}
