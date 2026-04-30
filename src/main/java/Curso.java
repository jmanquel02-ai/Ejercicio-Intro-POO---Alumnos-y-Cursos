import java.util.ArrayList;

public class Curso {

    private String nombre;
    private String codigo;
    private ArrayList<Alumno> alumnos;

    public Curso() {
        this.nombre = "";
        this.codigo = "";
        this.alumnos = new ArrayList<>();
    }

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (alumno == null) {
            return false;
        }

        if (perteneceAlumno(alumno.getNumeroMatricula())) {
            return false;
        }

        alumnos.add(alumno);
        return true;
    }

    public boolean eliminarAlumno(String numeroMatricula) {
        if (numeroMatricula == null || numeroMatricula.isEmpty()) {
            return false;
        }

        for (Alumno alumno : alumnos) {
            if (alumno.getNumeroMatricula().equals(numeroMatricula)) {
                alumnos.remove(alumno);
                return true;
            }
        }

        return false;
    }

    public boolean perteneceAlumno(String numeroMatricula) {
        if (numeroMatricula == null || numeroMatricula.isEmpty()) {
            return false;
        }

        for (Alumno alumno : alumnos) {
            if (alumno.getNumeroMatricula().equals(numeroMatricula)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();

        texto.append("Curso: ").append(nombre).append("\n");
        texto.append("Código: ").append(codigo).append("\n");
        texto.append("Cantidad de alumnos: ").append(alumnos.size()).append("\n");
        texto.append("Listado de alumnos:\n");

        if (alumnos.isEmpty()) {
            texto.append("No hay alumnos registrados en el curso.\n");
        } else {
            for (Alumno alumno : alumnos) {
                texto.append("- ").append(alumno).append("\n");
            }
        }

        return texto.toString();
    }
}