package control;

import view.MainView;

public class MainController {

    public static void main(String[]args){
        ModelController modelC=new ModelController();
        MainView viewC=new MainView(modelC);
        modelC.setViewController(viewC);
        viewC.update();

    }

}
