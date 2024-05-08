package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    //we create variable
    private int toppings;

    //what we ave to take care off
    boolean isExtraCheeseAdded;
    boolean isExtrasToppingAdded;
    boolean isBillCreated;

    boolean isTakeAway;



    //once we create a variable we nned to initalize it
    //boolean by default iniatiaze maeans thay said btdefault false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;

        }
        else{
            this.price = 400;
            this.toppings = 120;

        }

        //boolean by default false,but iniatailze the is again agud practice


        //whwre we can gte exexact bill sseing baseprice
        // right other are addupso

        this.bill = "Base price of the pizza:" +this.price+ "\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        //if we write like this it add evrytime the chese so
        if(!isExtraCheeseAdded) {
            this.price += 80;
            this.isExtraCheeseAdded = true;
            //once we added we set this to true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtrasToppingAdded){
            //here insted of writing the topping pirice
            // we can directly say this,toppings
            //becasues we intilaize it in chese scction
            //this.price += 120;

            this.price += this.toppings;
            isExtrasToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added:80" + "\n";
            }
            if (isExtrasToppingAdded) {
                this.bill += "Extra Toppings Added:" + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added:20" + "\n";
            }

            this.bill += "Total Price" + this.price;
            this.isBillCreated = true;

            return this.bill;
        }
        return "";
    }
}
