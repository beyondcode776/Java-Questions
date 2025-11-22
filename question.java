class question {
    static int a = 27;
    long b;
    question (long b) {
        this.b = b;
    }
    // question() {
    //     a = 27;
    // }
    void display(){
        System.out.println( "University roll no. " + b);
    }
    class inner {
        void show() {
            System.out.println("class roll no. " + a);
        }
    }


    public static void main(String[] args) {
        question obj = new question(24150008);
        question.inner obj2 = obj.new inner();
        obj2.show();
        obj.display();
    }
}