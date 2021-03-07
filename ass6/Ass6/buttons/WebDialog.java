package Ass6.buttons;

public class WebDialog extends Dialog{
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
