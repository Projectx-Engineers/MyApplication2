package projectx.service.impl;

import com.squareup.okhttp.Headers;

import projectx.util.Constants;

/**
 * Created by yedids on 7/1/2015.
 */
public class ParseBackEndHeadersHelper {

    public static Headers getAdminAuthHeaders(){
        Headers headers = new Headers.Builder()
                .add(ParseConstants.HTTP_HEADER_LOGIN_NAME,"Parse-login-id")
                .add(ParseConstants.HTTP_HEADER_LOGIN_PASS,"Parse-password")
                .add(Constants.HTTP_HEADER_CONTENT_TYPE, Constants.MIME_TYPE_JSON)
                .build();
        return headers;
    }

    public static Headers getAppAuthHeaders(){
        Headers headers = new Headers.Builder()
                .add(ParseConstants.HTTP_HEADER_APP_ID, "xaQ8rzAatFpsnCphua8Y4aoPpAmFybs485tQ8nZM")
                .add(ParseConstants.HTTP_HEADER_CLIENT_KEY, "sFBnu9OqwxxwRU7ulV82fDexpVTjbvg7ismgo9uK")
                /*.add(ParseConstants.HTTP_HEADER_REST_API_KEY, "VvDSRm61U708AWF3b3AFJdKlseI0ubilw7hysqmj")*/
                .add(ParseConstants.HTTP_HEADER_REVOCABLE_SESSION, "1")
                .add(Constants.HTTP_HEADER_CONTENT_TYPE, Constants.MIME_TYPE_JSON)
                .build();
        return headers;
    }


}
