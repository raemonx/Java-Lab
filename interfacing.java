interface pl1{
    static void display(){
        System.out.println("From pl1");
    }
}

interface pl2{
    static void display(){
        System.out.println("from pl2");
    }
}

class interfacing implements pl1,pl2{
    public void display(){
        pl1.display();
        pl2.display();
    }
    public static void main(String[] args) {
        interfacing inter=new interfacing();
        inter.display();
    }
}
