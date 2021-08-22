public abstract class geometricObject {
    public abstract double getArea();          //abstract用于说明该类为抽象类，即没有实例对象的类
    public abstract double getPerimeter();
    public int compareTo(geometricObject g){   //int compareTo()方法将number数进行比较   g:参数
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
