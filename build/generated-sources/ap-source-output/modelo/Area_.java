package modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Coatic;
import modelo.Curso;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-23T23:24:50", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Coatic> coatic;
    public static volatile SetAttribute<Area, Curso> cursos;
    public static volatile SingularAttribute<Area, Long> id;
    public static volatile SingularAttribute<Area, String> nombre;

}