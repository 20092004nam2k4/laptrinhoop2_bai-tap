package baitap.bai3;

public class MovablePoint1 implements Movable {
  private int x;
  private int y;
  private int xSpeed;
  private int ySpeed;


  public MovablePoint1(){
    super();
  }

  public MovablePoint1(int x, int y, int xSpeed,int ySpeed){
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return "MovablePoint{" +
      "x=" + x +
      ", y=" + y +
      ", xSpeed=" + xSpeed +
      ", ySpeed=" + ySpeed +
      '}';
  }

  @Override
  public void moveUp(){
  }

  @Override
  public void  moveDown(){

  }

  @Override
  public void moveLeft(){

  }

  @Override
  public void moveRight(){

  }
}
