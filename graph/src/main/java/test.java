import java.util.Arrays;

public class test {
    public static void main(String[] args){
        Rectangle[] rs = {
                new Rectangle(5.1,3.9),
                new Rectangle(1.6,9.5),
                new Rectangle(5.6,7.6),
        };
        Arrays.sort(rs);//对矩形面积进行升序排序
        for (Rectangle r:rs){
            System.out.print(r + "");
            System.out.println();
        }//以矩形面积升序输出矩形面积数组
        System.out.println("--------------------------");
        Circle[] cs = {
                new Circle(1.5),
                new Circle(2.4),
                new Circle(1.9),
        };
        Arrays.sort(cs);//对圆面积进行升序排序
        for (Circle c:cs){
            System.out.print(c + "");
            System.out.println();
        }//以圆面积升序输出矩形面积数组
    }
}
