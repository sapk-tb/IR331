package services;

import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 *
 * @author sapk
 */
@Stateless
@LocalBean
public class EmployeBean implements IEmployeBean {

    SessionContext ctx;

    @Override
    public void create(String name) {
    }
}
