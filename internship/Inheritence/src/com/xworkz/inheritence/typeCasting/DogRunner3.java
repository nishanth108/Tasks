package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Animal;
import com.xworkz.inheritence.inner.Dog;

public class DogRunner3 {
    public void info(Animal animal)
    {
        if (animal!=null) {
            animal.run();
            animal.bark();
            animal.jump();
            animal.eat();

            if( animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.nickName();
            }
        }
    }

}
