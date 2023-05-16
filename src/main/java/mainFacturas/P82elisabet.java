/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mainFacturas;

import application.View;
import controllers.FacturaJpaController;
import entities.Factura;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eli
 */
public class P82elisabet {

    public static void main(String[] args) {
        FacturaJpaController controladorFactura = new FacturaJpaController(Persistence.createEntityManagerFactory("p82"));
        View vistaPrincipal= new View();
        vistaPrincipal.setVisible(true);
        vistaPrincipal.setLocationRelativeTo(null);
    }

    // Crea un objeto EntityManager usando una unidad de persistencia
    private static EntityManager getEntityManager() {
        // EntityManager permite realizar operaciones con la BD
        // Se obtiene a través del EntityManagerFactory y este a su vez se genera
        // a partir del nombre de la unidad de persistencia (fichero persistence.xml)
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("p82");
        EntityManager em = entityManagerFactory.createEntityManager();
        return em;
    }
}
