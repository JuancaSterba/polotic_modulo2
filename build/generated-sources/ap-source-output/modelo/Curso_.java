package modelo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alumno;
import modelo.Area;
import modelo.Coatic;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-23T23:24:50", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Area> area;
    public static volatile SingularAttribute<Curso, Coatic> coatic;
    public static volatile SetAttribute<Curso, Alumno> alumnos;
    public static volatile SingularAttribute<Curso, Integer> meses;
    public static volatile SingularAttribute<Curso, Date> inicio;
    public static volatile SingularAttribute<Curso, Long> id;
    public static volatile SingularAttribute<Curso, String> nombre;
    public static volatile SingularAttribute<Curso, Boolean> presencial;

}