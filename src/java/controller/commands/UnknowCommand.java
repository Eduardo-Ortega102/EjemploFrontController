package controller.commands;

public class UnknowCommand extends FrontCommand {

    @Override
    public void process() {
        forward("/UnknowCommand.html");
    }
    
}
