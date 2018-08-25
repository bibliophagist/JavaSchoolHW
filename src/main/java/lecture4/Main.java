package lecture4;

public class Main {
    public static void main(String[] args) {
        NameableLogger nameableLogger=new NameableLogger(5,"Some Name");
        nameableLogger.log(4,"Some Message");
    }
}
