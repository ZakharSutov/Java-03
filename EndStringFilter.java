public class EndStringFilter implements Filter{
    private String pattern;

    public EndStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.endsWith(pattern);
    }
}