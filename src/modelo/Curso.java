package modelo;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Curso {

    @Id
    @SequenceGenerator(name = "sec_curso", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_curso")
    private Long id;

    private String nombre;

    private int meses;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicio;

    private boolean presencial;

    // Muchos cursos conocen a un area
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Area area;

    // muchos cursos conocen a muchos alumnos     
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "alumno_curso",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private Set<Alumno> alumnos;

    // Muchos cursos conocen a un Coatic
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Coatic coatic;

    public Curso() {
    }

    public Curso(String nombre,Area area, Coatic coatic) {
        this.nombre = nombre;
        this.area = area;
        this.coatic = coatic;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }

    void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

}
