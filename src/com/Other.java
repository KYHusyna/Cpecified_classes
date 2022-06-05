package com;

public class Other {
    public void otherMethod() {
        int x = 1;

        class Inner {
            final int y = 5;

            {
                System.out.println("Class internal method");
            }

            public void innerMethod() {
                System.out.println("x= " + x + " y= " + y);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    // anonymous class
    static Demo demo = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Internal anonymous class method");
        }
    };

    static Hello congratulations = new Hello() {
        public void show(){
            System.out.println("Implementation through the interface \nInternal anonymous class method");
        }
    };

    static Sport sport = new Sport() {
        @Override
        public void show() {
            super.show();
            System.out.println("sprint");
        }
    };
}

class Sport {
    public void show() {
        System.out.println("Sport life");
    }
}

class Demo {
    public void show() {
        System.out.println("\nMethod of super class");
    }
}


interface Hello {
    void show();
}
