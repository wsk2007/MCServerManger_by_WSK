/*
 * Created by JFormDesigner on Fri Feb 14 20:02:52 CST 2020
 */

package org.wsk.MC.MCServerManger;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author wsk
 */
public class MainForm extends JFrame {
    public static Data data = new Data();
    Process p;
    Get get;
    public MainForm() {
        initComponents();
    }

    private void startMouseClicked(MouseEvent e) {
        try {
            p = Runtime.getRuntime().exec(data.dir + " -Xmx" + data.max + "m" + " -Xms" + data.min + "m" + " -jar" + data.server + " " , null , null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        get = new Get(this , new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("GBK"))));

    }

    private void stopMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void forcestopMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void saveMouseClicked(MouseEvent e) {
        data.server = serverdir.getText();
        data.dir = javadir.getText();
        data.max = new Integer(maxm.getText());
        data.min = new Integer(minm.getText());
        new CommonDialog(this , "设置成功！").setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - wsk
        scrollPane1 = new JScrollPane();
        consoletext = new JTextArea();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        serverdir = new JTextField();
        javadir = new JTextField();
        maxm = new JTextField();
        minm = new JTextField();
        stop = new JButton();
        label7 = new JLabel();
        start = new JButton();
        forcestop = new JButton();
        save = new JButton();

        //======== this ========
        setTitle("MCServerManger by WSK");
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- consoletext ----
            consoletext.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 12));
            consoletext.setEditable(false);
            scrollPane1.setViewportView(consoletext);
        }

        //---- label1 ----
        label1.setText("\u63a7\u5236\u53f0\uff1a");
        label1.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16));

        //---- label2 ----
        label2.setText("\u8bbe\u7f6e\uff1a");
        label2.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16));

        //---- label3 ----
        label3.setText("\u670d\u52a1\u7aef\u8def\u5f84\uff1a");

        //---- label4 ----
        label4.setText("Java\u8def\u5f84\uff1a");

        //---- label5 ----
        label5.setText("\u6700\u5927\u5185\u5b58\uff08MiB\uff09\uff1a");

        //---- label6 ----
        label6.setText("\u6700\u5c0f\u5185\u5b58\uff08MiB\uff09\uff1a");

        //---- stop ----
        stop.setText("\u5173\u670d");
        stop.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 12));
        stop.setEnabled(false);
        stop.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                stopMouseClicked(e);
            }
        });

        //---- label7 ----
        label7.setText("\u64cd\u4f5c\uff1a");
        label7.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16));

        //---- start ----
        start.setText("\u5f00\u670d");
        start.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 12));
        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                startMouseClicked(e);
            }
        });

        //---- forcestop ----
        forcestop.setText("\u5f3a\u5236\u5173\u670d\uff08\u614e\u7528\uff09");
        forcestop.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 12));
        forcestop.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                forcestopMouseClicked(e);
            }
        });

        //---- save ----
        save.setText("\u4fdd\u5b58\u8bbe\u7f6e");
        save.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 12));
        save.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                saveMouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(javadir, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(serverdir, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(minm, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(maxm, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
                    .addGap(21, 21, 21)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(stop, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(save, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(start, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(forcestop)))
                    .addContainerGap(35, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 816, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 17, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 553, Short.MAX_VALUE)
                            .addComponent(label7)
                            .addGap(184, 184, 184))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(label7))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(serverdir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5)
                        .addComponent(maxm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(start)
                        .addComponent(forcestop))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(javadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6)
                        .addComponent(minm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(stop)
                        .addComponent(save))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - wsk
    private JScrollPane scrollPane1;
    public JTextArea consoletext;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField serverdir;
    private JTextField javadir;
    private JTextField maxm;
    private JTextField minm;
    private JButton stop;
    private JLabel label7;
    private JButton start;
    private JButton forcestop;
    private JButton save;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
