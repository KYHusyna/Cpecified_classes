package com;

public class PregnantClass {
    private class innerClass {
        private int first = 11;

        protected int first() {
            return first;
        }
    }

   public void voidCLass() {
        innerClass innerCL = new innerClass();
        System.out.println(innerCL.first());
    }
}
