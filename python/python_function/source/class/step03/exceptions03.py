class SalaryExcept(ValueError): pass # 상속
class TipExcept(SalaryExcept): pass # 상속

class Employee:

    # class attribute
    MIN_SALARY = 20000
    MAX_BONUS = 10000

    # instance sttribute
    def __init__(self,name,salary=30000):
        self.name = name
        if salary < Employee.MIN_SALARY:
            raise SalaryExcept("급여가 나무 낮아요")
        self.salary = salary

    # instance method
    def give_bonus(self,amount):
        if amount > Employee.MAX_BONUS:
            print("보너스가 너무 많아요")
        elif self.salary + amount < Employee.MIN_SALARY:
            print("보너스 지급 후의 급여도 매우 낮아요")
        else:
            self.salary += amount

if __name__ == "__main__":
    emp = Employee("Evan", salary=50000)
    try:
        emp.give_bonus(70000)
    except SalaryExcept:
        print("Salary 오류 감지")
    try:
        emp.give_bonus(-100000)
    except TipExcept:
        print("Tip 오류 감지")