package objectOrientedProgramming;


class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void classMethod() {
        System.out.println(classVar);  // OK
//        System.out.println(instanceVar);  // Error
    }

    public void instanceMethod(){
        System.out.println(classVar);  // OK
        System.out.println(instanceVar);  // OK Too ?????
    }
}

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(Foo.classVar); // OK
//        System.out.println(Foo.instanceVar); // Error

        Foo.classMethod();
//        Foo.instanceMethod();  // Error


        System.out.println("-----------------------------");



        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar);   // 아랫줄의 코드를 더 추천
        System.out.println(Foo.classVar);  // 윗줄보다는 지금 코드가 더 좋음

        System.out.println(f1.instanceVar);


        f1.classVar = "Changed by f1 from \"I class var\"" ;
        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);

        f1.instanceVar = "Change by f1 from \"I instance var\"";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);


        System.out.println("-----------------------------");

        f1.instanceMethod();
        f2.instanceMethod();

    }
}


// static : belongs to class
// non-static : belongs to instance