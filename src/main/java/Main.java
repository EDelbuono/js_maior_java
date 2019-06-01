import jsmaiorjava.interfaces.IZumbiTwittero;
import jsmaiorjava.implementations.ZumbiTwittero;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class Main {

    public static void main(String[] args) {
        // IZumbiTwittero zt = new ZumbiTwittero(new Prontuario());

        try {
            Twitter twitter = TwitterFactory.getSingleton();
            // Status status = twitter.updateStatus("Hello World! (again)");
            System.out.println("Confia no pai que ta funcionando    ");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
