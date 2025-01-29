package fifePack;


class MethodsArgumentDemo {
    static void swap(int a, int b){
        System.out.println("Выполняется метод swap()");
        System.out.println("Аргумент до изменение значение: "+a+" и "+b);
        int x=b;
        b=a;
        a=x;

        System.out.println("Аргумент после изменение значение: "+a+" и "+b);
        System.out.println("Завершение выполнение swap()");
    }

    public static void main(String[] args){
        int m=100,n=200;
        System.out.println("Переменные до вызова метода swap(): "+m+" и "+n);
        swap(m,n);
        System.out.println("Переменные после вызова метода swap(): "+m+" и "+n);
    }
}
