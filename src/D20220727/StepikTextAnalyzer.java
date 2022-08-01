/*
public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
        Label label =  analyzer.processText(text);
        if (label != Label.OK)
        return label;
        }
        return Label.OK;
        }

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    private Label label;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
        label = Label.TOO_LONG;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)
            return label;
        return Label.OK;
    }
}
public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected String[] keywords;
    protected Label label;

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
    @Override
    public Label processText(String text) {
        for (String key : keywords) {
            if (text.contains(key)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}

public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;
    private Label label;

    public SpamAnalyzer(String[] keywords) {
        super.keywords = keywords;
        super.label = Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return super.keywords;
    }

    @Override
    protected Label getLabel() {
        return super.label;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private String[] keywords;
    private Label label;

    public NegativeTextAnalyzer() {
        super.label = Label.NEGATIVE_TEXT;
        super.keywords = new String[] {":(",  "=(",  ":|"};
    }

    @Override
    protected String[] getKeywords() {
        return super.keywords;
    }

    @Override
    protected Label getLabel() {
        return super.label;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}*/
