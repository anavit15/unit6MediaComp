public class PictureCollageMosaicSmallerTiles{

  public static void main(String args[]){
    
    //method uses crop and compose to tile a picture
    //add up to 4 pixels randomly to the target and the source 
    
    
    //pick a picture
    FileChooser.setMediaPath("C:/Documents and Settings/Administrator/My Documents/My Pictures/");
    Picture p = new Picture(FileChooser.getMediaPath("tn_buster.jpg"));
    
    //create a canvas
    Picture canvas = new Picture(p.getWidth(),p.getHeight());
   
    //y coordinate incrementing
    //source = picture being cropped
    //target = position on canvas
 for(int sourcey = 0, targety=0; sourcey < p.getHeight() - 30; sourcey+=16, targety+=16){
    
    //x coordinate incrementing    
    
 for(int sourcex = 60, targetx=0; sourcex < p.getWidth() - 30; sourcex+=15, targetx+=17)
    p.crop(sourcex +(int) (Math.random()*3), sourcex+16 , sourcey+(int) (Math.random()*3), sourcey+16).compose(canvas, targetx+(int) (Math.random()*3), targety+(int) (Math.random()*3));
    
    //(int) (Math.random()*3)
    
    }//end of both "for loops"
   canvas.show();
   canvas.write("C:/Documents and Settings/Administrator/My Documents/My Pictures/busterMosaicSmall.jpg");
  }
}
  

