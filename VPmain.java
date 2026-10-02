import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();

    public VPMain() {
        this.waitABeat(1000);
        int noChoice = vp.showChoiceDialog("In this game, you follow the escapades of one Timothy, as he tries to make it through his day eating food. You have 2 stats to keep track of, HP, and Saturation. If you HP reaches zero, you preish. If your saturation reaches zero, your HP begins to lower", "Lets go", "I'm Ready");
        this.waitABeat(1000);
        int choice = vp.showChoiceDialog("Good Morning! What to eat?", "Pizza", "Salad");
        if (choice == 0){
            vp.SetMSG("The pizza was tasty, but you lost HP because its unhealthy.");
            waitABeat(500);
            vp.feed(30,-5);
        }
        else if (choice == 1){
            vp.SetMSG("You choke on a salad cruton, reducing your HP.");
            vp.feed(20,-5);
            //int choice2 = vp.showChoiceDialog("You ate a salad, and while you thought it would be healthy, it was actually quite dangerous. Whats next?");
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
