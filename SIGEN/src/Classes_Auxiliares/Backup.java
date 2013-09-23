/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Auxiliares;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Backup {

    public static void fazBackup(String caminho) {
        try {
            ProcessBuilder pb;
            Process p;
            pb = new ProcessBuilder("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_dump.exe ",
                    "-i", "-h", "localhost", "-p", "5432", "-U", "postgres", "-F", "t", "-b", "-v", "-f",
                    caminho + "\\bkp.sql", "BD_CEMITERIO");
            pb.environment().put("PGPASSWORD", "senha");
            pb.redirectErrorStream(true);
            p = pb.start();
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }

    public void realizaRestore() {

        try {
            final List<String> comandos = new ArrayList<String>();

            comandos.add("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_restore.exe");
            comandos.add("-i");
            comandos.add("-h");
            comandos.add("localhost");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");
            comandos.add("postgres");
            comandos.add("-d");
            comandos.add("BD_CEMITERIO");
            comandos.add("-v");
            comandos.add("C:\\SIGEC\\Backup\\bkp.sql");

            ProcessBuilder pb = new ProcessBuilder(comandos);

            pb.environment().put("PGPASSWORD", "senha");

            final Process process = pb.start();

            JOptionPane.showMessageDialog(null, "Restore realizado com sucesso.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um problema. Entar em contato com o administrador.");
        }
    }
}
