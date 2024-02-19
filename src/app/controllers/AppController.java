package app.controllers;

import app.model.DataProvider;
import app.view.AppView;

public class AppController {
    public AppController() {
        run();
    }

    private void run() {
        AppView view = new AppView();
        DataProvider dataProvider = new DataProvider();

        switch (view.getMenu()) {
            case "1" -> view.getAllItems(
                    dataProvider.getData());
            case "2" -> view.getOneItem(
                    dataProvider.getItemByKey(
                            dataProvider.getData(),
                            view.getIndex()));

        }

    }
}
