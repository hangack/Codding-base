# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# 상속

class Person:

    # Class attributes

    # instance attributs <-> state
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def whoAmI(self):
        print("나는 Person 클래스에 있다.")

    # instance method
    def singing(self,song):
        return "{} {}을 노래".format(self.name, song)
    def dancing(self):
        return "{} 춤 춘다".format(self.name)

class Korean(Person):

    def __init__(self, name, age):
        # call super function
        super().__init__(name,age)
        print("Koean 클래스 준비 끝")

    def whoAmI(self):
        print("나는 한국인")

    def study(self):
        print("나는 공부중")



if __name__ == "__main__":
    parent_kim = Person("Kim",50)
    child_kim = Korean("Kim",15)

    print(parent_kim.dancing())
    parent_kim.whoAmI()
    print(child_kim.dancing())
    child_kim.whoAmI()