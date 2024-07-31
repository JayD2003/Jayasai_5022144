package exercise_5;

public class EmailNotifier implements Notifier{
    @Override
    public void Send (String msg){
        System.out.println("Sending the Message "+ msg +" as Email");
    }
}
