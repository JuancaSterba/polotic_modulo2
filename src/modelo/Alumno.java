package modelo;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Alumno {

    @Id
    @SequenceGenerator(name = "sec_alumno", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_alumno")
    private Long id;

    private String nombre;

    private String dni;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;

    // Muchos alumnos conocen muchos cursos
    @ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
    private Set<Curso> cursos;

    // Muchos alumnos conocen a un Coatic
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Coatic coatic;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, Coatic coatic) {
        this.nombre = nombre;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }

}
