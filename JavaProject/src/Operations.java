public class Operations {
    public static void main(String[] args) {
        System.out.println(sumOf2Numbers(2, 3));
        System.out.println(diffOf2Numbers(9,6));
        System.out.println(diffOf2Numbers(3,7));
        System.out.println(multiplyOf2Numbers(2,6));
        System.out.println(divisionOf2Numbers(10,5));
        System.out.println(remainderofDiv(9,2));
    }

    public static int sumOf2Numbers(int a, int b) {
        return a + b;
    }
    public static int diffOf2Numbers(int a,int b){
        return a-b;
    }
    public static int multiplyOf2Numbers(int a,int b){
        return a*b;
    }
    public static int divisionOf2Numbers(int a,int b){
        return b/a;
    }
    public static int remainderofDiv(int a,int b){
        return a%b;
    }

}

