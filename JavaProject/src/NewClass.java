public class NewClass{
    public static void main(String[] args) {
        System.out.println(areWeParrying(true,false));
        System.out.println(areWeParrying(false,true));
        System.out.println(areWeParrying(false,false));
        System.out.println(areWeParrying(true,true));
    }
    public static boolean areWeParrying(boolean weekend,boolean morethan100)
    {
        if(weekend==true&&morethan100==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
