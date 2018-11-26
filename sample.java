class sample{
    static int v=5;
    public static void main(String[] args) {
        sample obj = new sample();
        final int v=7;
        obj.method(v);
    }
    void method(int v){
        v=10;

        System.out.println(this.v);

        System.out.println(v);
    }
}