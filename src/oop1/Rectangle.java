package oop1;

public class Rectangle {
    int width;
    int height;


    int calculateArea(){
        return width*height;
    }

    int calculateParimeter(){
        return 2*(width+height);
    }

    boolean isSquare(){
        return width==height;
    }
}
