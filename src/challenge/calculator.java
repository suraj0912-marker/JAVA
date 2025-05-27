package challenge;

class calculator {
    public int add(int first,int second){
        return first+second;
    }
    public int add(int first ,int second,int third){
        return first+second+third;
    }
    public double add(double first,double second){
        return  first+second;

    }
        public static void main(String[] args) {
            calculator c = new calculator();
            System.out.println(c.add(5, 7));
            System.out.println(c.add(6, 7, 8));
            System.out.println(c.add(7.021, 4.12));
        }
    }




