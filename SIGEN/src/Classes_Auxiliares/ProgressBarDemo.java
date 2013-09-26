/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Auxiliares;

/**
 *
 * @author matteus
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.beans.*;
import java.util.Random;

public class ProgressBarDemo extends JPanel implements ActionListener, PropertyChangeListener {

    private JProgressBar barraDeProgresso;
    private JButton botaoInicio;
    private JTextArea saida;
    private Task task;

    class Task extends SwingWorker<Void, Void> {
        /* 
         execução da thread 
         */

        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
//Icializa a propiedade do progress. 
            setProgress(0);
            while (progress < 100) {
//para por um segundo 
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ignore) {
                }
//executa random progress. 
                progress += random.nextInt(10);
                setProgress(Math.min(progress, 100));
            }
            return null;
        }

        /* 
         * Executa o evento dispatching thread 
         */
        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            botaoInicio.setEnabled(true);
            setCursor(null);
            saida.append("Done!\n");
        }
    }

    public ProgressBarDemo() {
        super(new BorderLayout());


        botaoInicio = new JButton("Start");
        botaoInicio.setActionCommand("start");
        botaoInicio.addActionListener(this);

        barraDeProgresso = new JProgressBar(0, 100);
        barraDeProgresso.setValue(0);
        barraDeProgresso.setStringPainted(true);

        saida = new JTextArea(5, 20);
        saida.setMargin(new Insets(5, 5, 5, 5));
        saida.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(botaoInicio);
        panel.add(barraDeProgresso);

        add(panel, BorderLayout.PAGE_START);
        add(new JScrollPane(saida), BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    }

    /**
     * Invocado quando usar o botao inicio
     */
    public void actionPerformed(ActionEvent evt) {
        botaoInicio.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
    }

    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            barraDeProgresso.setValue(progress);
            saida.append(String.format(
                    "Completado %d%% .\n", task.getProgress()));
        }
    }

    private static void createAndShowGUI() {

        JFrame frame = new JFrame("Progresso da Barra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//cria e set o pane 
        JComponent newContentPane = new ProgressBarDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);


        frame.pack();
        frame.setVisible(true);
    }

    /*public static void main(String[] args) {

     javax.swing.SwingUtilities.invokeLater(new Runnable() {
     public void run() {
     createAndShowGUI();
     }
     });
     }*/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgressBarDemo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgressBarDemo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgressBarDemo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgressBarDemo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                createAndShowGUI();
            }
        });
    }
}
