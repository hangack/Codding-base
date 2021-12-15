# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# Data Encapsulation (캡슐화)
class TV:

    def __init__(self):
        self.__maxprice = 500 # private variable = local variable
#        self.name = name # instance attribute

    # instance method
    def sell(self):
        print("판매가격: {}".format(self.__maxprice))

    def setMaxPrice(self, price):
        self.__maxprice = price

if __name__ == "__main__":
    tv = TV()
    tv.sell()

    tv.__maxprice = 1000
    tv.sell()

    tv.setMaxPrice(300)
    tv.sell()