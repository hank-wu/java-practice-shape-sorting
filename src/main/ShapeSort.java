package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AscAreaComparator implements Comparator<IShape>{
    @Override
    public int compare(IShape a, IShape b) {
        if (a.area() > b.area()) {
            return 1;
        }
        else return -1;
    }
}

class DescAreaComparator implements Comparator<IShape>{
    @Override
    public int compare(IShape a, IShape b) {
        if (a.area() < b.area()) return 1;
        else return -1;
    }
}

class AscPerimeterComparator implements Comparator<IShape>{
    @Override
    public int compare(IShape a, IShape b) {
        if(a.perimeter() > b.perimeter()) return 1;
        else return -1;
    }
}

class DescPerimeterComparator implements Comparator<IShape>{
    @Override
    public int compare(IShape a, IShape b) {
        if(a.perimeter() < b.perimeter()) return 1;
        else return -1;
    }
}

public class ShapeSort {
    ArrayList<IShape>shapeList;
    public void setList(ArrayList<IShape>shapeList){
        this.shapeList = shapeList;
    }

    public void executeBy(String characteristic,String order){
        if(characteristic.equals("area")){
            if(order.equals("asc")){
                Collections.sort(shapeList, new AscAreaComparator());
            }
            else
                Collections.sort(shapeList, new DescAreaComparator());
        }else if(characteristic.equals("perimeter")){
            if(order.equals("asc"))
                Collections.sort(shapeList, new AscPerimeterComparator());
            else
                Collections.sort(shapeList, new DescPerimeterComparator());
        }
    }
}
