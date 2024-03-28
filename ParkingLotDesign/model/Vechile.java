package ParkingLotDesign.model;

public class Vechile extends BaseModel {
    String vechileName;
    String ownerName;
    VechileType vechileType;

    public String getVechileName() {
        return vechileName;
    }

    public void setVechileName(String vechileName) {
        this.vechileName = vechileName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }
}
