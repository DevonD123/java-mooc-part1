
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {1, 2, 3, 4};
        System.out.println(build(b));
        System.out.println("");
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder str = new StringBuilder();
        str.insert(0,"{\n ");

        for (int i = 0; i < t.length; i++) {
            str.append(t[i]);
            if(i<t.length-1){
                str.append(", ");
                if((i+1)%4==0){
                    str.append("\n ");
                }
            }
        }
//        if(t.length %4 ==0){
            str.append("\n");
//        }
        str.append("}");
        return str.toString();
    }
}
