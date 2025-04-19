import org.code.theater.*;
import java.util.ArrayList;

/**
 * MyScene class creates and draws a scene with multiple Person objects.
 */
public class MyScene extends Scene {

  ArrayList<Person> s = new ArrayList<Person>();

  /**
   * Draws the scene by adding characters and triggering their actions.
   */
  public void drawScene() {
    clear("white");
    pause(1);

    s.add(new LeBron("lebron.png", 0, 100, this));
    s.add(new OldMan("oldKorean.png", 250, 100, this));

    for (int i = 0; i < s.size(); i++) {
      Person p = s.get(i);
      p.firstMove();
      p.firstScene();
    }
  }
}