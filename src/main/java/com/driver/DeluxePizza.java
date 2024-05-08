package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        //we call constructor of parent--super keyword is used
        // your code goes here
        //delux pizza means pizza + extra cheese and
        // topins so we nnedto call those funstions
        addExtraCheese();
        addExtraToppings();
    }
}
