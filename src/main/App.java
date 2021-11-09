package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int shapeCount;
        String characteristic;
        String order;
        ArrayList<IShape>shapeList = new ArrayList<IShape>();

        Scanner scanner = new Scanner(System.in);

        shapeCount = scanner.nextInt();
        characteristic = scanner.next();
        order = scanner.next();

        String buffer;
        double doubleBuffer;
        for(int i=0; i<shapeCount; i++){
            buffer = scanner.next();
            if(buffer.equals("c")){
                doubleBuffer = scanner.nextDouble();
                shapeList.add(new Circle(doubleBuffer));
            }else if(buffer.equals("r")){
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                shapeList.add(new Rectangle(length, width));
            }else if(buffer.equals("t")){
                double a,b,c;
                a=scanner.nextDouble();
                b=scanner.nextDouble();
                c= scanner.nextDouble();
                shapeList.add(new Triangle(a,b,c));
            }else break;
        }

        ShapeSort shapeSort = new ShapeSort();
        shapeSort.setList(shapeList);
        shapeSort.executeBy(characteristic,order);

        for(IShape s: shapeList){
            if(characteristic.equals("area"))
                System.out.print(s.area() + " ");
            else
                System.out.print(s.area() + " ");
        }
    }
}
