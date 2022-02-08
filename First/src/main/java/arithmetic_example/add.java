package arithmetic_example;

public class add {
    private int a;
    private int b;
    private int c;

//    If type is mentioned then it will call the required constructor else it will call the default

    public add(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.c=a+b;
        System.out.println("Integer "+a+" "+b+" "+c);
    }
    public add(double a, double b, double c) {
        this.a = (int)a;
        this.b = (int)b;
        this.c = (int)c;
        this.c=(int)a+(int)b;
//        not this.c its c
        System.out.println("Double "+a+" "+b+" "+c);
    }


//    This will be called by default if there is no type mentioned because spring is confused that whome to call so it is known as AMBIGUITY PROBLEM
    public add(String a,String b,String c){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        this.c = Integer.parseInt(c);
        this.c=this.a+this.b;
//        not this.c its c
        System.out.println("String "+a+" "+b+" "+c);
    }

    @Override
    public String toString() {
        return "c="+c;
    }
}
