public abstract class geometricObject {
    public abstract double getArea();
    public abstract double getPerimeter();
    public int compareTo(geometricObject g){
        if (this.getArea() <g.getArea()){
            return -1;
        }
        else if (this.getArea() == g.getArea()){
            return 0;
        }
        else{
            return -1;
        }
    }
}
