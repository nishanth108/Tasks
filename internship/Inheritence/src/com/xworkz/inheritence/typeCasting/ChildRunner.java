package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Child;
import com.xworkz.inheritence.inner.Parent;

public class ChildRunner {
    public void info(Parent parent) {
        if (parent!=null) {
            parent.hobbies();
            parent.bloodGroup();
            parent.lastName();
            parent.skinColor();

            if (parent instanceof Child) {
                Child dslr = (Child)parent;
                dslr.property();
            }
        }
    }
}
