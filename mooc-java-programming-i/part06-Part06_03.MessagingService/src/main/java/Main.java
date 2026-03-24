
public class Main {
    
    public static void main(String[] args) {

        // Try out your class herege
        Message message = new Message("Miqi", "Hi");
        MessagingService miqi = new MessagingService();
        miqi.add(message);
        System.out.println( miqi.getMessages());
    }
}
