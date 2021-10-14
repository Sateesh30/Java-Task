package com.javatask; 
class Override

{
    public void eat()
    {
        System.out.println("Eat all eatables");
    }
}

class Dog extends Override
{
    public void eat()   
    {
        System.out.println("Dog like to eat meat");
    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}