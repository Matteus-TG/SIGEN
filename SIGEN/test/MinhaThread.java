/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matteus
 */
public class MinhaThread extends Thread {

    public static void main(String[] args) throws InterruptedException {
        MinhaThread mt = new MinhaThread();
        String barra = "";
        int percen = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(barra = barra + "|");
            System.out.println(" " + (percen = percen + 1) + "%...");
            mt.sleep(1000);
        }
    }
}