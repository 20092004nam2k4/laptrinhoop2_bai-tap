package baitap.bai4;

public class MovableCircle implements Movable{
  private int radius;
  MovablePoint center;

  public MovableCircle(int x , int y , int xSpeed , int ySpeed , int radius) {
    super ( );
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "MovableCircle{" +
      "radius=" + radius +
      ", center=" + center +
      "} " + super.toString ( );
  }

  @Override
  public void moveUp(){

  }
  @Override
  public void moveDown(){

  }

  @Override
  public void moveLeft(){

  }

  @Override
  public void moveRight(){

  }
}
