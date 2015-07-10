package projectx.factory;

import projectx.exception.BackEndException;
import projectx.service.IBackEndService;
import projectx.service.impl.ParseBackendService;

/**
 * Created by yedids on 7/1/2015.
 */
public class BackEndFactory {

    private static IBackEndService backEndService;


    public static IBackEndService getBackEndService() throws BackEndException {
        if(backEndService == null){
            backEndService = new ParseBackendService();
        }
        return backEndService;
    }
}
