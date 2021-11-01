package CS203Course.InnerClass;

class OuterClass_1 {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x; //fixme this is accessing from the outer class
        }
    }
}

class Main1 {
    public static void main(String[] args) {

        OuterClass_1 myOuter = new OuterClass_1();
        OuterClass_1.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}