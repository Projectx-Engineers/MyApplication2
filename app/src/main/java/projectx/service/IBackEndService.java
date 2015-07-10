package projectx.service;

import projectx.bean.UserDetails;
import projectx.exception.BackEndException;

/**
 * Created by yedids on 7/1/2015.
 */
public interface IBackEndService {

    /**
     * Method to Register User
     */
    UserDetails registerUser(UserDetails userDetails) throws BackEndException;

    UserDetails checkUserLogin(UserDetails userDetails) throws BackEndException;
}
