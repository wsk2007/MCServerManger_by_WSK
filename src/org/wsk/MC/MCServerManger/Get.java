package org.wsk.MC.MCServerManger;

import java.io.BufferedReader;
import java.io.IOException;

public class Get extends Thread{
    MainForm m = null;
    BufferedReader in = null;
    @Override
    public void run(){
        String s = null;
        StringBuilder sb = new StringBuilder();
        while(true){
            try {
                s = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(s != null){
                sb.append(s);
                sb.append("\r\n");
                m.consoletext.setText(sb.toString());
            }
        }
    }

    public Get(MainForm m , BufferedReader in){
        this.m = m;
        this.in = in;
    }

}
