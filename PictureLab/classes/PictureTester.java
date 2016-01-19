/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  
 public static void makeCollage()
 {
      Picture sourcePic = new Picture("lamp.jpg");
      Picture scaledPic=new Picture((sourcePic.getRows()),(sourcePic.getCols()/2));
      scaledPic.scaleWidthByHalf(sourcePic);
      Picture part1=new Picture((sourcePic.getRows()),(sourcePic.getCols()));
      part1.cropAndCopy(scaledPic,0,(scaledPic.getRows()-1),0,(scaledPic.getCols()-1),0,0);
      part1.cropAndCopy(scaledPic,0,(scaledPic.getRows()-1),0,(scaledPic.getCols()-1),0,(scaledPic.getCols()-1));
      part1.brightness(50);
      
      Picture part2=new Picture("lamp.jpg");
      part2.brightness(25);
      
      Picture collageCanvas=new Picture((sourcePic.getRows()*2),(sourcePic.getCols()*3));
      collageCanvas.cropAndCopy(part1,0,part1.getRows()-1,0,part1.getCols()-1,0,0);
      collageCanvas.explore();
 
 }
  
    public static void testScaleByHalf()
  {
    Picture sourcePic = new Picture("beach.jpg");
    Picture scaledPic=new Picture((sourcePic.getRows()/2),(sourcePic.getCols()/2));
    scaledPic.explore();
    scaledPic.scaleByHalf(sourcePic);
    scaledPic.explore();
    sourcePic.explore();
  }
 
  public static void testScaleWidthByHalf()
  {
    Picture sourcePic = new Picture("beach.jpg");
    Picture scaledPic=new Picture((sourcePic.getRows()),(sourcePic.getCols()/2));
    scaledPic.explore();
    scaledPic.scaleWidthByHalf(sourcePic);
    scaledPic.explore();
    sourcePic.explore();
  }
  
  public static void testDoubleVision()
  {
      Picture sourcePic = new Picture("man.jpg");
      Picture scaledPic=new Picture((sourcePic.getRows()),(sourcePic.getCols()/2));
      scaledPic.scaleWidthByHalf(sourcePic);
      Picture doubleVision=new Picture((sourcePic.getRows()),(sourcePic.getCols()));
      doubleVision.cropAndCopy(scaledPic,0,(scaledPic.getRows()-1),0,(scaledPic.getCols()-1),0,0);
      doubleVision.cropAndCopy(scaledPic,0,(scaledPic.getRows()-1),0,(scaledPic.getCols()-1),0,(scaledPic.getCols()-1));
      //doubleVision.dark();
      doubleVision.explore();
 
  }
 
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testCropAndCopy()
  {
    Picture destPic = new Picture("beach.jpg");
    Picture sourcePic = new Picture("caterpillar.jpg");
    destPic.explore();
    destPic.cropAndCopy(sourcePic, 10,100,10,100,100,100);
    destPic.explore();
    
  }
   public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
   public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
//   public static void testFixUnderwater()
//   {
//     Picture beach = new Picture("water.jpg");
//     beach.explore();
//     beach.fixUnderwater();
//     beach.explore();
//   }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorBotToTop();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    DigitalPicture p=new Picture();
    testMirrorHorizontal();
    testMirrorBotToTop();
    
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}