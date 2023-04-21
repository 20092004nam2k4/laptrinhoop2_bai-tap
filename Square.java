package baitap.bai1;

import baitap.bai1.Rectangle;

public class Square extends Rectangle {


  public Square() {
  }

  public Square(double width , double length) {
    super ( width , length );
  }

  public Square(String color , boolean filled , double width , double length) {
    super ( color , filled , width , length );
  }

  public void setWidth(double side) {
    setWidth ( side );
  }

  public void setLength(double side) {
    setLength ( side );
  }

  public void setide( double side){
    setWidth (side);
  }

  public double getSide(){
    return getSide ();
  }

  @Override
  public String toString() {
    return "Square"
      + super.toString ();
  }
}
