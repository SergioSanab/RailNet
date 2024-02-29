
import controller.RailnetController;
import model.RailnetModel;
import view.RailnetView;

public class Main {
    public static void main(String[] args) {
        RailnetController controller = new RailnetController(new RailnetModel(), new RailnetView());
        controller.start();
    }
}