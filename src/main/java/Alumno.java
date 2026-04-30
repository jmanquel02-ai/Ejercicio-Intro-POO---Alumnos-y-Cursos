public class Alumno {

    private String nombre;
    private String apellido;
    private String numeroMatricula;
    private String carrera;
    private String correo;

    public Alumno() {
        this.nombre = "";
        this.apellido = "";
        this.numeroMatricula = "";
        this.carrera = "";
        this.correo = "";
    }

    public Alumno(String nombre, String apellido, String numeroMatricula, String carrera, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroMatricula = numeroMatricula;
        this.carrera = carrera;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroMatricula='" + numeroMatricula + '\'' +
                ", carrera='" + carrera + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}