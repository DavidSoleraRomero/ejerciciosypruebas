package CAP09.ejercicio1415;

/* Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
forma aleatoria, que encajen bien y que estén bien colocadas según el juego
del dominó. No hay que controlar si se repiten o no las fichas. */
public class Ejercicio15 {
    public static void main(String[] args) {
        FichaDomino[] fichas = new FichaDomino[8];
        fichas[0] = new FichaDomino(generaFicha(), generaFicha());
        int ficha1;
        int ficha2;
        for (int i = 1; i < fichas.length; i++) {
            do {
                ficha1 = generaFicha();
                ficha2 = generaFicha();
            } while (ficha1 != fichas[i - 1].getLado0() & ficha1 != fichas[i - 1].getLado1()
                    & ficha2 != fichas[i - 1].getLado0() & ficha2 != fichas[i - 1].getLado1());
            fichas[i] = new FichaDomino(ficha1, ficha2);
        }
        System.out.println(fichas[0].encaja(fichas[1]));
        System.out.println(fichas[1].encaja(fichas[2]));
        System.out.println(fichas[2].encaja(fichas[3]));
        System.out.println(fichas[3].encaja(fichas[4]));
        System.out.println(fichas[4].encaja(fichas[5]));
        System.out.println(fichas[5].encaja(fichas[6]));
        System.out.println(fichas[6].encaja(fichas[7]));
        System.out.println(fichas[0].encaja(fichas[7]));
    }

    public static int generaFicha() {
        return (int) (Math.random() * 7);
    }
}
