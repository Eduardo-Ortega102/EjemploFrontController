package controller.commands;

public class Hello extends FrontCommand {

    @Override
    public void process() {
        request.setAttribute("name", "Tu nombre es: " + request.getParameter("name"));
        forward("/Hello.jsp");
    }
    
}
