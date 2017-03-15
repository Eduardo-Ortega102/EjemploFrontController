package controller.commands;

public class Bye extends FrontCommand {

    @Override
    public void process() {
        forward("/bye.html");
    }
    
}
