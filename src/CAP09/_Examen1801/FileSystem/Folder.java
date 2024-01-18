package CAP09._Examen1801.FileSystem;

public class Folder extends File implements FolderEntry {

    private Folder carpetaPadre;

    private File[] archivos = new File[100];

    public Folder(Folder carpetaPadre, String nombreCarpeta, int level) {
        super(nombreCarpeta, level);
        this.carpetaPadre = carpetaPadre;
    }

    /**
     * Función que devuelve la carpeta que contiene a dicha carpeta
     * Es un getter de la propiedad parent de la clase Folder
     * 
     * @return devuelve un objeto de tipo Folder
     */
    @Override
    public Folder getParent() {
        return this.carpetaPadre;
    }

    /**
     * Indica si la carpeta está llena
     * El máximo número de elementos que una carpeta puede tener es 100
     * 
     * @return true si está llena, false si no está llena
     */
    @Override
    public boolean isFolderFull() {
        boolean full = true;
        for (int i = 0; i < archivos.length & full; i++) {
            if (archivos[i] == null)
                full = false;
        }
        return full;
    }

    /**
     * Devuelve el número de elementos que contiene la carpeta
     * 
     * @return devuelve un entero conteniendo el número de elementos que contienee
     */
    @Override
    public int getFileCount() {
        int cuenta = 0;
        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i] != null)
                cuenta++;
            else
                break;
        }
        return cuenta;
    }

    /**
     * Devuelve si un archivo/carpeta está en la carpeta
     * 
     * @param fileName nombre del archivo/carpeta
     * @return true, si la carpeta contiene un archivo/carpeta con ese nombre
     */
    @Override
    public boolean isFileInFolder(String fileName) {
        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i] != null)
                if (archivos[i].getFileName().equals(fileName))
                    return true;
        }
        return false;
    }

    /**
     * Añade una carpeta a la carpeta
     * 
     * @param folderName nombre de la carpeta a añadir
     * @return devuelve la carpeta que ha añadido
     * @throws FolderIsFullException      lanza esta excepción cuando la carpeta
     *                                    está llena
     * @throws FileAlreadyExistsException lanza esta excepción si la carpeta ya
     *                                    existe
     */
    @Override
    public Folder addFolder(String folderName) throws FolderIsFullException, FileAlreadyExistsException {
        if (this.isFolderFull()) {
            throw new FolderIsFullException();
        }
        if (this.isFileInFolder(folderName)) {
            throw new FileAlreadyExistsException();
        }
        int indice = getFileCount();
        archivos[indice] = new Folder(this, folderName, this.getLevel() + 1);
        return (Folder) archivos[indice];
    }

    /**
     * Añade un archivo a la carpeta
     * 
     * @param fileName nombre del archivo a añadir
     * @return Devuelve el archivo que se ha añadido
     * @throws FolderIsFullException      lanza esta excepción si la carpeta está
     *                                    llena
     * @throws FileAlreadyExistsException lanza esta excepción si el archivo ya
     *                                    existe en la carpeta
     */
    @Override
    public File addFile(String fileName) throws FolderIsFullException, FileAlreadyExistsException {
        if (this.isFolderFull()) {
            throw new FolderIsFullException();
        }
        if (this.isFileInFolder(fileName)) {
            throw new FileAlreadyExistsException();
        }
        int indice = getFileCount();
        archivos[indice] = new File(fileName, this.getLevel() + 1);
        return archivos[indice];
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    /**
     * Borra un archivo de la carpeta
     * 
     * @param fileName nombre del archivo a borrar
     * @return Devuelve el archivo que se ha borrado de la carpeta
     * @throws FileDoesNotExistsException lanza esta excepción si el archivo no
     *                                    existe en la carpeta
     */
    @Override
    public File removeFile(String fileName) throws FileDoesNotExistsException {
        if (!isFileInFolder(fileName)) {
            throw new FileDoesNotExistsException();
        }
        int posicion = -1;
        for (int i = 0; i < archivos.length & posicion == -1; i++) {
            if (archivos[i] != null)
                if (archivos[i].getFileName().equals(fileName))
                    posicion = i;
        }
        File copiaArchivo = archivos[posicion];
        for (int i = posicion; i < archivos.length - 1; i++) {
            if (archivos[i] != null)
                archivos[i] = archivos[i + 1];
            else
                break;
        }
        return copiaArchivo;
    }

    /**
     * Borra una carpeta de la carpeta
     * 
     * @param folderName nombre de la carpeta a borrar
     * @param recursive  si es true, se borra la carpeta, si es false solo se borra
     *                   si no contiene archivos
     * @return Devuelve la carpeta que se ha borrado
     * @throws FileDoesNotExistsException lanza esta excepción si no existe la
     *                                    carpeta
     * @throws FolderIsNotEmptyException  lanza esta excepción si la carpeta no está
     *                                    vacía y se intenta
     *                                    borrar pasando recursive a false
     */
    @Override
    public File removeFolder(String folderName, boolean recursive)
            throws FileDoesNotExistsException, FolderIsNotEmptyException {
        if (!isFileInFolder(folderName)) {
            throw new FileDoesNotExistsException();
        }
        Folder archivoAux = getFolder(folderName);
        if (!recursive & archivoAux.archivos[0] != null) {
            throw new FolderIsNotEmptyException();
        }
        int posicion = -1;
        for (int i = 0; i < archivos.length & posicion == -1; i++) {
            if (archivos[i] != null)
                if (archivos[i].getFileName().equals(folderName))
                    posicion = i;
        }
        Folder copiaArchivo = (Folder) archivos[posicion];
        for (int i = posicion; i < archivos.length - 1; i++) {
            if (archivos[i] != null)
                archivos[i] = archivos[i + 1];
            else
                break;
        }
        return copiaArchivo;
    }

    /**
     * Devuelve la carpeta cuyo nombre se suministra
     * 
     * @param folderName nombre de la carpeta a devolver
     * @return devuelve la carpeta
     * @throws FileDoesNotExistsException lanza esta excepción si la carpeta no
     *                                    existe
     */
    @Override
    public Folder getFolder(String folderName) throws FileDoesNotExistsException {
        if (!isFileInFolder(folderName)) {
            throw new FileDoesNotExistsException();
        }
        int pos = -1;
        for (int i = 0; i < archivos.length & pos == -1; i++) {
            if (archivos[i].getFileName().equals(folderName))
                pos = i;
        }
        return (Folder) archivos[pos];
    }

    /**
     * Devuelve una cadena de texto indicando el nombre de la carpeta así como los
     * elementos que contiene
     * De la siguiente forma versión 1 (A incluir en la fase 2):
     * Ej: Carpeta folder1 en el nivel 0
     * |_(folder1)
     * Otro Ej: Carpeta folder2 en el nivel 2
     * |_(folder2)
     * Versión 2 (A incluir en la fase 3):
     * Si la carpeta tiene elementos (archivos y carpetas tendrá que mostrarlos
     * también de la siguiente
     * forma:
     * Ej:
     * |_(folder1) <-- Date cuenta que está en el nivel 0
     * |_file1 Tue Jan 17 19:54:28 CET 2023 <-- Date cuenta que está en el nivel 1
     * |_(folder2) <-- Date cuenta que está en el nivel 1
     * |_file2 Tue Jan 17 19:54:28 CET 2023 <-- Date cuenta que está en el nivel 2
     * |_file3 Tue Jan 17 19:54:28 CET 2023 <-- Date cuenta que está en el nivel 2
     * |_(folder3) <-- Date cuenta que está en el nivel 1
     * |_file4 Tue Jan 17 19:54:28 CET 2023 <-- Date cuenta que está en el nivel 2
     * |_file5 Tue Jan 17 19:54:28 CET 2023 <-- Date cuenta que está en el nivel 2
     * 
     * @return una cadena de texto conteniendo la estructura de la carpeta
     */
    @Override
    public String toString() {
        String devuelve = "";
        for (int i = 1; i <= this.getLevel(); i++) {
            devuelve = devuelve + "  ";
        }
        devuelve = devuelve + "|_[" + this.getFileName() + "]\n";
        int indice = this.getFileCount();
        for (int i = 0; i < indice; i++) {
            if (archivos[i].isDirectory()) {
                devuelve = devuelve + archivos[i].toString();
            } else {
                File archivoAux = (File) archivos[i];
                devuelve = devuelve + archivoAux.toString();
            }
        }
        return devuelve;
    }

}
/**
 * clase Folder-
 * Hereda de la clase File e implementa la interfaz FolderEntry-
 * La clase Folder mantiene una lista de archivos/carpetas así como una-
 * referencia a la carpeta que la contiene-
 * La clase Folder al heredar de la clase File hereda sus propiedades
 * name, level y createdAt
 * Además dispondrá de un array donde se irán añadiendo los archivos que están-
 * dentro de la carpeta-
 * Debe implementar la interfaz FolderEntry
 * Debe tener un constructor que recibirá la carpeta que la contiene, en el
 * caso-
 * de que sea la carpeta raiz, recibirá null en la referencia a la carpeta-
 * padre-
 * Además el constructor recibirá el nombre de la carpeta así como el nivel en-
 * el que se encuentra la carpeta (Nivel 0 es la carpeta raiz, Nivel 1 las-
 * carpetas hijas de la carpeta raiz, y así sucesivamente)-
 * Ejemplo de llamada al constructor: Folder root = new Folder(null, "Raiz",
 * 0);-
 */
