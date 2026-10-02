public class Name {
    private String first;
    private String last;

    public Name(String first, String last){
        this.first = fixCase(first);
        this.last = fixCase(last);
    }

    public String fullName(){
        return first + " " + last;
    }

    public String fixCase(String part){
        if(!part.equals("")){
            part = part.toLowerCase();
            return part.substring(0,1).toUpperCase() + part.substring(1);
        }
        return part;

    }
}
