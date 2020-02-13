package java_easy;

// Write a function that removes any non-letters from a string, returning a well-known film title.
public class LettersOnly {

    public static void main(String[] args) {
        System.out.println(lettersOnly(",1|2))A^1<[_)?^]l[a`3+%!d@8-0_0d.*}i@&n?=")); //expect: Aladdin
        System.out.println(lettersOnly("^U)6$22>8p).")); //expect: Up
        System.out.println(lettersOnly("I5n!449+c@e*}@@1]p{2@`,~t:i0o%n<3%8")); //expect: Inception
        System.out.println(lettersOnly("!)P[s9)69}yc3+?1]+33>3ho")); //expect: Psycho
        System.out.println(lettersOnly(":~;G{o}o{+524<df~:>}e24{l8:_l]a:?@]%s7")); //expect: Goodfellas
        System.out.println(lettersOnly("&&S~]@8>1-0!h#r),80<_>!}|e>_k:")); //expect: Shrek
        System.out.println(lettersOnly(")^/|,!!09]=/1<G2?`=[l{a}d9]^i7a0|t6_o2*r")); //expect: Gladiator
        System.out.println(lettersOnly("]8;]V9e{=0r!.5t>i<^_g4o5~")); //expect: Vertigo
        System.out.println(lettersOnly("%%)??B#>/_4a#,;t8|m8675a(n")); //expect: Batman
        System.out.println(lettersOnly("97H^)~a8567ll*o?6%)w63e37e<n?@=")); //expect: Halloween
    }

    public static String lettersOnly(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }
}
