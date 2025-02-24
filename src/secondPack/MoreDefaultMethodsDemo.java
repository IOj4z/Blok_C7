package secondPack;

interface First{
    default void hello(){
        System.out.println("Метод из интерефейса firstPack.secondPack.First");
    }
}
interface Second{
    default void hello(){
        System.out.println("Метод из интерфейса firstPack.secondPack.Second");
    }
}

class MyClass implements First,Second {
    public void hello(){
        First.super.hello();
        Second.super.hello();
    }
}
class MoreDefaultMethodsDemo {
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.hello();
    }
}
