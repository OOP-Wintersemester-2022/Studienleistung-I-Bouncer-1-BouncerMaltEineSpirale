import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;
import de.ur.mi.bouncer.world.fields.FieldColor;

public class Spiral extends BouncerApp {
    private static final int WIDTH = 12;
    private static final int HEIGHT = 13;

    @Override
    public void bounce() {
        loadMap("Spiral");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("Spiral");
    }
}