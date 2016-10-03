package services;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 *
 * @author sapk
 */
@Stateless
public class EmployeBean implements EmployeBeanLocal {

    SessionContext ctx;

    @Override
    public void create(String name) {
    }

    public void setSessionContext(SessionContext ctx) {
        this.ctx = ctx;
    }
}
