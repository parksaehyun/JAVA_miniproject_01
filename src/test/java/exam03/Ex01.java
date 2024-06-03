package exam03;

import javax.management.monitor.Monitor;

public class Ex01 {
    public static void main(String[] args) {
        Desktop desktop = new Desktop(new Monitor(), new Body(), new Keyboard(), new Mouse(), new GraphicCard());

    }
}