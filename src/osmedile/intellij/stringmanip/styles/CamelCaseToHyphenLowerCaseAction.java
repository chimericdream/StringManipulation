package osmedile.intellij.stringmanip.styles;

import osmedile.intellij.stringmanip.AbstractStringManipAction;

public class CamelCaseToHyphenLowerCaseAction extends AbstractStringManipAction {
    public CamelCaseToHyphenLowerCaseAction() {
    }

    public CamelCaseToHyphenLowerCaseAction(boolean setupHandler) {
        super(setupHandler);
    }

    public String transform(String s) {
        Style from = Style.from(s);
        if (from == Style.HYPHEN_LOWERCASE) {
            return Style.CAMEL_CASE.transform(from, s);
        } else {
            return Style.HYPHEN_LOWERCASE.transform(from, s);
        }
    }
}