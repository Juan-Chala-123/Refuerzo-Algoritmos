/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author CHALA RAMIREZ
 */
public class RelojDigital {
    private int hora;
    private int minuto;
    private int segundo;

    public RelojDigital() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void incrementarSegundos() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    
    public static void main(String[] args) throws InterruptedException {
        RelojDigital reloj = new RelojDigital();
        
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Reloj Digital:");
            System.out.println(reloj.mostrarHora());
            
            Thread.sleep(1000);
            reloj.incrementarSegundos();
        }
    }
}
