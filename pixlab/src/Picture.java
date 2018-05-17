import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
	
  public Picture ()
  {
	super();  
	
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
	 
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to keep only the blue values */
  public void keepOnlyBlue(){
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray: pixels){
		  for(Pixel pixelObj: rowArray){
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  /** Method to negate pixels */
  public void negate(){
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray: pixels){
		  for(Pixel pixelObj: rowArray){
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setBlue(255 - pixelObj.getBlue());
		  }
	  }
  }
  
  /** Method averaging the RGB values in order to create a grayscale */
  public void grayscale(){
	  Pixel[][] pixels = this.getPixels2D();
	  int avg = 0;
	  for(Pixel[] rowArray: pixels){
		  for(Pixel pixelObj: rowArray){
			  avg = pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen();
			  avg /= 3;
			  pixelObj.setRed(avg);
			  pixelObj.setGreen(avg);
			  pixelObj.setBlue(avg);
		  }
	  }
  }
  
  /** Method to fix the underwater image in order to make the fish more visible */
  public void fixUnderwater(){
	  Pixel[][] pixels = this.getPixels2D();
	  int avg = 0;
	  for(Pixel[] rowArray: pixels){
		  for(Pixel pixelObj: rowArray){
			  if(pixelObj.getRed() < 25){
				  pixelObj.setBlue(pixelObj.getBlue() + 50);
			  }
		  }
	  }
  }
  
  /** Method to mirror image top to bottom */
  public void mirrorHorizontal(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel botPixel = null;
	Pixel topPixel = null;
	int height = pixels.length;
	for(int col = 0; col < pixels[0].length; col++){
		for(int row = 0; row < height / 2; row++){
			topPixel = pixels[row][col];
			botPixel = pixels[height - 1 - row][col];
			botPixel.setColor(topPixel.getColor());
		}
	}
	
  }
  
  /** Method to mirror image bottom to top */
  public void mirrorHorizontalBotToTop(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel botPixel = null;
	Pixel topPixel = null;
	int height = pixels.length;
	for(int col = 0; col < pixels[0].length; col++){
		for(int row = 0; row < height / 2; row++){
			topPixel = pixels[row][col];
			botPixel = pixels[height - 1 - row][col];
			topPixel.setColor(botPixel.getColor());
		}
	}
  }
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println("Iterated " + count + " times.");
  }
  
  /** Mirror the arms of a snowman */
  public void mirrorArms(){
	  //column 104 - 170, 237 - 293
	  //row 159
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  int mirrorPoint = 200;
	  for(int row = 159; row < 196; row++){
		  for(int col = 104; col < mirrorPoint; col++){
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  if(rightPixel.getRed() > 150){
				  rightPixel.setColor(leftPixel.getColor());
			  }
			  
			  
		  }
	  }
	  
	  for(int row = 159; row < 196; row++){
		  for(int col = mirrorPoint - 1; col > 103; col--){
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  
			  leftPixel.setColor(rightPixel.getColor());
			  
			  
			  
		  }
	  }
	  
	  
  }
  
  /** Method to mirror a gull */
  public void mirrorGull() {
	  int mirror = 340;
	  Pixel[][] a = this.getPixels2D();
	  Pixel right = null;
	  Pixel left = null;
	  for(int i = 235; i<323;i++) {
		  for (int y = 238; y<mirror; y++) {
			  right = a[i][y];
			  left = a[i][mirror - y + mirror/3];
			  left.setColor(right.getColor());
		  }
	  }
	  
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\Users\\zhangm0123\\Desktop\\MeilongExampleProject\\pixlab\\src\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\zhangm0123\\Desktop\\MeilongExampleProject\\pixlab\\src\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\Users\\zhangm0123\\Desktop\\MeilongExampleProject\\pixlab\\src\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel left = null;
    Pixel right = null;
    Pixel top = null;
    Pixel bottom = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        top = pixels[row][col];
        if((row+1)==pixels.length) {
        	bottom = pixels[row][col];
        }
        else {
        	bottom = pixels[row+1][col];
        }
        bottomColor = bottom.getColor();
        left = pixels[row][col];
        right = pixels[row][col+1];
        rightColor = right.getColor();
        if (left.colorDistance(rightColor) > 
            edgeDist || top.colorDistance(bottomColor) > edgeDist)
          left.setColor(Color.BLACK);
        else
          left.setColor(Color.WHITE);
      }
    }
  }
  
  /* Method for blurring */
  boolean info = false;
  public void blur(int x, int y, int w, int h){
	  if(!info){
		  System.out.println("Meilong Zhang, Period 1, 4/24/2018, Computer 5");
		  info = true;
	  }
	  
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel pixel = pixels[x][y];
	  for(int i = y; i < y + h; i++){
		  for(int z = x; z < x + w; z++){
			  pixel = pixels[z][i];
			  leftPixel = pixels[z - 1][i];
			  rightPixel = pixels[z + 1][i];
			  topPixel = pixels[z][i - 1];
			  botPixel = pixels[z][i + 1];
			  pixel.setRed((leftPixel.getRed() + rightPixel.getRed() + topPixel.getRed() + botPixel.getRed() + pixel.getRed()) / 5);
			  pixel.setBlue((leftPixel.getBlue() + rightPixel.getBlue() + topPixel.getBlue() + botPixel.getBlue() + pixel.getBlue()) / 5);
			  pixel.setGreen((leftPixel.getGreen() + rightPixel.getGreen() + topPixel.getGreen() + botPixel.getGreen() + pixel.getGreen()) / 5);
		  }
	  }
  }
  
  /* Given encode*/
  public void encode(Picture messagePict){

	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++){
		  for (int col = 0; col < this.getWidth(); col++){
			  // if the current pixel red is odd make it even
			  currPixel = currPixels[row][col];
			  if (currPixel.getRed() % 2 == 1)
				  currPixel.setRed(currPixel.getRed() - 1);
			  messagePixel = messagePixels[row][col];
			  if (messagePixel.colorDistance(Color.BLACK) < 50){
				  currPixel.setRed(currPixel.getRed() + 1);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
  }
  
  
  
  
  
  
  
  public void myEncode(Picture messagePict){
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++){
		  for (int col = 0; col < this.getWidth(); col++){
			  currPixel = currPixels[row][col];
			  if((currPixel.getRed() % 5) == 0 || currPixel.getRed() == 0){
				  currPixel.setRed(currPixel.getRed() + 1);
			  }
			  messagePixel = messagePixels[row][col];
			  if(messagePixel.colorDistance(Color.BLACK) < 50){
				  while((currPixel.getRed() % 5) != 0){
					  count++;
					  currPixel.setRed(currPixel.getRed() + 1);
				  }
			  }
		  }
	  }	  
  }
  
  
  
  
  
  
  
  
  public Picture myDecode(){
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++){
		  for (int col = 0; col < this.getWidth(); col++){
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (currPixel.getRed() % 5 == 0){
				  messagePixel.setColor(Color.BLACK);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  
  
  
  
  
  
  
  
  /* Given decode */
  public Picture decode(){
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++){
		  for (int col = 0; col < this.getWidth(); col++){
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (currPixel.getRed() % 2 == 1){
				  messagePixel.setColor(Color.BLACK);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("C:\\Users\\zhangm0123\\Desktop\\MeilongExampleProject\\pixlab\\src\\crybytes-apple_icon.jpg");
    beach.explore();
    //beach.zeroBlue();
    //beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
