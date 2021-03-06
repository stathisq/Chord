package Chord;

import java.rmi.RemoteException;

/**
 * Created by John on 4/6/2014.
 * Thead που καλεί την stabilize
 */
public class StabilizeThread implements Runnable {

    private static final int SLEEP_TIME = 1000;
    private Node node;

    public StabilizeThread(Node node) {
        this.node = node;
    }

    @Override
    public void run() {

        while (true) {

            try {
                
                node.stabilize();
            } catch (RemoteException e) {
                e.printStackTrace();
            }


            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

}