package projectx.service.impl;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.Properties;

import projectx.bean.UserDetails;
import projectx.exception.BackEndException;
import projectx.service.IBackEndService;
import projectx.util.Constants;
import projectx.util.ErrorCode;
import projectx.util.JsonUtils;

/**
 * Created by yedids on 7/1/2015.
 */
public class ParseBackendService implements IBackEndService {
    private Properties parseUrls = null;
    private OkHttpClient httpClient = null;

    public ParseBackendService() throws BackEndException {
        //initialize http client
        httpClient = new OkHttpClient();

        //initialize resource bundle
        parseUrls = new Properties();
        try {
            parseUrls.load(this.getClass().getClassLoader().getResourceAsStream("ParseUrls"));
        } catch (IOException e) {
            throw new BackEndException(ErrorCode.ERR_PRJX_LOADING_URL_PROPERTY_FILE, e);
        }
    }

    @Override
    public UserDetails registerUser(UserDetails userDetails) throws BackEndException {
        //get the url
        String registerUserUrl = getUrl(Constants.REGISTER_USER_URL_KEY);

        //form the request body
        RequestBody requestBody = RequestBody.create(MediaType.parse(Constants.MIME_TYPE_JSON), JsonUtils.getJson(userDetails));

        //create the request object
        Request request = new Request.Builder()
                .url(registerUserUrl)
                .headers(ParseBackEndHeadersHelper.getAppAuthHeaders())
                .post(requestBody)
                .build();

        try {
            //send the request
            Response response = httpClient.newCall(request).execute();

            //check if the response is successful
            if (response.isSuccessful()) {
                //return the bean after converting the object to json
                return (UserDetails) JsonUtils.getObject(response.body().string(), UserDetails.class);
            } else {
                //throw back the exception if something went wrong
                throw new BackEndException(getErrorCodeForResponse(response));
            }
        } catch (IOException e) {
            throw new BackEndException(ErrorCode.ERR_PRJX_HTTP_REQUEST, e);
        }
    }

    private String getUrl(String urlKey) {
        return (String) parseUrls.get(urlKey);
    }

    private ErrorCode getErrorCodeForResponse(Response response) {
        //TODO: Create a map between response code and Project X error codes and return the approapriate ErroCode
        // enum value for a given bad response code
        return ErrorCode.ERR_PRJX_HTTP_RESPONSE;
    }
}
