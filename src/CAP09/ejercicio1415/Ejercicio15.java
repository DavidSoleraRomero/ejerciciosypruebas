package CAP09.ejercicio1415;

/* Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
forma aleatoria, que encajen bien y que estén bien colocadas según el juego
del dominó. No hay que controlar si se repiten o no las fichas. */
public class Ejercicio15 {
    public static void main(String[] args) {
        FichaDomino[] fichas = new FichaDomino[8];
        fichas[0] = new FichaDomino(generaFicha(), generaFicha());
        for (int i = 1; i < fichas.length; i++) {
            FichaDomino fichaAux;
            do {
                fichaAux = new FichaDomino(generaFicha(), generaFicha());
            } while (!FichaDomino.encajaDerecha(fichas[i - 1], fichaAux));
            fichas[i] = fichaAux;
        }
        System.out.print(fichas[0]);
        System.out.print(fichas[1]);
        System.out.print(fichas[2]);
        System.out.print(fichas[3]);
        System.out.print(fichas[4]);
        System.out.print(fichas[5]);
        System.out.print(fichas[6]);
        System.out.print(fichas[7]);
    }

    public static int generaFicha() {
        return (int) (Math.random() * 7);
    }
}
