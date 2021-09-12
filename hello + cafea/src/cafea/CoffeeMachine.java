package cafea;

import java.util.*;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal){
        Scanner scanner = new Scanner(System.in);
        banknoteNominal = scanner.nextInt();
        if(banknoteNominal == 5 || banknoteNominal == 10){
            return true;
        }
        return false;
    }

    private String choose(Integer option){
        Scanner scanner1 = new Scanner(System.in);
        option = scanner1.nextInt();
        if(option == 1){
            return "Latte";
        } else if(option == 2){
            return "Cappuccino";
        } else if(option == 3){
            return "Americano";
        } else if(option == 4){
            return "Mocha";
        }
        return "Incorrect option";
    }

    private String sugarCh(Integer optionSu){
        Scanner sugar = new Scanner(System.in);
        optionSu = sugar.nextInt();
        if(optionSu == 1){
            return "with sugar";
        } else if(optionSu == 2){
            return "without sugar";
        }
        return "Incorrect option";
    }

    private String milkCh(Integer optionMi){
        Scanner scanner3 = new Scanner(System.in);
        optionMi = scanner3.nextInt();
        if(optionMi == 1){
            return "with milk";
        } else if(optionMi == 2){
            return "without milk";
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
        String sugar = "";
        String milk = "";
        this.showInfo("Please insert banknote");
        if(this.pay(5)){
            this.showInfo("What kind of coffee you like?");
            this.showInfo("1.Latte; 2.Cappuccino; 3.Americano; 4.Mocha");
            coffeeType = this.choose(1);

            this.showInfo(coffeeType + " with sugar or not?");
            this.showInfo("1.with sugar; 2.no sugar");
            sugar = this.sugarCh(1);

            this.showInfo(coffeeType + " with milk or not?");
            this.showInfo("1.with milk; 2.no milk");
            milk = this.milkCh(1);

            this.showInfo("Preparing... Please wait.");
            this.showInfo("Ready: " + this.done(coffeeType + " " + sugar + " & " + milk));
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}