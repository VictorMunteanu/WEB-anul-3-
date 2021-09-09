package cafea;

import java.util.*;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal){
        Scanner payScan = new Scanner(System.in);
        banknoteNominal = payScan.nextInt();
        if(banknoteNominal == 5 || banknoteNominal == 10){
            return true;
        }
        return false;
    }

    private String choose(Integer optionCh){
        Scanner chooseScan = new Scanner(System.in);
        optionCh = chooseScan.nextInt();
        if(optionCh == 1){
            return "Latte";
        } else if(optionCh == 2){
            return "Cappuccino";
        }
        return "Incorrect option";
    }

    private String sugar(String optionSu){
        Scanner sugarScan = new Scanner(System.in);
        optionSu = sugarScan.nextLine();
        if(optionSu == "y"){
            return "With sugar";
        } else if(optionSu == "n"){
            return "No sugar";
        }
        return "Incorrect option";
    }

    private void showInfo(String message){
        System.out.println(message);
    }

    private String done(String coffeeType){
        return coffeeType;
    }

    public void prepare(){
        String coffeeType = "";
        this.showInfo("Please insert banknote");
        if(this.pay(5)){
            this.showInfo("Please chose coffee type");
            this.showInfo(
                    "You choosed: " + coffeeType
            );
            this.showInfo("Please chose sugar option");
            this.showInfo(
                    "You choosed: " + coffeeType
            );
            this.showInfo("Preparing...");
            this.showInfo(
                    "Done: " + this.done(coffeeType)
            );
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}