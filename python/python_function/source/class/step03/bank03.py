# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- conding: utf-8 -*-

class Bank:

    def __init__(self, cust_id, name, balance = 0):
        self.cust_id, self.name, self.balance = cust_id, name, balance

    def __str__(self):
        cust_str = """
        Customer:
            cust_id : {cust_id}
            name : {name}
            balance : {balance}
        """.format(cust_id = self.cust_id, name = self.name, balance = self.balance)

        return cust_str

if __name__ == "__main__":
    bank_cust = Bank(123, "Evan")
    print(bank_cust)