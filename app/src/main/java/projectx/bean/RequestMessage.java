package projectx.bean;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by yedids on 6/25/2015.
 */
public class RequestMessage implements Serializable{
    private String requestedUserId;
    private String selectedProviderUserId;
    private Date requestedTime;
    private Date providerAcceptedTime;
    private Date requestorConfirmedTime;
    private boolean hasProviderAccepted;
    private boolean hasRequestorConfirmed;
    private boolean isPermanantLink;

    public String getRequestedUserId() {
        return requestedUserId;
    }

    public void setRequestedUserId(String requestedUserId) {
        this.requestedUserId = requestedUserId;
    }

    public String getSelectedProviderUserId() {
        return selectedProviderUserId;
    }

    public void setSelectedProviderUserId(String selectedProviderUserId) {
        this.selectedProviderUserId = selectedProviderUserId;
    }

    public Date getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(Date requestedTime) {
        this.requestedTime = requestedTime;
    }

    public Date getProviderAcceptedTime() {
        return providerAcceptedTime;
    }

    public void setProviderAcceptedTime(Date providerAcceptedTime) {
        this.providerAcceptedTime = providerAcceptedTime;
    }

    public Date getRequestorConfirmedTime() {
        return requestorConfirmedTime;
    }

    public void setRequestorConfirmedTime(Date requestorConfirmedTime) {
        this.requestorConfirmedTime = requestorConfirmedTime;
    }

    public boolean isHasProviderAccepted() {
        return hasProviderAccepted;
    }

    public void setHasProviderAccepted(boolean hasProviderAccepted) {
        this.hasProviderAccepted = hasProviderAccepted;
    }

    public boolean isHasRequestorConfirmed() {
        return hasRequestorConfirmed;
    }

    public void setHasRequestorConfirmed(boolean hasRequestorConfirmed) {
        this.hasRequestorConfirmed = hasRequestorConfirmed;
    }

    public boolean isPermanantLink() {
        return isPermanantLink;
    }

    public void setIsPermanantLink(boolean isPermanantLink) {
        this.isPermanantLink = isPermanantLink;
    }
}
