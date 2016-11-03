package dao;

import entities.Employe;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sapk
 */
public class EmployeDAO {

    /**
     * Référence vers le gestionnaire de persistance.
     */
    @PersistenceContext
    EntityManager entityManager;

    /**
     * Default constructor.
     */
    public EmployeDAO() {
        // TODO Auto-generated constructor stub
    }

    public Employe findById(Integer id) {
        return entityManager.find(Employe.class, id);
    }
}
