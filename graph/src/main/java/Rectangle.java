public class Rectangle extends geometricObject implements  Comparable<Rectangle>{  //通过extends创建一个类的子类；implements声明自己使用一个或多个接口
    private double width;    //private 用于指定私有成员
    private double height;
    public Rectangle(){
    }
    public Rectangle(double width,double height){   //public 用于指定公有成员
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
    public String toString(){ //这个函数能主动调用toString库函数，用toString函数产生的字符串来输出要输出的东西
        return "矩形的高："+ height +"矩形的宽："+ width +" 面积:"+getArea() + " 周长："+ getPerimeter() +"\n";
    }
}
