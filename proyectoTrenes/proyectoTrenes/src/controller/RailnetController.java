package controller;

import model.RailnetModel;
import view.RailnetView;

public class RailnetController {
    RailnetModel model;
    RailnetView view;

    public RailnetController(RailnetModel model, RailnetView view){
        System.out.println("Railnet controller");
        this.model = model;
        this.view = view;
    }

    public void start(){
        this.view.init(this.model.getTitle());
    }
}
