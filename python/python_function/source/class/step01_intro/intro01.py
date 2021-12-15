# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

class Person:

    # class attribute
    COUNTRY = "Korea"

    # attrubute
    def __init__(self,name,age):
        self.name = name
        self.age = age

if __name__ == "__main__":
    kim = Person("Kim", 20)
    lee = Person("Lee", 25)

    print(kim.age)
    print("Kim은 {}인".format(kim.__class__.COUNTRY))
    print("Lee는 {}인".format(lee.__class__.COUNTRY))

    kim.__class__.COUNTRY = "America"
    print("Kim은 {}인".format(kim.__class__.COUNTRY))