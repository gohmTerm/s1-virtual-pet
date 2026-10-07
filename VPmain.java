import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();

    public VPMain() {
        this.waitABeat(1000);
        int noChoice = vp.showChoiceDialog("In this game, you follow the escapades of one Timothy, as he tries to make it through his day eating food. \n You have 2 stats to keep track of, HP, and Saturation. \n If you HP reaches zero, you preish. If your saturation reaches zero, your HP begins to lower.", "Lets go", "I'm Ready");
        this.waitABeat(1000);
        int choice = vp.showChoiceDialog("Good Morning! What to eat?", "Pizza", "Salad");
        if (choice == 0){
            vp.SetMSG("The pizza was tasty, but you lost HP because its unhealthy.");
            waitABeat(500);
            vp.feed(30,-5);
            int choice2 = vp.showChoiceDialog("You ate a pizza. Maybe only order two slices next time. Whats next?", "Bread", "Pear");
            if (choice == 1){
                vp.SetMSG("The bread was very filling, but also incredibly bad for your long-term health");
                waitABeat(500);
                vp.feed(40,-75);
                int choice3 = vp.showChoiceDialog("You had some bread. Did you know white bread is the number two cause of deaths to ducks in the U.S?", "Bread", "Liver of Bread");
                if (choice == 0){
                    vp.SetMSG("You monster, you killed the ducks. You throw-up and lose your appetite.");
                    waitABeat(500);
                    vp.feed(-100,10);
                }
                else if (choice == 1){
                    vp.SetMSG("What are you talking about? That's not real. No food for you.");
                    waitABeat(500);
                }
            }
            else if (choice == 0){
                vp.SetMSG("After e@|ng th@ pear, s()meth|ng's ()ff. The text lay()ut changes t() make a reference th@ |s likely t()() ()utd@ed f()r the people |n th|s r()()m");
                waitABeat(500);
                vp.feed(20,-50);
                int choice4 = vp.showChoiceDialog("Please make y()ur next select|on, preferably ()ne that returns us t() ()ur st@us qu().", "Captchal()gue Card", "Grass");
                if (choice == 0){
                    vp.SetMSG("It's t()() l@e. Y()u d|e |n a sharp|e b@h.");
                    waitABeat(500);
                    vp.feed(-100,-100);
                }
                else if (choice == 1){
                    vp.SetMSG("Oh, the meta reference is gone. Unfortunately, eating grass is too much for a nerd like you. The grass was yummy though.");
                    waitABeat(500);
                    vp.feed(50,-100);
                }
            

            }
        }
        else if (choice == 1){
            vp.SetMSG("You choke on a salad cruton, reducing your HP.");
            vp.feed(20,-5);
            int choice2 = vp.showChoiceDialog("You ate a salad, and while you thought it would be healthy, it was actually quite dangerous. Whats next?", "Bread", "Pear");
            if (choice == 2){
                vp.SetMSG("The bread was very filling, but also incredibly bad for your long-term health");
                waitABeat(500);
                vp.feed(40,-35);
                int choice3 = vp.showChoiceDialog("You ate some bread. Don't you know white bread is bad for you? Here, I made you something.", "Bread you already ate", "Very Delicious and Cool Meal I Cooked for You");
                if (choice == 1){
                    vp.SetMSG("Ah yes, the meal I cooked you- wait wait wait");
                    waitABeat(500);
                    int choice4 = vp.showChoiceDialog("You'd rather eat the bread you, I have to stress, ALREADY ATE, than the food I prepared for you?", "Bread you ALREADY ate", "Meal with 1000 years of love, sweat, and tears");
                    if (choice == 1){
                        vp.SetMSG("Okay fine, you eat the bread you... already ate. You feel hungry because you already ate it.");
                        waitABeat(500);
                        vp.feed(-10,0);
                    }
                    else if (choice == 0){
                        vp.SetMSG("Well now it feels like you're just saying that. I'm eating half of your portion.");
                        waitABeat(500);
                        vp.feed(20, 20);
                    }
                }
                else if (choice == 0){
                    vp.SetMSG("See, I worked really hard on that. Doesn't it taste great? Why is your face crunching up so much?");
                    waitABeat(500);
                    vp.feed(10,-100);
                }
            }
            else if (choice == 1){
                vp.SetMSG("The antioxidants within the pear have healed you, but the fibers have made you defecate");
                waitABeat(500);
                vp.feed(-40,20);
                int choice4 = vp.showChoiceDialog("You ate a pear, and feel much healthier. You really had to go to the bathroom though. Whats next?", "Durian", "Liver of an ???");
                if (choice == 1){
                    vp.SetMSG("Smells like... durian. It's not for the weak.");
                    waitABeat(500);
                    vp.feed(10,-100);
                }
                else if (choice == 0){
                    vp.SetMSG("Something tastes off about this... it's sort of like chicken but not? You feel filled, but also inherently disgusted for some reason.");
                    waitABeat(500);
                    vp.feed(40,-1);
                }
            

            }

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
