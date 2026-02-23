import org.code.theater.*;

public class FirstScene extends Scene {

  // both Private Variables
  private ImageFilter[][] images;
  private String[] captions;

  // contains captions and gets images from the TheaterRunner class
  public FirstScene(ImageFilter[][] images) {
    this.images = images;

    // Captions for each image in First Scene
    captions = new String[] {
      "Location: Field",
      "Location: HSK ",
      "Location: Hotel",
      "Location: Road"
    };
  }

  public void drawScene() {
    showImages();
  }

  /*
  Contains main method,
  saturates images in First Scene and plays music
  */
  private void showImages() {
 playSound("Audio.wav");
    
    int imageSize = 250;

    for (int i = 0; i < images[0].length; i++) {
      ImageFilter img = images[0][i];

      clear("white");

      int centerX = getWidth() / 2 - imageSize / 2;
      int centerY = getHeight() / 2 - imageSize / 2 - 40;

      // Draw original
      drawImage(img, centerX, centerY, imageSize);

      setTextColor("Blue");
      setTextHeight(30);
      drawText(captions[i], 50, centerY + imageSize + 50);

      pause(2.0);

      // Apply saturate filter
      img.saturate(1);
      drawImage(img, centerX, centerY, imageSize);

      pause(2.0);
    }
  }
}

