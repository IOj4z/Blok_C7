package thirdPack;

interface First{
    default void alpha(){
        System.out.println("Интерефейс с First: метод alpha()");
    }
}

interface Second extends First{
    default void alpha(){
        First.super.alpha();
        System.out.println("Интерфейс с Bravo: метод alpha()");
    }

    default void bravo(){
        System.out.println("Интерфейс с Bravo: метод bravo()");
    }
}

class MyClass implements Second{
    public void bravo(){
        Second.super.bravo();
        System.out.println("Интерфейс с MyClass: метод bravo()");
    }
}
class MoreExtendingInterfaceDemo {
    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.alpha();
        obj.bravo();
    }
}
