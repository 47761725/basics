public class Circle extends geometricObject implements Comparable<Circle>{
    private double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public int compareTo(Circle c){
        return super.compareTo(c);
    }//继承父类，比较各个圆对象面积
    /*
    如果不在父类中写compareTo方法，参考Rectangle类
     */
    public String toString(){
        return "圆的半径：" + radius + " 面积："+ getArea() +  " 周长："+ getPerimeter() +"\n";
    }
}
