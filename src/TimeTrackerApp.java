import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeTrackerApp {

    private static long totalTimeInSeconds = 0;

    public static void main(String[] args) {
        // Crea una ventana simple
        JFrame frame = new JFrame("Time Tracker App");
        frame.setSize(300, 200);

        // Crea un temporizador para realizar el seguimiento del tiempo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isBrowserInForeground()) {
                    totalTimeInSeconds++;
                    System.out.println("Total Time: " + totalTimeInSeconds + " seconds");
                }
            }
        });
        timer.start();

        // Agrega un botón para cambiar entre la aplicación y el navegador
        JButton switchButton = new JButton("Switch to Browser");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Switching to Browser");
                // Simulamos un cambio de aplicación a navegador
                simulateSwitchToBrowser();
            }
        });

        // Agrega componentes a la ventana
        frame.getContentPane().add(BorderLayout.CENTER, switchButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static boolean isBrowserInForeground() {
        // Aquí implementarías la lógica para detectar si el navegador está en primer plano.
        // Esto puede variar dependiendo del sistema operativo y la biblioteca que estés utilizando.
        // En un entorno real, podrías necesitar utilizar una biblioteca externa para interactuar con el sistema operativo.
        return true; // Simplemente devolvemos true como ejemplo
    }

    private static void simulateSwitchToBrowser() {
        // Simulamos el tiempo que pasamos en el navegador (30 segundos)
        totalTimeInSeconds += 30;
        System.out.println("Total Time: " + totalTimeInSeconds + " seconds");
    }
}


