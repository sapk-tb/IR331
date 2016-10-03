/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ejb.Local;

/**
 *
 * @author sapk
 */
@Local
public interface ServiceBeanLocal {

    void create();

    void attachEmployé();
    
}
