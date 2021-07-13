
package DAO;


import javax.persistence.*;


public class ManagerFactory {
    private static EntityManagerFactory managerFactory;
    
    public static EntityManager getEntityManager(){
        if(managerFactory == null)
            managerFactory = Persistence.createEntityManagerFactory("EstoqueWorldPU");
        return managerFactory.createEntityManager();
    }
}
