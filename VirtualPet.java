/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int S = 50;
    int HP = 50;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
    }
    
    public int showChoiceDialog(String question, String firstOption, String secondOption) {
        return face.showChoiceDialog(question, firstOption, secondOption);
    }

    public void check(){
        if(S > 100)
            S = 100;
        if(HP > 100)
            HP = 100;
        if(HP <= 0){
            face.setMessage("Finnias is dead!");
            face.setImage("dead");   
            waitTime(4000);
            face.setImage("angel");
        }
    }

    public void victory(){
        face.setImage("joyful");
        face.setBackground2("pixilart-drawing.png");
        face.showContinueDialog("You win! Congrats. Finnias made it through the day and now rest peacefully.");
        face.setImage("asleep");
    }

    public void feed(int Sat, int Heal) {
        S += Sat;
        HP += Heal;
        face.setHP(HP, S);
        String msg = "";
        if (Sat < 0)
            msg = msg.concat("You lost: " + Sat + " saturation, ");
        if (Sat > 0)
            msg = msg.concat("You gained: " + Sat + " saturation, ");
        if (Heal < 0)
            msg = msg.concat("You lost: "+ Heal + "HP.");
        if (Heal > 0)
            msg = msg.concat("You gained: "+ Heal + "HP.");
        face.setMessage(msg);
        face.setImage("eating");
        waitTime(4000);
        face.setImage("happy");
        this.check();

    }
    
    public void SetMSG(String msg){
        face.setMessage(msg);
    }

    public void waitTime(int time){
        try {
            Thread.sleep(time); // milliseconds
             } catch (Exception e) {

            }
    }

    public void setHP(int HP, int Sat){
        face.setHP(HP, Sat);
    }


    public void ContinueDialog(String msg){
        face.showContinueDialog(msg);
    }
} // end Virtual Pet
