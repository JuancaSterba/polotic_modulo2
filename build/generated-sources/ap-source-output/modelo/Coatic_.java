package modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alumno;
import modelo.Area;
import modelo.Curso;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-23T23:24:51", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Coatic.class)
public class Coatic_ { 

    public static volatile SetAttribute<Coatic, Curso> cursos;
    public static volatile SetAttribute<Coatic, Alumno> alumnos;
    public static volatile SetAttribute<Coatic, Area> areas;
    public static volatile SingularAttribute<Coatic, Long> id;
    public static volatile SingularAttribute<Coatic, String> nombre;

}