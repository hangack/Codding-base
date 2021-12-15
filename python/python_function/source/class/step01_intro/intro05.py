# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

# 다행성
# 서로 다른 클래스가 존재, 같은 함수(외부) 사용
# 사각형 클래스, 삼각형 클래스, colar 함수

class Person:
    def speak(self):
        print("이 분은 한국말을 못합니다")

class Korean:
    def speak(self):
        print("이 분은 한국말을 할 줄 압니다")

# common instance
def speaking_test(human):
    """다형성 테스트
    :param human:
    :return:
    """
    human.speak()

if __name__ == "__main__":
    person = Person()
    kim = Korean()

    # speaking test에 전달
    speaking_test(person)
    speaking_test(kim)