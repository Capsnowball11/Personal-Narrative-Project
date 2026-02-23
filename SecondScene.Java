import org.code.theater.*;
import org.code.media.*;

public class SecondScene extends Scene {

  /*
  both private variables
  Images, and Captions
  */
  private ImageFilter[] images;
  private String[] captions;

  public SecondScene() {
    //Every image
    images = new ImageFilter[] {
      new ImageFilter("IMG_0424.jpeg"),
      new ImageFilter("IMG_0426.jpeg"),
      new ImageFilter("IMG_0428.jpeg"),
      new ImageFilter("_DSC6333.JPG"),
    };
//captions for each image
    captions = new String[] {
      "Location: Lake",
      "Location: Temple",
      "Location: Mountain",
      "Night",
    };
  }

  // creates the scene as well as plays music, contains negative method
public void drawScene() {
   playSound("Audio.wav");
    int imageSize = 250;
// for loop for images
    for (int i = 0; i < images.length; i++) {
        ImageFilter img = images[i];

        clear("white");

        int centerX = getWidth() / 2 - imageSize / 2;
        int centerY = getHeight() / 2 - imageSize / 2 - 40;

        // Draw original
        drawImage(img, centerX, centerY, imageSize);

      /*
      Set Text color,
      sets the text height,
      thend sets the caption
      */
        setTextColor("black");
        setTextHeight(30);
        drawText(captions[i], 60, centerY + imageSize + 50);

        pause(2.0);

        // Apply negative filter
        img.makeNegative();

      // Draw filtered image with same caption
        drawImage(img, centerX, centerY, imageSize);
        drawText(captions[i], 60, centerY + imageSize + 50);

        pause(2.0);
            
    }
}
}
