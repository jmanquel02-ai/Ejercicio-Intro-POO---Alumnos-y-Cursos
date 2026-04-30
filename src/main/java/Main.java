public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso("Programación Orientada a Objetos", "POO-101");

        Alumno alumno1 = new Alumno("Jonathan", "Manquel", "20240001", "Ingeniería Civil Informática", "jonathan@ufromail.cl");
        Alumno alumno2 = new Alumno("Bastián", "Escobar", "20240002", "Ingeniería Civil Informática", "bastian@ufromail.cl");
        Alumno alumno3 = new Alumno("Vicente", "Flores", "20240003", "Ingeniería Civil Informática", "vicente@ufromail.cl");
        Alumno alumno4 = new Alumno("Camila", "Rojas", "20240004", "Ingeniería Civil Informática", "camila@ufromail.cl");
        Alumno alumno5 = new Alumno("Matías", "Muñoz", "20240005", "Ingeniería Civil Informática", "matias@ufromail.cl");

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarAlumno(alumno3);
        curso.agregarAlumno(alumno4);
        curso.agregarAlumno(alumno5);

        System.out.println("=== CURSO INICIAL ===");
        System.out.println(curso);

        System.out.println("=== BUSQUEDA DE ALUMNO ===");

        String matriculaBuscada = "20240003";

        if (curso.perteneceAlumno(matriculaBuscada)) {
            System.out.println("El alumno con matricula " + matriculaBuscada + " pertenece al curso.");
        } else {
            System.out.println("El alumno con matricula " + matriculaBuscada + " no pertenece al curso.");
        }

        System.out.println();

        System.out.println("=== ELIMINACION DE ALUMNO ===");

        String matriculaEliminar = "20240002";

        if (curso.eliminarAlumno(matriculaEliminar)) {
            System.out.println("El alumno con matricula " + matriculaEliminar + " fue eliminado correctamente.");
        } else {
            System.out.println("No se encontro un alumno con la matricula " + matriculaEliminar + ".");
        }

        System.out.println();

        System.out.println("=== CURSO DESPUES DE ELIMINAR ===");
        System.out.println(curso);
    }
}