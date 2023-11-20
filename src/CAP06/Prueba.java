package CAP06;

public class Prueba {
    public static void main(String[] args) {
        int totalProgress = 100;

        for (int i = 0; i <= totalProgress; i++) {
            updateProgressBar(i, totalProgress);
            // Simula una tarea que lleva tiempo
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void updateProgressBar(int progress, int total) {
        int barLength = 50;
        int currentLength = (int) (((double) progress / total) * barLength);

        StringBuilder progressBar = new StringBuilder("[");
        for (int i = 0; i < barLength; i++) {
            if (i < currentLength) {
                progressBar.append("#");
            } else {
                progressBar.append("-");
            }
        }
        progressBar.append("] " + progress + "%");

        // Secuencia de escape ANSI para borrar la línea actual en la consola
        System.out.print("\r\u001B[K" + progressBar.toString());
    }
}
