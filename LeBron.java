import org.code.theater.*;

/**
 * LeBron is a Person with a custom animation for the first scene.
 */
class LeBron extends Person {
  private Scene scene;

  /*
   * @param img - The file name of the character image.
   * @param xPos - The initial x-coordinate of the character.
   * @param yPos - The initial y-coordinate of the character.
   * @param scene - The scene where the character is displayed.
   */
  public LeBron(String img, int xPos, int yPos, Scene scene) {
    super(img, xPos, yPos, scene);
    this.scene = scene;
  }

  /*
   * Animates the character rotating from 0 to 90 degrees.
   */
  public void firstScene() {
    double angle = 0;
    while (angle < 90) {
      scene.clear("white");
      scene.drawImage(getImage(), getX(), getY(), 100, angle);
      scene.pause(0.05);
      angle += 5;
    }
  }
}