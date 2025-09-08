package shapes;
public class Sphere
{
  double radius;
  public Sphere(double r){
   radius=r;
  }
  public double surfacearea(){
   return(4*3.14*(radius*radius*radius));
  }
  public double volume(){
    return(4*3.14*(radius*radius*radius*radius));
  }

}


