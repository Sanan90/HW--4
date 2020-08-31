package kalkulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    public TextArea text;
    public int number;
    public int second;
    public char point;
    public String equal = "=";
    public String plus = "+";
    public String multi = "*";
    public String minus = "-";
    public String dev = "/";
    public int displayValue = 0;
    public int currentNumber = 0;
    public String display;

    public void onClick(ActionEvent actionEvent) {

        //text.clear();
        String lineText = ((Button)actionEvent.getSource()).getText();

        if(!"".equals(lineText)){
            displayValue = Integer.parseInt(lineText);
            //System.out.println(lineText);
            //System.out.println(sign);
            text.appendText(""+displayValue);
            display = text.getText();

            System.out.println(display);
        }








    }


    public void onClickAction(ActionEvent actionEvent) {

        String sign = ((Button)actionEvent.getSource()).getText();


        if(sign.equals(plus)){
            point = '+';
            currentNumber = Integer.parseInt(display);
            //System.out.println(currentNumber);
            //System.out.println(displayValue);
            text.clear();
        }

        if(sign.equals(minus)){
            point = '-';
            currentNumber = Integer.parseInt(display);
            text.clear();

        }

        if(sign.equals(multi)){
            point = '*';
            currentNumber = Integer.parseInt(display);
            text.clear();

        }
        if(sign.equals(dev)){
            point = '/';
            currentNumber = Integer.parseInt(display);
            text.clear();

        }

        if(sign.equals(equal)){

            if(point == '+'){
                currentNumber+=Integer.parseInt(display);

                System.out.println(currentNumber);
                text.clear();
                text.appendText(""+currentNumber);
            }

            if(point == '-'){
                currentNumber-=Integer.parseInt(display);

                System.out.println(currentNumber);
                text.clear();
                text.appendText(""+currentNumber);
            }

            if(point == '*'){
                currentNumber*=Integer.parseInt(display);

                System.out.println(currentNumber);
                text.clear();
                text.appendText(""+currentNumber);
            }

            if(point == '/'){

                try {
                    int ds = Integer.parseInt(display);

                    if(ds == 0){
                        text.clear();
                        text.appendText("На нуль делить нельзя!");
                    }
                    currentNumber/=ds;

                    System.out.println(currentNumber);
                    text.clear();
                    text.appendText(""+currentNumber);

                }
                catch (ArithmeticException e){
                    //e.printStackTrace();
                }

            }


        }


    }

    public void clear(ActionEvent actionEvent) {
        text.clear();
    }
}
