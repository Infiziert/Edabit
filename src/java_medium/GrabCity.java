package java_medium;

// Write a function to return the city from each of these vacation spots.
public class GrabCity {

    public static void main(String[] args) {
        System.out.println(grabCity("[Last Day!] Beer Festival [Munich]"));
        System.out.println(grabCity("Cheese Factory Tour [Portland]"));
        System.out.println(grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]"));
    }

    /**
     *  There may be additional brackets, but the city will always be in the last bracket pair.
     */
    public static String grabCity(String str) {
        return str.substring(str.lastIndexOf('[') + 1, str.lastIndexOf(']'));
    }
}
