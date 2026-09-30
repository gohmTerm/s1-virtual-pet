import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();

    public VPMain() {
        this.waitABeat(1000);
        int choice = vp.showChoiceDialog("Good Morning! What to eat?", "Pizza", "Salad");
        if (choice == 0){
            vp.feed(30,-5);
            vp.SetMSG("The pizza was tasty, but you lost HP because its unhealthy.");
        }
        else if (choice == 1){
            vp.feed(20,-5);
            vp.SetMSG("You choke on a salad cruton, reducing your HP.");
        }
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
