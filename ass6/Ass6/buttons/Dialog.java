package Ass6.buttons;

public abstract class Dialog {
    
    abstract Button createButton();


    public void renderWindow(){
        Button button = createButton();
       // button.onClick();
        button.render();
    }
}
