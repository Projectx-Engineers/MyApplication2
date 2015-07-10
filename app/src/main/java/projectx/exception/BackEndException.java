package projectx.exception;

import projectx.util.ErrorCode;

/**
 * Created by yedids on 7/1/2015.
 */
public class BackEndException extends Exception {

    private ErrorCode errorCode;


    public BackEndException(ErrorCode errorCode, Exception e){
        super(errorCode.toString(), e);
        this.errorCode = errorCode;
    }

    public BackEndException(ErrorCode errorCode) {
        super(errorCode.toString());
        this.errorCode = errorCode;
    }
        /**
         * Returns the Error code
         * @return
         */
    public ErrorCode getErrorCode(){
        return errorCode;
    }

    /**
     * Returns the Error code
     * @return
     */
    public String getErrorCodeString(){
        return errorCode.toString();
    }

}
