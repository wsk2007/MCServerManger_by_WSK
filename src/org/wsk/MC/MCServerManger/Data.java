package org.wsk.MC.MCServerManger;

import java.io.*;

/**
 * @author wsk
 */
public class Data implements Serializable {
    public String server;
    public String dir;
    public int max;
    public int min;
    public void saveData(String dir){
        ObjectOutputStream oo = null;
        try {
            oo = new ObjectOutputStream(new FileOutputStream(new File(dir)));
            oo.writeObject(this);
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void readData(String dir){
        ObjectInputStream ois = null;
        Data d = this;
        try {
            ois = new ObjectInputStream(new FileInputStream (new File("E:/Person.txt")));
            d = (Data) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.server = d.server;
        this.dir = d.dir;
        this.max = d.max;
        this.min = d.min;
    }
}
