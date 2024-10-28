class Animal{
    public void Voice() {
        System.out.println(".....");
    }
}

class Cat extends Animal {
    public void Voice() {
        System.out.println("Meow");
    }

}

class Dog extends Animal {
    public void Voice() {
        System.out.println("Wof");
    }
}

class Main{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.Voice();

        Cat cat = new Cat();
        cat.Voice();

        Dog dog = new Dog();
        dog.Voice();
    }
}

/*
полиморфизм позволяет добавлять новые классы, реализующие интерфейсы, без необходимости менять код
упрощают код
улучшает читаемость

снижает производительность
появляется возможность некорректного использования программы
проблемы с приведением типов
 */