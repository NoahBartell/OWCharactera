package Classes;


public class Main {
    public static CharList list = new CharList();
    public static MyGUI gui = new MyGUI();
    public static void main(String[] args) {
        gui.set();
        gui.setVisible(true);
    }

    public static void Roll(){
        gui.textArea.setText(list.Roll());
    }

    public static void Reset(){
        list.reset();
        gui.textArea.setText("List Reset, roll again");
    }
}
