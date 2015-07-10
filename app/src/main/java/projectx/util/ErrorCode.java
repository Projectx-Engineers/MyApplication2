package projectx.util;

/**
 * Created by yedids on 7/3/2015.
 */
public enum ErrorCode {
    /**
     * Error code returned when the Url Properties file could not be loaded
     */
    ERR_PRJX_LOADING_URL_PROPERTY_FILE,

    /**
     * Error code returned when the exception occurred during a http request
     */
    ERR_PRJX_HTTP_REQUEST,

    /**
     * Error code returned when the response returned is a bad status value
     */
    ERR_PRJX_HTTP_RESPONSE,

    /**
     * Error code returned when the async task throws a InterruptedException exception
     */
    ERR_PRJX_ASYNC_TASK_INTERRUPTED,

    /**
     * Error code returned when the async task throws a ExecutionException exception
     */
    ERR_PRJX_ASYNC_TASK_EXCEPTION

    ;

}
