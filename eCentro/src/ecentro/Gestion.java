package ecentro;

import java.util.ArrayList;
import java.util.List;

import utils.Acceso;

public class Gestion implements GestionInterface {

    private static GruposModel grupos = new GruposModel();
    private static Model alumnos = new Model();
    private static UsuariosModel usuarios = new UsuariosModel();

    public Gestion() {

    }

    public Model getGrupos() {
        return grupos;
    }

    public Model getAlumnos() {
        return alumnos;
    }

    public UsuariosModel getUsuarios() {
        return usuarios;
    }

    /*
     * registroUsuario
     * Comprueba si un usuario ya está registrado y, si no, lo registra
     */
    public void registroUsuario() {
        String[] creden = Acceso.introduceEmailContrasena();
        Usuario userAux = new Usuario(creden[0], creden[1]);
        if (usuarios.userExists(userAux))
            System.out.println("Lo sentimos; ese usuario ya existe");
        else {
            String[] info = Acceso.introduceInformacion();
            usuarios.add(new Usuario("", info[0], info[1], creden[0], creden[1]));
        }
    }

    /*
     * compruebaUsuario
     * Comprueba si un grupo ya existe y, si no, lo añade
     */
    public boolean compruebaUsuario() {
        String[] creden = Acceso.introduceEmailContrasena();
        Usuario userAux = new Usuario(creden[0], creden[1]);
        if (usuarios.userExists(userAux))
            if (usuarios.matchPassword(creden[0], creden[1]))
                return true;
        return false;
    }

    @Override
    public String compruebaGrupo() {
        System.out.print("Introduce nombre del grupo: ");
        String nombreGrupo = System.console().readLine();
        if (grupos.groupExists(nombreGrupo))
            return nombreGrupo;
        System.out.println("El grupo introducido no existe");
        return "";
    }

    /*
     * aniadeGrupo
     * Comprueba si un grupo ya existe y, si no, lo añade
     */
    public void aniadeGrupo() {
        System.out.print("Introduce nombre del grupo: ");
        String nomGrupo = System.console().readLine();
        if (grupos.groupExists(nomGrupo)) {
            System.out.println("Lo sentimos; ese grupo ya existe");
        } else {
            grupos.add(new Grupo("", nomGrupo));
        }
    }

    /*
     * borraGrupo
     * Comprueba si el grupo existe y lo borra
     */
    public void borraGrupo() {
        System.out.print("Introduce nombre del grupo: ");
        String nomGrupo = System.console().readLine();
        if (grupos.groupExists(nomGrupo)) {
            Grupo grupoAux = (Grupo) grupos.get(grupos.devuelveId(nomGrupo));
            int opcion = 1;
            if (grupoAux.hayAlumnos()) {
                System.out.println("Ese grupo tiene alumnos, ¿está seguro de que desea borrarlo?");
                do {
                    System.out.print("Opción (1. Sí / 2. No)");
                    opcion = Integer.parseInt(System.console().readLine());
                } while (opcion != 1 & opcion != 2);
            }
            if (opcion == 1)
                grupos.delete(grupos.devuelveId(nomGrupo));
        } else {
            System.out.print("Lo sentimos; ese grupo no existe");
        }
    }

    /*
     * listaAlumnos
     * Se encarga de listar los alumnos del grupo, si hay alumnos en él
     */
    public void listaAlumnos(String grupoExiste) {
        if (grupos.groupExists(grupoExiste)) {
            Grupo grupoAux = (Grupo) grupos.get(grupos.devuelveId(grupoExiste));
            if (grupoAux.hayAlumnos()) {
                List<Alumno> alumnos = grupoAux.getAlumnos();
                for (int i = 0; i < alumnos.size(); i++) {
                    System.out.println(alumnos.get(i));
                }
            } else
                System.out.print("Lo sentimos; ese grupo no dispone de alumnos");
        } else {
            System.out.print("Lo sentimos; ese grupo no existe");
        }
    }

    /*
     * listaAlumnosSinGrupo
     * Se encarga de listar los alumnos que no tengan grupos
     */
    public void listaAlumnosSinGrupo() {
        ArrayList<Identifier> aux = alumnos.clone();
        for (int i = 0; i < aux.size(); i++) {
            if (((Alumno) aux.get(i)).getGrupoId().equals(""))
                System.out.print(((Alumno) aux.get(i)));
        }

    }

