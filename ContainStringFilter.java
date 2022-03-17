public class ContainStringFilter implements Filter{
    private String pattern;

    public ContainStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.contains(pattern);
    }
}