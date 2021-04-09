# PizzaShop

## 1.Statement of the Work
Pizza Shop is a café that sells Pizza and drinks. When customers arrive at this cafe, they design the Pizza they want according to the kinds of Pizza, their ingredients and their prices. In addition, customers can order hot or cold beverages from the menu. The waitress delivers these orders to the cook from the customer. The cook is responsible for making the Pizza and preparing the drink according to the order.

## 2.Proposed Pattern
Many design patterrns are applied for solving existing problems in the project. These design patterns are Command Pattern, Simple Factory Pattern, Template Method Pattern and Decorator Pattern.

Firstly, customers create a Pizza(Pizza Order) or beverage (Beverage Order) order and the waitress (Invoker) delivers these orders to the cook (Receiver). The cook works with Pizza Factory for Pizza and with Beverage Factory for beverage. To do this, the cook uses makePizza() and makeBeverage() methods (Simple Factory Pattern).

Pizza Factory create waffle and to do this create Pizza interface.The customers had chosen Pizza ingredients according to the Pizza they had previously wanted. The Pizza is decorated according to these pizza topings (Decorator Pattern). There are 3 Decorator classes for Pizza topings such as veg Decorator, non-veg Decorator and cheese Decorator. Cost of the Pizza is calculated according to toping ingredients. 

Finally, Beverage Factory is responsible for hot and cold beverages creation and creates Beverage interface. Hot Beverage and Cold Beverage classes implement this interface. Subclasses such as tea, coffee, cola etc. extend these classes. The distinction between them is the difference in the preparation of hot and cold beverages (Template Method Pattern). Also, there are some differences in subclasses. Finally, hook() is used for each beverage and the customer is asked if some extra condiments are wanted. 




