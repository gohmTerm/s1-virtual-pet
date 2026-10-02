public class NameMain {
    public static void main(String[] args){
        Name n = new Name("Sean", "Morris");
        System.out.println(n.fullName());

        Name n2 = new Name("Sean", "");
        System.out.println(n2.fullName());
    }
}
