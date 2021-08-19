public class Rectangle extends geometricObject implements  Comparable<Rectangle>{
    private double width;
    private double height;
    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width +height);
    }
    public int compareTo(Rectangle r){
        return super.compareTo(r);
    }//继承父类，比较各个矩形对象面积
    /*如果不在父类中写compareTo方法，则是写
    public int compareTo(Rectangle r) {
        if(this.getArea() < r.getArea()){
        return -1;
        }
        else if(this.getArea() == r.getArea()){
        return 0;
        }
        else {
        return -1;
        }
     */
    public String toString(){
        return "矩形的高："+ height +"矩形的宽："+ width +" 面积:"+getArea() + " 周长："+ getPerimeter() +"\n";
    }
}
