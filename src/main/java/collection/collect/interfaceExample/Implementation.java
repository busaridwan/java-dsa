package collection.collect.interfaceExample;

public class Implementation implements Contract{
// ::: IMPLEMENTS ALL METHODS OF BOTH Contract AND ExtendedContract
    @Override
    public void term1() {
        System.out.println("Implementation: term1");
    }

    @Override
    public void term2() {
        System.out.println("Implementation: term2");
    }
}
