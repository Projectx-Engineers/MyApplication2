package projectx.bean;


import java.io.Serializable;

/**
 * Created by yedids on 6/25/2015.
 */
public class UserVehicle implements Serializable{
    private int vehicleId; /* auto generated id used as unique id for all vehicles of a user*/
    private String vehicleMake;/*Honda, Hyundai, etc..*/
    private String vehicleModel;/*City, i10, i20, etc..*/
    private int vehicleCapactity;/*4-seater, 6-seater, 7- seater, etc..*/
    private String registrationNumber;
    private String regsiteredAgainstName;/*Name of the owner against whom vehicle is registered*/

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleCapactity() {
        return vehicleCapactity;
    }

    public void setVehicleCapactity(int vehicleCapactity) {
        this.vehicleCapactity = vehicleCapactity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegsiteredAgainstName() {
        return regsiteredAgainstName;
    }

    public void setRegsiteredAgainstName(String regsiteredAgainstName) {
        this.regsiteredAgainstName = regsiteredAgainstName;
    }
}
