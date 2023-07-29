package modelo;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Area {

    @Id
    @SequenceGenerator(name = "sec_area", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_area")
    private Long id;

    private String nombre;

    // El area conoce a todos los cursos
    @OneToMany(mappedBy = "area")
    private Set<Curso> cursos;

    // muchas areas se relacionann con el mismo Coatic
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Coatic coatic;

    public Area() {
    }

    public Area(Long id, String nombre, Set<Curso> cursos, Coatic coatic) {
        this.id = id;
        this.nombre = nombre;
        this.cursos = cursos;
        this.coatic = coatic;
    }

    Area(String nombre, Coatic coatic) {
        this.nombre = nombre;
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

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    public void quitarCurso(Curso curso){
        this.cursos.remove(curso);
    }

}
