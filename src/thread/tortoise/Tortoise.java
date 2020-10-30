package thread.tortoise;

import javax.swing.*;
public class Tortoise implements Runnable {
    private static final int MILESTONES = 5;
    private final Thread tortoise;
    public Tortoise(){
        this.tortoise = new Thread(this, "Tortoise");
    }

    public Thread getTortoise() {
        return tortoise;
    }
    public Thread getTortorise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortorise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortorise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortorise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortorise has reached the Big Oak Tree!");
                    System.out.println("The Tortorise is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(18000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Tortorise's sleep got interrupted!");
                    }
                    break;
                case 4:
                    System.out.println("The Tortorise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The Tortorise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortorise has completed the race!",
                "Tortorise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
    
    
    
     



