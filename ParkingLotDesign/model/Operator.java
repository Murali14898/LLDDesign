package ParkingLotDesign.model;

import ParkingLotDesign.model.BaseModel;

public class Operator extends BaseModel {
    String Name;
    String emp_id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }
}
