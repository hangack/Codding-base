# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- conding: utf-8 -*-

class Bank:

    def __init__(self, cust_id, balance=0):
        self.balance, self.cust_id = balance, cust_id

    def withdraw(self, amount):
        self.amount = amount

    def __eq__(self, other):
        print("__eq__ is called")
        return self.cust_id == other.cust_id and (type(self) == type(other))


class Phone:

    def __init__(self, cust_id):
        self.cust_id = cust_id

    def __eq__(self, other):
        return self.cust_id == other.cust_id


if __name__ == "__main__":
    account01 = Bank(1234)
    phone01 = Phone(1234)

    print(account01 == phone01)