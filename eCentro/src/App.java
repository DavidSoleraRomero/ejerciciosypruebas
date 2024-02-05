
import ecentro.Gestion;
import utils.Acceso;

public class App {
    private static Gestion ecentro = new Gestion();

    public static void main(String[] args) throws Exception {

        /*
         * Model grupos = new Model();
         * Model alumnos = new Model();
         * UsuariosModel usuarios = new UsuariosModel();
         * Usuario usu = (Usuario) usuarios.add(new Usuario("", "Juan", "García",
         * "jgargom214@g.educaand.es", "1234"));
         * Alumno alum = (Alumno) alumnos.add(new Alumno("", "Juan Antonio", "García",
         * ""));
         * Grupo grupo = (Grupo) grupos.add(new Grupo("", "1ºESOA"));
         * grupo.anadeAlumno(alum);
         * List<Alumno> alumnosdelGrupo = grupo.getAlumnos();
         * System.out.println(alumnosdelGrupo);
         * System.out.println(usuarios.userExists(usu));
         * System.out.println(usuarios.matchPassword("jgargom214@g.educaand.es",
         * "1234"));
         */

        int opcion = 0;
        do {
            Acceso.menuUsuario();
            try {
                opcion = entradaInt();
            } catch (Exception e) {
                System.out.println("Introduce un nº");
            }
            ejecutaOpcionGestion(opcion);
        } while (opcion != 3);
    }

    public static void ejecutaOpcionGestion(int opcion) {
        switch (opcion) {
            case 1: {
                boolean existe = ecentro.compruebaUsuario();
                if (existe) {
                    System.out.println("\nAccediendo a la gestión...");
                    do {
                        Acceso.menuGestion();
                        try {
                            opcion = entradaInt();
                        } catch (Exception e) {
                            System.out.println("Introduce un nº");
                        }
                        System.out.println();
                        switch (opcion) {
                            case 1:
                                ecentro.aniadeGrupo();
                                break;
                            case 2:
                                ecentro.listaGrupos();
                                break;
                            case 3:
                                String grupoExiste = ecentro.compruebaGrupo();
                                if (!grupoExiste.equals(""))
                                    do {
                                        Acceso.menuListarGrupo();
                                        opcion = entradaInt();
                                        switch (opcion) {
                                            case 1:
                                                ecentro.aniadeAlumnoGrupo(grupoExiste);
                                                break;
                                            case 2:
                                                ecentro.borraAlumnoGrupo(grupoExiste);
                                                break;
                                            case 3:
                                                ecentro.listaAlumnos(grupoExiste);
                                                break;
                                            case 4:
                                                break;
                                            default:
                                                System.out.println("Opción incorrecta introducida");
                                        }
                                    } while (opcion != 4);
                                break;
                            case 4:
                                ecentro.borraGrupo();
                                break;
                            case 5:
                                ecentro.aniadeAlumno();
                                break;
                            case 6:
                                ecentro.listaAlumnosSinGrupo();
                                break;
                            case 7:
                                ecentro.borraAlumnosSinGrupo();
                                break;
                            case 8:
                                System.out.println("\nCerrando sesión...");
                                break;
                            default:
                                System.out.println("Opción incorrecta introducida");
                        }
                        System.out.println();
                    } while (opcion != 8);
                } else
                    System.out.println("Lo sentimos; alguna credencial introducida es incorrecta.");
            }
                break;
            case 2: {
                ecentro.registroUsuario();
            }
                break;
            case 3:
                System.out.println("\nCerrando eCentro...");
                break;
            default:
                System.out.println("Opción incorrecta introducida");
        }
    }

    public static int entradaInt() {
        return (int) (Integer.parseInt(System.console().readLine()));
    }

}
