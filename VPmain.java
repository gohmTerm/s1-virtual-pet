import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();

    public VPMain() {
        vp.feed();
        vp.exercise();
        this.waitABeat(1000);
        int choice = vp.showChoiceDialog("Are you ready to sleep?", "Sleep", "Exercise");
        if (choice == 0)
            vp.sleep();
        else if (choice == 1)
            vp.exercise();

    }

    public void waitABeat(int ms) {
        try {
            Thread.sleep(ms); // milliseconds
        } catch (Exception e) {

        }
    }

    public String askForInput(String q) {
        String s = (String) JOptionPane.showInputDialog(
                new JFrame(),
                q,
                "Input Dialog",
                JOptionPane.PLAIN_MESSAGE);
        return s;
    }

    public static void main(String[] args) {
        new VPMain();
    }
}
