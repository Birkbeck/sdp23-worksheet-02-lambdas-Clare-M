public class StringUtils implements TwoStringPredicate{

    @Override
    public boolean betterString(String s1, String s2) {
        TwoStringPredicate newPredicate = (a, b) -> a.length() > b.length();
        return newPredicate.betterString(s1, s2);
    }
}
