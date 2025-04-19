import org.code.theater.*;

/*
 * OldMan is a Person with a simple display in the first scene.
 */
public class OldMan extends Person {
  private Scene scene;

  /*
   * @param img The file name of the character image.
   * @param xPos The initial x-coordinate of the character.
   * @param yPos The initial y-coordinate of the character.
   * @param scene The scene where the character is displayed.
   */
  public OldMan(String img, int xPos, int yPos, Scene scene) {
    super(img, xPos, yPos, scene);
    this.scene = scene;
  }

  /*
   * Displays the character in the scene at the current position.
   */
  public void firstScene() {
    scene.drawImage(getImage(), getX(), getY(), 100); 
  }
}