package Ass6.buttons;

public class ApplicationButton {
    private static Dialog dialog;

    static Dialog initialize(String button) throws Exception {

        if (button.equals("Web")) {
            dialog = new WebDialog();
        } else if (button.equals("Windows")) {
            dialog = new WindowsDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
        return dialog;
    }


   public static void main(String[] args) throws Exception {
          dialog = initialize("Windows");

          dialog.renderWindow();

    }
}
