package ParkingLotDesign.model;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    Date exitTime;
    Token token;
    Gate exitedAt;
    Operator operator;
    List<Payments> payments;
    int totalAmounts;
    BillStatus billStatus;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Gate getExitedAt() {
        return exitedAt;
    }

    public void setExitedAt(Gate exitedAt) {
        this.exitedAt = exitedAt;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }

    public int getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(int totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public enum BillStatus {
        PAID,
        PENDING,
        PARTIALLY_PAID;
    }
}
