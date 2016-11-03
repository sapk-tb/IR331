package services;

import javax.ejb.Remote;

/**
 *
 * @author sapk
 */
@Remote
public interface IEmployeBean {

    void create(String name);
    
}
