//abstract keyword used to identify an abstract class
//this class cannot be instatiated  by itself can be instatiated by using child classes
public abstract class GraphicObject{
    int x, y;//this variable can be accessed only by child classes

    void moveTo(int newX, int newY){
        System.out.println("move to x :" +x+" and y:"+y);
    }

    //must have atleast one abstract method

    abstract void draw();
    abstract void resize();
}