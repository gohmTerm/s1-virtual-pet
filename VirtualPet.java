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
            face.setImage("angel");
        if(S < 40)
            face.setImage("starving");
    }

    public void feed(int Sat, int Heal) {
        System.out.println("This is a test");
        face.setMessage("This is test 2");
        S += Sat;
        HP += Heal;
        String msg = "";
        if (Sat < 0)
            msg = msg.concat("You lost: " + Sat + " saturation, ");
        if (Sat > 0)
            msg = msg.concat("You gained: " + Sat + " saturation, ");
        if (Heal < 0)
            msg = msg.concat("You lost: "+ Heal + "HP.");
        if (Heal > 0)
            msg = msg.concat("You gained: "+ Heal + "HP.");
        face.setImage("eating");
        
        face.setMessage(msg);

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
} // end Virtual Pet
