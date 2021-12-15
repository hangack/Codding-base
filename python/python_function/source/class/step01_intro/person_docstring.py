# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

class Person:
    """
    사람을 표현하는 클래스

    Attributes
    ==========
    name: str
        임의의 사용자 이름
    age: int
        임의의 사용자 나이

    Methods
    ==========
    info(additional="")
        임의의 사용자 이름과 나이를 추가적으로 입력된 정보(additional)와 함께 출력
    """

    def __init__(self, name, age):
        """
        Constructs / 새롭게 만들 임의의 사용자 객체(object) 구성요소(name, age)를 구성한다.

        Parameters
        ==========
            name: str
                임의의 사용자 이름
            age: int
                임의의 사용자 나이
        """
        self.name = name
        self.age = age

    def info(self, additional=None):
        """
        임의의 사용자의 이름과 나이를 출력하는 함수
        만약, additional 정보가 전달이 되면; 이름과 나이를 함께 출력

        Parameters
        ==========
        additional: str, optional
            추가적으로 입력되면 같이 출력됨 (default is None)

        Returns
        ==========
        None
        """
        print(f"name: {self.name}\nage: {self.age}\n"+additional)

# class: int        | str   | DataFrame         | function
# object: 1, 2, 3   | ""    | pd.DataFrame()    | np.sum, np.sd()

if __name__ == "__main__":
    ty = Person("Kim", age = 26)
    ty.info("나의 직장은?")
    print(Person.__doc__)
    help(Person)