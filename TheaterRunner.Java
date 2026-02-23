import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /*
     First Scene images Mt Fuji 
     Only applies to First Scene and does nothing for Second Scene
    */
    ImageFilter[][] FirstSceneImages = {
      { new ImageFilter("IDG_20260108_111730_836.JPG"), new ImageFilter("IDG_20260108_114845_701.JPG"), new ImageFilter("IMG_0410.jpeg"), new ImageFilter("IMG_0412.jpeg")  }
    };

    // Instantiate the scenes
    FirstScene scene1 = new FirstScene(FirstSceneImages);
    SecondScene scene2 = new SecondScene();

    // Draw scenes first (optional)
    scene1.drawScene();
    scene2.drawScene();

    // Play them in order
    Theater.playScenes(scene1, scene2);
  }
}
