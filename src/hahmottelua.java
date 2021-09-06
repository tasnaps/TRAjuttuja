public class hahmottelua {
    static int jarjesta(){
        int aika = 0;
        int maara = 10000;

        for(int i = 0; i<=maara; i++){
            aika += maara;
            maara -= 1;
        }
        return aika;
    }

    public static void main(String[] args) {
        System.out.println(jarjesta());
    }
}
