/* Name: Hector Herrera
 * Pennkey: Hectorh
 * Recitation: 216
 * 
 * Execution: Jave Stamp Sketch
 * 
 * DESCRIPTION: Three different sky backgrounds with pictures 
 * of clouds and happy faces
 */
public class StampSketch {
    public static void main(String[] args) {
        // is this the first time we are drawing the background?
        boolean firstTime = true;
        
        // defined variables
        double horLine = .5;
        double xCoord = .15;
        double yCoord = .85;
        
        //draw the grass
        PennDraw.clear(PennDraw.GREEN);
        
        //draw the sky
        PennDraw.setPenColor(150, 240, 240);
        PennDraw.filledRectangle(.5, .75, .5, .25);
        
        //draw a sun
        PennDraw.setPenColor(255, 250, 0);
        PennDraw.filledEllipse(xCoord, yCoord, .1, .1);
        PennDraw.line(.01, .85, .29, .85);
        PennDraw.line(.15, .99, .15, .71);
        PennDraw.line(.04, .74, .25, .96);
        PennDraw.line(.04, .96, .25, .74);
        
        while (true) {
            // if a key is pressed, redraw background
           if (PennDraw.hasNextKeyTyped()) {
               PennDraw.nextKeyTyped();
               
               //draw grass
               PennDraw.clear(PennDraw.GREEN);
        
               //draw sky
               PennDraw.setPenColor(150, 240, 240);
               PennDraw.filledRectangle(.5, .75, .5, .25);
        
               //draw a sun
               PennDraw.setPenColor(255, 250, 0);
               PennDraw.filledEllipse(xCoord, yCoord, .1, .1);
               PennDraw.line(.01, .85, .29, .85);
               PennDraw.line(.15, .99, .15, .71);
               PennDraw.line(.04, .74, .25, .96);
               PennDraw.line(.04, .96, .25, .74);
              
               //if a key is pressed the background will randomly change
               Math.random();
              
               while (Math.random() < .5) {
                   //if number generated is less than  .5 draw the following
                   
                   //draw another shade of grass 
                   PennDraw.clear(120, 180, 0);
                   
                   //draw the sky during a sunset
                   PennDraw.setPenColor(250, 150, 0);
                   PennDraw.filledRectangle(.5, .75, .5, .25);
                   
                   // draw the setting sun
                   PennDraw.setPenColor(255, 250, 0);
                   PennDraw.filledArc(.50, .5, .19, 0, 180);
                   }
              
               while (Math.random() > .5) {
                   //if number generated is greaer than .5 draw the following
                   
                   //draw darker shade of grass
                   PennDraw.clear(10, 120, 10);
                   
                   //draw the night sky
                   PennDraw.setPenColor(PennDraw.BLACK);
                   PennDraw.filledRectangle(.5, .75, .5, .25);
                   
                   //include an image of the moon
                   PennDraw.picture(xCoord, yCoord, "moon.png", 100, 100, 0);
               }
                   
               firstTime = false;
            }

            // if the mouse is clicked
            if (PennDraw.mousePressed()) {
                // get the coordinates of the mouse cursor
                double x = PennDraw.mouseX();
                double y = PennDraw.mouseY();
                
                //determine the distance from the horLine
                double scale = horLine - y;
               
                while (y < horLine) {
                    //draw a smiley face
                    PennDraw.setPenColor(240, 230, 60);
                    PennDraw.filledCircle(x, y, .2 * scale);
                    PennDraw.setPenColor(PennDraw.BLACK);
                    PennDraw.filledCircle(x - .08 * scale, y + .02 * scale,
                                          .05 * scale);
                    PennDraw.filledCircle(x + .08 * scale, y + .02 * scale, 
                                          .05 * scale);
                    PennDraw.filledArc(x, y - .05 * scale, .1 * scale, 180, 0);
                    break;
                }
                
                while (y >= horLine) {
                    //draw clouds
                    scale = -scale;
                    PennDraw.setPenColor(255, 255, 255);
                    PennDraw.filledEllipse(x, y, .2 * scale, .2 * scale);
                    PennDraw.filledEllipse(x + .3 * scale, y, .2 * scale, 
                                           .2 * scale);
                    PennDraw.filledEllipse(x - .3 * scale, y, .2 * scale, 
                                           .2 * scale);
                    break;
                } 
                
            }
        }
    }
}