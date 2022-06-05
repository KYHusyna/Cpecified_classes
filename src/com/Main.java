package com;

public class Main {
    static int j = 2;
    static Info information = new Info((char) 22) {
        {
            System.out.println("First anonymous class");
        }

        public int getNUmber() {
            return Character.digit(getSymbol(), 10);
        }
    };


    public static void main(String[] args) {
        int first = 1;

        System.out.println(information.getNUmber());
        Info data = new Info() {
            private int i = 100;
            String words;

            {
                System.out.println("Second anonymous class");
            }

            public int getNUmber() {
                i = show();
                return i + Character.getNumericValue(getSymbol());
            }

            private int show() {
                return i + j;
            }
        };
        System.out.println(data.getNUmber());

        System.out.println("Inner class output");
        PregnantClass innerClass = new PregnantClass();
        innerClass.voidCLass();

        Variations.B1.canGet();//because static
        Variations ob = new Variations();
        ob.outputNestedClasses();

        Other other = new Other();
        other.otherMethod();

        other.demo.show();

        other.congratulations.show();

        Journal journal = new Journal();
        journal.output();

        other.sport.show();

    }
}

class Variations {
    static int a1 = 1;
    int a2 = 2;

    public void outputNestedClasses () {
        B1 b1Example = new B1();
        b1Example.b1();
        B2 b2Example = new B2();
        new B2().b2();
    }

    protected static class B1 {
        public static void b1() {
            System.out.println("Static nested class and static variable: \na1=" + a1 );
        }
        public static void canGet() {
            System.out.println("\nCan get static method");
        }
    }

    protected  class B2 {
        public void b2() {
            System.out.println("Non static nested class and all variables " +
                    "\n(static)a1=" +a1 + " (non static)a2="+a2);
        }
    }
}
