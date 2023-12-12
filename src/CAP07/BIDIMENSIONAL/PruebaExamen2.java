package CAP07.BIDIMENSIONAL;

public class PruebaExamen2 {
    public static void main(String[] args) {

        int[][] matriz = new int[6][12];
        regeneraArray(matriz, "", 1000);
        int[][] alternativo = new int[6][12];
        regeneraArray(alternativo, "", 20);
        boolean salir = false;
        int opcion = 0;
        do {
            do {
                menu();
                opcion = Integer.parseInt(System.console().readLine());
                if (opcion == 1) {
                    pintaHorizontalmente(matriz, "Array horizontalmente pintado...");
                } else if (opcion == 2) {
                    pintaVerticalmente(matriz, "Array verticalmente pintado...");
                } else if (opcion == 3) {
                    do {
                        menuInvertir();
                        opcion = Integer.parseInt(System.console().readLine());
                        if (opcion == 1) {
                            pintaInversoHorizontal(matriz, "Array inverso pintado de forma horizontal...");
                        } else if (opcion == 2) {
                            pintaInversoVertical(matriz, "Array inverso pintado de forma vertical...");
                        } else if (opcion == 3) {
                            matriz = invierteArray(matriz, "Invirtiendo array...").clone();
                        } else
                            System.out.println("\nIntroduce una opción correcta por favor");
                    } while (opcion < 1 | opcion > 3);
                } else if (opcion == 4) {
                    do {
                        menuColumnas();
                        opcion = Integer.parseInt(System.console().readLine());
                        if (opcion == 1) {
                            columnaIzq(matriz, "Mostrando la columna de la izquierda...");
                        } else if (opcion == 2) {
                            columnaDer(matriz, "Mostrando la columna de la derecha...");
                        } else
                            System.out.println("\nIntroduce una opción correcta por favor");
                    } while (opcion < 1 | opcion > 2);
                } else if (opcion == 5) {
                    regeneraArray(matriz, "Regenerando array...", 1000);
                } else if (opcion == 6) {
                    do {
                        menuArrayAlternativo();
                        opcion = Integer.parseInt(System.console().readLine());
                        if (opcion == 1) {
                            pintaHorizontalmente(alternativo, "Array alternativo horizontalmente pintado...");
                        } else if (opcion == 2) {
                            pintaSumado(matriz, alternativo, "Mostrando arrays sumados...");
                        } else if (opcion == 3) {
                            pintaMultiplicado(matriz, alternativo, "Mostrando arrays multiplicados...");
                        } else if (opcion == 4) {
                            sumaAmbos(matriz, alternativo, "Sumando ambos y guardando en matriz...");
                        } else if (opcion == 5) {
                            multiplicaAmbos(matriz, alternativo, "Multiplicando ambos y guardando en matriz...");
                        } else if (opcion == 6) {
                            regeneraArray(alternativo, "Regenerando alternativo...", 20);
                        } else
                            System.out.println("\nIntroduce una opción correcta por favor");
                    } while (opcion < 1 | opcion > 6);
                } else if (opcion == 7) {
                    matriz = rotacionReloj(matriz, "Rotando en el sentido de las agujas del reloj...").clone();
                } else if (opcion == 8) {
                    salir = true;
                    System.out.println("\nGracias por utilizar nuestro programa\nSaliendo...");
                } else
                    System.out.println("\nIntroduce una opción correcta por favor");
            } while (opcion < 1 | opcion > 8);
        } while (!salir);

    }

