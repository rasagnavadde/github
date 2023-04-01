public class SomethingDifferentClass {
    public static void main(String[] args) {

        String s = "Rasagna";
        String r = "sarath";
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.substring(0, 3));
        System.out.println(s + r);
        System.out.println(return3Timesfirst3chars(s));
    }
        public static String return3Timesfirst3chars(String s)
        {
            String str = s.substring(0, 3);
            return str + str + str;
        }

}
