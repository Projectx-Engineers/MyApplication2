package projectx.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yedids on 6/25/2015.
 */

public class UserDetails {
    private String username;
    private String password;
    private Date passPhraseResetDate;
    private String firstName;
    private String lastName;
    private String gender;
    private String mobileNumber;
    private String alternatePhoneNumber;
    private Date dateOfBirth;
    private boolean isEmailVerified;
    private boolean isMobileVerified;
    private boolean isProvider;
    private int userRating; /* rating from 1 to 10 */
    private UserUpload userPhoto;
    private List<UserIdentity> userIdentities;
    private List<UserAddress> userAddresses;
    private List<UserVehicle> userVehicles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getPassPhraseResetDate() {
        return passPhraseResetDate;
    }

    public void setPassPhraseResetDate(Date passPhraseResetDate) {
        this.passPhraseResetDate = passPhraseResetDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    public void setAlternatePhoneNumber(String alternatePhoneNumber) {
        this.alternatePhoneNumber = alternatePhoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isEmailVerified() {
        return isEmailVerified;
    }

    public void setIsEmailVerified(boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public boolean isMobileVerified() {
        return isMobileVerified;
    }

    public void setIsMobileVerified(boolean isMobileVerified) {
        this.isMobileVerified = isMobileVerified;
    }

    public boolean isProvider() {
        return isProvider;
    }

    public void setIsProvider(boolean isProvider) {
        this.isProvider = isProvider;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public UserUpload getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(UserUpload userPhoto) {
        this.userPhoto = userPhoto;
    }

    public List<UserIdentity> getUserIdentities() {
        return userIdentities;
    }

    public void setUserIdentities(List<UserIdentity> userIdentities) {
        this.userIdentities = userIdentities;
    }

    public List<UserAddress> getUserAddresses() {
        return userAddresses;
    }

    public void setUserAddresses(List<UserAddress> userAddresses) {
        this.userAddresses = userAddresses;
    }

    public List<UserVehicle> getUserVehicles() {
        return userVehicles;
    }

    public void setUserVehicles(List<UserVehicle> userVehicles) {
        this.userVehicles = userVehicles;
    }
}
