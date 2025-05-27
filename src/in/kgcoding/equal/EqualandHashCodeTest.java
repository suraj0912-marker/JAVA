package in.kgcoding.equal;

public class EqualandHashCodeTest {
    public static void main(String[] args) {
        person p=new person("Suraj",5,"0822CS221185");
        person p1=new person("Suraj",5,"0822CS221185");
        if(p==p1){

        }else {
            System.out.println("not equal");
        }
    }
}
