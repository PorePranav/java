//Created by Pranav on 10th May 2022
package CarClass;

import java.util.Locale;

public class Car{
    private int doors;
    private int numbers;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("honda city"))
            this.model = model;
        else
            this.model = "unknown";
    }

    public String getModel(){
        return this.model;
    }


}
