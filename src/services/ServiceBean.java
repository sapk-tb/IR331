/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ServiceBean implements IServiceBean {

    SessionContext ctx;

    @Override
    public void create() {
        //TODO
    }
/*
    @Override
    public String list() {
        //TODO
        return "TODO";
    }
*/
    @Override
    public void attachEmployé() {
    }

}
