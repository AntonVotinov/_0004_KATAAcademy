package D20220724;

public class HumanDNA {
    int dnaCode;
    public boolean equals(HumanDNA man) {
        return this.dnaCode == man.dnaCode;
    }

    public static void main(String[] args) {
        HumanDNA human1 = new HumanDNA();
        HumanDNA human2 = new HumanDNA();
        human1.dnaCode = 123321;
        human2.dnaCode = 123321;
        System.out.println(human1.equals(human2));
        String s = "sss";
        System.out.println(s.intern());
    }
}
