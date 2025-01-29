interface Base{
    default void show(String txt){
        System.out.println("Интерфейс Base: "+txt);
    }
    void hello();
}
class Alpha implements Base {
    public void hello(){
        System.out.println("Объект класс Alpha");
    }

    public void show(String txt){
        System.out.println("Класс Alpha: "+txt);
    }
}

class Bravo implements Base{
    public void hello(){
        System.out.println("Объект класса Bravo");
    }
}

class UsingDefaultMethodsDemo {
    public static void main(String[] args){

        Base ref;
        Alpha objA = new Alpha();
        objA.hello();
        objA.show("объектная переменная objA");

        ref=objA;
        ref.show("интерфейсная переменная ref");

        Bravo objB = new Bravo();
        objB.hello();
        objB.show("объектная переменая objB");

        ref=objB;
        ref.show("интерфейсная переменая ref");
    }
}
