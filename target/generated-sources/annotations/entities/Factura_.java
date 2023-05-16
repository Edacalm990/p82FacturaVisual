package entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-16T13:40:48", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> descripcion;
    public static volatile SingularAttribute<Factura, Date> fechaEmision;
    public static volatile SingularAttribute<Factura, Integer> codigoUnico;
    public static volatile SingularAttribute<Factura, Double> totalImporte;

}