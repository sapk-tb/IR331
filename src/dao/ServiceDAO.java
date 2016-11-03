package dao;

import entities.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sapk
 */
public class ServiceDAO {

    /**
     * Référence vers le gestionnaire de persistance.
     */
    @PersistenceContext
    EntityManager entityManager;

    /**
     * Default constructor.
     */
    public ServiceDAO() {
        // TODO Auto-generated constructor stub
    }

    public Service findById(Integer id) {
        return entityManager.find(Service.class, id);
    }
}
