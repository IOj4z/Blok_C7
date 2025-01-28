abstract class ColoredFigure {
    String color;
    int size;

    ColoredFigure(String clr,int s){
        color = clr;
        size = s;
    }

    void show(){
        System.out.println("Фигура: "+color+" "+getName());
        System.out.println("Характерный размер ("+getName()+"):"+size);
        System.out.printf("Площадь: %.3f\n",getArea());
        String line="";
        for(int k=1; k<=30;k++){
            line+="*";
        }
        System.out.println(line);
    }

    String getSize(){
        return "сторона";
    }
    abstract String getName();
    abstract double getArea();
}

class Triangle extends ColoredFigure{

    Triangle(String clr, int s) {
        super(clr, s);
    }

    /**
     * @return 
     */
    @Override
    String getName() {
        return "треугольник";
    }

    /**
     * @return 
     */
    @Override
    double getArea() {
        double k=Math.sqrt(3)/4;
        return size*size*k;
    }
}

class Square extends ColoredFigure{

    Square(String clr, int s) {
        super(clr, s);
    }

    /**
     * @return 
     */
    @Override
    String getName() {
        return "квадрат";
    }

    /**
     * @return 
     */
    @Override
    double getArea() {
        double k=1;
        return size*size*k;
    }
}

class Circle extends ColoredFigure{

    Circle(String clr, int s) {
        super(clr, s);
    }

    /**
     * @return 
     */
    @Override
    String getName() {
        return "круг";
    }

    /**
     * @return 
     */
    @Override
    double getArea() {
        double k=Math.PI;
        return size*size*k;
    }
    String getSizeName(){
        return "радиус";
    }
}

class UsingAbstractClassDemo{
    public static void main(String[] args){
        Triangle T=new Triangle("красный", 2);
        Square S=new Square("черный", 3);
        Circle C=new Circle("желтый", 1);

        System.out.println("Использование объектных переменных подкласса");

        T.show();
        S.show();
        C.show();

        ColoredFigure F;
        System.out.println("Использование объктной переменной абстрактного суперкласса");

        F=T;
        F.show();
        F=S;
        F.show();
        F=C;
        F.show();
    }
}