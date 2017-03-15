package controller.commands;

public class LocalDate extends FrontCommand {

    @Override
    public void process() {
        forward("/date.html");
    }
    
}