    /*
     * borraAlumnoSinGrupo
     */
    public void borraAlumnosSinGrupo() {
        System.out.print("Introduce nombre del alumno: ");
        String nombreAlu = System.console().readLine().toLowerCase();
        System.out.print("Introduce apellido del alumno: ");
        String apellidoAlu = System.console().readLine().toLowerCase();
        ArrayList<Identifier> aux = alumnos.clone();
        for (int i = 0; i < aux.size(); i++) {
            if (((Alumno) aux.get(i)).getNombre().toLowerCase().equals(nombreAlu.toLowerCase())
                    & ((Alumno) aux.get(i)).getGrupoId().equals("") &
                    (((Alumno) aux.get(i)).getApellidos().toLowerCase().equals(apellidoAlu.toLowerCase())))
                alumnos.delete(((Alumno) aux.get(i)).getId());
            else if (((Alumno) aux.get(i)).getNombre().toLowerCase().equals(nombreAlu.toLowerCase()) &
                    (((Alumno) aux.get(i)).getApellidos().toLowerCase().equals(apellidoAlu.toLowerCase())))
                System.out.println("No podemos borrar al usuario. Tiene un grupo asignado");
        }

    }

    /*
     * listaGrupos
     * Se encarga de listar los grupos disponibles
     */
    public void listaGrupos() {
        if (grupos.size() != 0) {
            System.out.println(grupos.toString());
        } else {
            System.out.print("Lo sentimos; no existen grupos");
        }
    }

    /*
     * aniadeAlumno
     * Se encarga de añadir un alumno al HashMap
     */
    public void aniadeAlumno() {
        System.out.print("Introduce nombre del alumno: ");
        String nombreAlu = System.console().readLine();
        System.out.print("Introduce apellidos del alumno: ");
        String apellidosAlu = System.console().readLine();
        alumnos.add(new Alumno("", nombreAlu, apellidosAlu, ""));
    }

    /*
     * aniadeAlumnoGrupo
     * Añade un alumno al grupo
     */
    public void aniadeAlumnoGrupo(String grupoExiste) {
        System.out.print("Introduce nombre del alumno: ");
        String nombreAlu = System.console().readLine();
        System.out.print("Introduce apellido del alumno: ");
        String apellidoAlu = System.console().readLine();
        ArrayList<Identifier> aux = alumnos.clone();
        Grupo grupoAux = (Grupo) grupos.get(grupos.devuelveId(grupoExiste));
        for (int i = 0; i < aux.size(); i++) {
            if (((Alumno) aux.get(i)).getNombre().toLowerCase().equals(nombreAlu.toLowerCase())
                    & ((Alumno) aux.get(i)).getGrupoId().equals("") &
                    (((Alumno) aux.get(i)).getApellidos().toLowerCase().equals(apellidoAlu.toLowerCase()))) {
                ((Alumno) aux.get(i)).setGrupoId(grupoExiste);
                grupoAux.anadeAlumno(((Alumno) aux.get(i)));
            }
        }
    }

    /*
     * borraAlumnoGrupo
     * Borra un alumno del grupo
     */
    public void borraAlumnoGrupo(String grupoExiste) {
        System.out.print("Introduce nombre del alumno: ");
        String nombreAlu = System.console().readLine().toLowerCase();
        System.out.print("Introduce apellido del alumno: ");
        String apellidoAlu = System.console().readLine().toLowerCase();
        Grupo grupoAux = (Grupo) grupos.get(grupos.devuelveId(grupoExiste));
        ArrayList<Identifier> aux = alumnos.clone();
        for (int i = 0; i < aux.size(); i++) {
            if (((Alumno) aux.get(i)).getNombre().toLowerCase().equals(nombreAlu.toLowerCase())
                    & ((Alumno) aux.get(i)).getGrupoId().equals(grupoAux.getId()) &
                    (((Alumno) aux.get(i)).getApellidos().toLowerCase().equals(apellidoAlu.toLowerCase()))) {
                grupoAux.borraAlumno(nombreAlu, apellidoAlu);
            } else if (((Alumno) aux.get(i)).getNombre().toLowerCase().equals(nombreAlu.toLowerCase())
                    & !((Alumno) aux.get(i)).getGrupoId().equals(grupoAux.getId()) &
                    (((Alumno) aux.get(i)).getApellidos().toLowerCase().equals(apellidoAlu.toLowerCase()))) {
                System.out.println("\nEse alumno pertenece a otro grupo");
            }
        }
    }

}
