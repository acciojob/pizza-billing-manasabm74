package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    //here creating variable  we need to look for variable have diffrent price
    //that is toppings
     private  int toppings;



    //and create variable with boolean for extra's
    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isTakeAway;
    boolean isBillCreated;







    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        //here we need to inialize it
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }

        //for bollean variable by default it is set to  be false its ok
        // we inialize it or else its ok not inlize it bcz ,by default they are false

      this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isBillCreated = false;
        this.isTakeAway = false;

        this.bill= "Base Price Of The Pizza: "+ this.price+"\n";

    }

    public int getPrice() {

        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
      if(!isExtraCheeseAdded){
          this.price += 80;
          isExtraCheeseAdded = true;
      }

    }

    public void addExtraToppings() {
        // your code goes here
        if(!isExtraToppingsAdded){
            this.price += this.toppings;
            isExtraToppingsAdded = true;
        }


    }

    public void addTakeaway() {
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;

        }

    }

    public String getBill() {
        // your code goes here
        if(!isBillCreated){
            if(isExtraCheeseAdded){
                this.bill ="Extra Cheese Added: 80"+"\n";
            }
            if(isExtraToppingsAdded){
                this.bill ="Extra Toppings Added:"+this.toppings+"\n";
            }
            if(isTakeAway){
                this.bill ="Paperbag Added: 20"+"\n";
            }
            this.bill += "Total Price:"+this.price+"\n";
            this.isBillCreated = true;
        }
        return this.bill;
    }
}

