package modelo;

import java.util.Set;
import javax.persistence.*;
import persistencia.Persistencia;

@Entity
public class Coatic {

    @Id
    private Long id;

    private String nombre;

    private static Persistencia persistencia;

    // Coatic conoce a todos los alumnos
    @OneToMany(mappedBy = "coatic")
    private Set<Alumno> alumnos;

    // Coatic conoce a todas las areas
    @OneToMany(mappedBy = "coatic")
    private Set<Area> areas;

    // Coatic conoce a todos los cursos
    @OneToMany(mappedBy = "coatic")
    private Set<Curso> cursos;

    public Coatic() {
    }

    public Coatic(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;

        // cuando se contruye el coatic 
        // se guarda en la base de datos a si misma
        Coatic.persistencia.insertar(this);
    }

    static {
        persistencia = new Persistencia();
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

    public static Persistencia getPersistencia() {
        return persistencia;
    }

    public static void setPersistencia(Persistencia persistencia) {
        Coatic.persistencia = persistencia;
    }

    public Set<Area> getAreas() {
        return areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    // coatic gestiona las areas
    public void crearArea(String nombre) {
        Area area = new Area(nombre, this);
        this.areas.add(area);
        Coatic.getPersistencia().insertar(area);

    }

    public void modificarArea(Area area, String nombre) {
        if (area != null) {
            area.setNombre(nombre);
            Coatic.getPersistencia().modificar(area);

        }
    }

    public void eliminarArea(Area area) {
        if (area != null) {
            Coatic.getPersistencia().eliminar(area);

        }
    }
    
    // coatic gestiona los cursos
    public void crearCurso(String nombre, Area area) {
        Curso curso = new Curso(nombre, area, this);
        this.cursos.add(curso);
        Coatic.getPersistencia().insertar(curso);

    }

    public void modificarCurso(Curso curso, String nombre, Area nArea) {
        if (curso != null) {
            curso.setNombre(nombre);
            Area area = curso.getArea();
            if (!nArea.equals(area)){
                area.quitarCurso(curso);
                Coatic.getPersistencia().modificar(area);
                
                nArea.agregarCurso(curso);
                Coatic.getPersistencia().modificar(nArea);
                
                curso.setArea(nArea);
            }
            Coatic.getPersistencia().modificar(curso);

        }
    }

    public void eliminarCurso(Curso curso) {
        if (curso != null) {
            Coatic.getPersistencia().eliminar(curso);

        }
    }

    public void crearAlumno(String nombre, String dni) {
        Alumno alumno = new Alumno(nombre, dni, this);
        this.alumnos.add(alumno);
        Coatic.getPersistencia().insertar(alumno);
    }

    public void modificarAlumno(Alumno alumno, String nombre, String dni) {
        if (alumno != null) {
            alumno.setNombre(nombre);
            alumno.setDni(dni);            
            Coatic.getPersistencia().modificar(alumno);
        }
    }

    public void eliminarAlumno(Alumno alumno) {
        if (alumno != null) {
            
            Coatic.getPersistencia().eliminar(alumno);
        }
    }

    public void inscribir(Alumno alumno, Curso curso) {
        alumno.agregarCurso(curso);
        Coatic.getPersistencia().modificar(alumno);
        curso.agregarAlumno(alumno);
        Coatic.getPersistencia().modificar(curso);
    }
    
    

}
