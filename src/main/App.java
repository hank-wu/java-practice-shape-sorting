package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int shapeCount;
        String characteristic;
        String order;
        List<IShape>shapeList = new ArrayList<>();

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
                try{
                    shapeList.add(new Circle(doubleBuffer));
                }catch(ShapeException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }else if(buffer.equals("r")){
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                try{
                    shapeList.add(new Rectangle(length, width));
                }catch(ShapeException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }else if(buffer.equals("t")){
                double a,b,c;
                a=scanner.nextDouble();
                b=scanner.nextDouble();
                c= scanner.nextDouble();
                try{
                    shapeList.add(new Triangle(a,b,c));
                }catch(ShapeException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }else return;
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