    public static void pintaHorizontalmente(int[][] matriz, String texto) {
        System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%6d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void pintaVerticalmente(int[][] matriz, String texto) {
        System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%6d ", matriz[j][i]);
            }
            System.out.println();
        }
    }

    public static void pintaInversoHorizontal(int[][] matriz, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 6; i++) {
            int cont = 11;
            for (int j = 0; j < 12; j++) {
                System.out.printf("%6d ", matriz[i][cont--]);
            }
            System.out.println();
        }
    }

    public static void pintaInversoVertical(int[][] matriz, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 12; i++) {
            int cont = 5;
            for (int j = 0; j < 6; j++) {
                System.out.printf("%6d ", matriz[cont--][i]);
            }
            System.out.println();
        }
    }

    public static void pintaSumado(int[][] matriz, int[][] alter, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%6d ", (matriz[i][j] + alter[i][j]));
            }
            System.out.println();
        }
    }

    public static void sumaAmbos(int[][] matriz, int[][] alter, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = (matriz[i][j] + alter[i][j]);
            }
        }
    }

    public static void pintaMultiplicado(int[][] matriz, int[][] alter, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%6d ", (matriz[i][j] * alter[i][j]));
            }
            System.out.println();
        }
    }

    public static void multiplicaAmbos(int[][] matriz, int[][] alter, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = (matriz[i][j] * alter[i][j]);
            }
        }
    }

    public static void regeneraArray(int[][] matriz, String texto, int numAleatorio) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = numAleatorio(numAleatorio, 1);
            }
        }
    }

    public static int[][] invierteArray(int[][] matriz, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        int[][] aux = new int[6][12];
        for (int i = 0; i < 6; i++) {
            int cont = 11;
            for (int j = 0; j < 12; j++) {
                aux[i][j] = matriz[i][cont--];
            }
        }
        return aux;
    }

    public static void columnaIzq(int[][] matriz, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            System.out.printf("%6d ", matriz[i][cont]);
        }
        System.out.println();
    }

    public static void columnaDer(int[][] matriz, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        int cont = 11;
        for (int i = 0; i < 6; i++) {
            System.out.printf("%6d ", matriz[i][cont]);
        }
        System.out.println();
    }

    public static int[][] rotacionReloj(int[][] matriz, String texto) {
        if (!texto.equals(""))
            System.out.printf("\n%s\n", texto);
        int ultimo = 11;
        int cont = 5;
        int[][] aux = new int[6][12];
        for (int i = 0; i < 3; i++) {
            int arIzq = matriz[i + 1][i];
            int arDer = matriz[i][ultimo];
            int abDer = matriz[cont - 1][ultimo];
            int abIzq = matriz[cont][i];
            for (int j = i; j < 6; j++) {
                for (int k = i; k <= ultimo; k++) {
                    if (j == i & k - 1 != -1) {
                        aux[j][k] = matriz[j][k - 1];
                    } else if (j == cont & k + 1 != 12) {
                        aux[j][k] = matriz[j][k + 1];
                    } else if (k == i & j + 1 != 6) {
                        aux[j][k] = matriz[j + 1][k];
                    } else if (k == ultimo & j - 1 != -1) {
                        aux[j][k] = matriz[j - 1][k];
                    }
                }
            }
            aux[i][i] = arIzq;
            aux[i + 1][ultimo] = arDer;
            aux[cont][ultimo] = abDer;
            aux[cont - 1][i] = abIzq;
            ultimo--;
            cont--;
        }
        return aux;
    }

    public static void menu() {
        System.out.println("\nOpciones disponibles -->");
        System.out.println("1. Mostrarlo horizontalmente");
        System.out.println("2. Mostrarlo verticalmente");
        System.out.println("3. Opciones para invertir arrays");
        System.out.println("4. Opciones de columnas");
        System.out.println("5. Regenerar array");
        System.out.println("6. Interactuar con otro array");
        System.out.println("7. Rotar array en el sentido de agujas del reloj");
        System.out.println("8. Salir del programa");
        System.out.print("Ingrese opción: ");
    }

    public static void menuInvertir() {
        System.out.println("\nOpciones disponibles -->");
        System.out.println("1. Mostrar array horizontalmente de forma inversa");
        System.out.println("2. Mostrar array verticalmente de forma inversa");
        System.out.println("3. Rotar array inversamente");
        System.out.print("Ingrese opción: ");
    }

    public static void menuArrayAlternativo() {
        System.out.println("\nOpciones disponibles -->");
        System.out.println("1. Mostrar array alternativo actual");
        System.out.println("2. Mostrarlo sumado con mi array");
        System.out.println("3. Mostrarlo multiplicado con mi array y guardarlo");
        System.out.println("4. Sumarlo multiplicado con mi array y guardarlo");
        System.out.println("5. Multiplicarlo con mi array");
        System.out.println("6. Regenerar array alternativo");
        System.out.print("Ingrese opción: ");
    }

    public static void menuColumnas() {
        System.out.println("\nOpciones disponibles -->");
        System.out.println("1. Muestra la primera columna (horizontal)");
        System.out.println("2. Muestra la última columna (horizontal)");
        System.out.print("Ingrese opción: ");
    }

    public static int numAleatorio(int num, int suma) {
        return (int) (Math.random() * num + suma);
    }
}
