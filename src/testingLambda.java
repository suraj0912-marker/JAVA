interface L{
    void m();
}
class testingLambda{
    public static void main(String[] args) {
        String studentName="suraj";
        L name=()->{
            System.out.println(studentName);

        };
        name.m();
    }
}
