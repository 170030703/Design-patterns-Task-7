package facade;
/*
 * @author 170030703 Bhargav Reddy
 */
// client->Request->processed Request->Return result
//
public class FacadePattern {
	 public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }

}
