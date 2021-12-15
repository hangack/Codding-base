# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

class Person:

    # class attribute
    COUNTRY = "Korea"

    # attrubute
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def Platform(self, platform):
        return f"name: {self.name}\nage: {self.age}"+"\nplatform: {}".format(platform)

    # instance method
    def Game(self, game=None):
        return f"name: {self.name}\nage: {self.age}"+"\ngame: {}".format(game)



if __name__ == "__main__":
    kim = Person("kim", 26)

    # action 02
    print(kim.Platform("Steam"))

    # action 01
    print(kim.Game("FTL"))