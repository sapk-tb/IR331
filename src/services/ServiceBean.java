/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 *
 * @author sapk
 */
@Stateless
public class ServiceBean implements ServiceBeanLocal {

    SessionContext ctx;

    @Override
    public void create() {
    }

    @Override
    public void attachEmployé() {
    }

    public void setSessionContext(SessionContext ctx) {
        this.ctx = ctx;
    }
}
