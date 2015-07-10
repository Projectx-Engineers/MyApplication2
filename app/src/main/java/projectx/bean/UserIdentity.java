package projectx.bean;


/**
 * Created by yedids on 6/25/2015.
 */
public class UserIdentity {
    private String identityType; /* SSN, Aadhar, Passport, Pan card, etc...*/
    private String identityNumber;
    private UserUpload identityFile; /* Image uploaded as ID proof */

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public UserUpload getIdentityFile() {
        return identityFile;
    }

    public void setIdentityFile(UserUpload identityFile) {
        this.identityFile = identityFile;
    }
}
