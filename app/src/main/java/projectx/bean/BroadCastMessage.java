package projectx.bean;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by yedids on 6/25/2015.
 */
public class BroadCastMessage implements Serializable{

    public static enum AVAILABLE_DAYS {MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY};

    public static enum AVAILABILITY_TYPE {DAILY, BI_WEEKLY, WEEKLY,
        FORTNIGHTLY, MONTHLY, YEARLY}

    private String userId;
    private String sourceLocation;
    private String sourceLongitude;
    private String sourceLatitude;
    private String destinationLocation;
    private String destinationLongitude;
    private String destinationLatitude;
    private boolean isRoundTrip;
    private Date startTime;
    private Date returnTime;
    private boolean isActive; /* in case of vacation or holidays*/
    private Date availableFrom;
    private Date availableTill;
    private int availabilityType;
    private int availableDays;
    private int providedCapacity;
    private int providedReturnCapacity;
    private int amount;
    private int vehicleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public String getSourceLongitude() {
        return sourceLongitude;
    }

    public void setSourceLongitude(String sourceLongitude) {
        this.sourceLongitude = sourceLongitude;
    }

    public String getSourceLatitude() {
        return sourceLatitude;
    }

    public void setSourceLatitude(String sourceLatitude) {
        this.sourceLatitude = sourceLatitude;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDestinationLongitude() {
        return destinationLongitude;
    }

    public void setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
    }

    public String getDestinationLatitude() {
        return destinationLatitude;
    }

    public void setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
    }

    public boolean isRoundTrip() {
        return isRoundTrip;
    }

    public void setIsRoundTrip(boolean isRoundTrip) {
        this.isRoundTrip = isRoundTrip;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(Date availableFrom) {
        this.availableFrom = availableFrom;
    }

    public Date getAvailableTill() {
        return availableTill;
    }

    public void setAvailableTill(Date availableTill) {
        this.availableTill = availableTill;
    }

    public int getAvailabilityType() {
        return availabilityType;
    }

    public void setAvailabilityType(int availabilityType) {
        this.availabilityType = availabilityType;
    }

    public int getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(int availableDays) {
        this.availableDays = availableDays;
    }

    public int getProvidedCapacity() {
        return providedCapacity;
    }

    public void setProvidedCapacity(int providedCapacity) {
        this.providedCapacity = providedCapacity;
    }

    public int getProvidedReturnCapacity() {
        return providedReturnCapacity;
    }

    public void setProvidedReturnCapacity(int providedReturnCapacity) {
        this.providedReturnCapacity = providedReturnCapacity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

}
