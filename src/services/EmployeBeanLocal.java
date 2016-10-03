package services;

import javax.ejb.Local;

/**
 *
 * @author sapk
 */
@Local
public interface EmployeBeanLocal {

    void create(String name);
    
}
