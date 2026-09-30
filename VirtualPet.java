/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int S = 0;
    int HP = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public int showChoiceDialog(String question, String firstOption, String secondOption) {
        return face.showChoiceDialog(question, firstOption, secondOption);
    }

    public void check(){
        if(S > 100)
            S = 100;
        if(HP > 100);
            HP = 100;
        if(HP == 0);
            face.setMessage("Finnias is dead!");
            face.setImage("dead");  
            try {
            Thread.sleep(2000); // milliseconds
             } catch (Exception e) {

            }
            face.setImage("angel");
        if(S < 40)
            face.setImage("starving");
    }

    public void feed(int Sat, int Heal) {
        S += Sat;
        HP += Heal;
        String msg = "";
        if (Sat < 0)
            msg.concat("You lost: " + Sat + ", ");
        if (Heal < 0)
            msg.concat("You lost: "+ Heal +", ");
        if (Sat > 0)
            msg.concat("You gained: " + Sat + ", ");
        if (Heal > 0)
            msg.concat("You gained: "+ Heal +", ");
        face.setMessage(msg);
    }
    
    public void SetMSG(String msg){
        face.setMessage(msg);
    }
} // end Virtual Pet
