import processing.core.PApplet;
  /**
  * A program that draws a human face
  * @author: A. Razack
  */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Draw head
    fill(255, 204, 153); // Set fill color to light orange
    ellipse(200, 200, 200, 200); // Draw ellipse for head
  
    // Draw eyes
    fill(255); // Set fill color to white
    ellipse(170, 170, 40, 40); // Draw left eye
    ellipse(230, 170, 40, 40); // Draw right eye
  
    // Draw pupils
    fill(0); // Set fill color to black
    ellipse(170, 170, 20, 20); // Draw left pupil
    ellipse(230, 170, 20, 20); // Draw right pupil
  
    // Draw nose
    fill(255, 102, 102); // Set fill color to pink
    triangle(200, 190, 190, 220, 210, 220); // Draw nose
  
    // Draw mouth
    arc(200, 240, 100, 80, 0, PI); // Draw mouth arc
  }
}