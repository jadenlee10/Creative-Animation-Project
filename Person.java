import org.code.theater.*;

/*
 * Represents a character in the scene with position and image data.
 */
public class Person {
  private String image;
  private int x, y;
  private Scene scene;

  /*
   * @param img - The file name of the character image.
   * @param xPos - The initial x-coordinate of the character.
   * @param yPos - The initial y-coordinate of the character.
   * @param scene - The scene where the character is displayed.
   */
  public Person(String img, int xPos, int yPos, Scene scene) {
    this.image = img;
    this.x = xPos;
    this.y = yPos;
    this.scene = scene;
  }

  /*
   * @return The image file name of the character.
   */
  public String getImage() {
    return image;
  }

  /*
   * @return The x-coordinate of the character.
   */
  public int getX() {
    return x;
  }

  /*
   * @return The y-coordinate of the character.
   */
  public int getY() {
    return y;
  }

  /*
   * Sets the image of the character.
   *
   * @param image - The new image file name.
   */
  public void setImage(String image) {
    this.image = image;
  }

  /*
   * Sets the x-coordinate of the character.
   *
   * @param x The new x-coordinate.
   */
  public void setX(int x) {
    this.x = x;
  }

  /*
   * Sets the y-coordinate of the character.
   *
   * @param y The new y-coordinate.
   */
  public void setY(int y) {
    this.y = y;
  }

  /*
   * Animates the character moving to the right until x reaches 150.
   */
   public void firstMove() {
    while (x < 150) {
      scene.clear("white");
      scene.drawImage(image, x, y, 100);
      scene.pause(0.01);
      x += 5;
    }
  }

  public void firstScene() {
    scene.drawImage(image, x, y, 100);
  }
}