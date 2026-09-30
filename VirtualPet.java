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

    public void SatiationCheck(){
    }

    public void feed(int FoodA, int FoodB) {
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
} // end Virtual Pet
