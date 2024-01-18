package CAP09._Examen1801.FileSystem;

import java.util.Date;

/**
 * clase File
 */
public class File implements FileEntry {

    private String fileName;
    private Date createdAt = new Date();
    private int level;

    public File(String fileName) {
        this.fileName = fileName;
        this.level = 0;
    }

    public File(String fileName, int level) {
        this.fileName = fileName;
        this.level = level;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        String devuelve = "";
        for (int i = 1; i <= this.level; i++) {
            devuelve = devuelve + "  ";
        }
        devuelve = devuelve + "|_" + this.fileName + " " + this.createdAt + "\n";
        return devuelve;
    }

    /**
     * Indica si el archivo es un directorio
     * 
     * @return si es un objeto de la clase File devuelve false
     *         si es un objeto de la clase Folder devuelve true
     * 
     *         Si lo llama un File, siempre es False
     */
    @Override
    public boolean isDirectory() {
        return false;
    }

    /**
     * Devuelve el nombre del archivo
     * 
     * @return cadena conteniendo el nombre del archivo
     */
    @Override
    public String getName() {
        return this.fileName;
    }

}
/*
 * Implementa la interfaz FileEntry
 * Tiene que almacenar el nombre del archivo (fileName de tipo String)-
 * Tiene que almacenar la fecha de creación (createdAt de tipo Date)-
 * Date es una clase que hay que crear con new. Ej. this.createdAt = new Date()-
 * Si quieres imprimir la fecha que ha almacenado en la variabel createdAt-
 * simplemente haz:-
 * System.out.print(this.createdAt)-
 * Tiene que almacenar el nivel en el que se encuentra el archivo-
 * Ej: Si el archivo está en la raiz del sistema de archivos está en el nivel 0-
 * Si está dentro de una carpeta que está en la raiz del disco está en el nivel-
 * 1 y así sucesivamente-
 * Tiene que haber un constructor que recibe solo el nombre del archivo-
 * En este caso el nivel se configurar a 0-
 * Tiene que haber un constructor que recibe el nombre del archivo y el nivel-
 * En ambos constructores se inicializa la fecha de creación con new Date()-
 */
