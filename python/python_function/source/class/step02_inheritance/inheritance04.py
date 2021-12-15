# E:\Fear\Univ\Big_data\Training\python\python_function\venv/Scripts/python
# -*- coding: utf-8 -*-

"""
- 클래스 매서드 사용
- 정적 메서드 사용
- 날짜 입력 예제
- "2021-12-13"
"""

from datetime import datetime

class BetterDate:

    def __init__(self,year,month,day):
        self.year = year
        self.month = month
        self.day = day

    @classmethod
    def from_str(cls,date_str):
        parts = date_str.split("-")  # 2021-12-17
        year,month,day = int(parts[0]),int(parts[1]),int(parts[2])
        return cls(year,month,day)

    @staticmethod
    def from_str2(date_str):
        parts = date_str.split("-")  # 2021-12-17
        BetterDate.year,BetterDate.month,BetterDate.day = int(parts[0]),int(parts[1]),int(parts[2])
        return BetterDate.year,BetterDate.month,BetterDate.day

    @classmethod
    def from_datetime(cls, dateobj):
        year, month, day = dateobj.year, dateobj.month, dateobj.day
        return cls(year,month,day)


if __name__ == "__main__":
    bd_str = BetterDate.from_str("2021-12-13")
    print("-----Date String-----")
    print("Year:",bd_str.year)
    print("Month:",bd_str.month)
    print("Day:",bd_str.day)

    bd_str2 = BetterDate.from_str2("2021-12-13")
    print("-----Date String-----")
    print("Year:",bd_str2[0])
    print("Month:",bd_str2[1])
    print("Day:",bd_str2[2])

    today = datetime.today()
    print("Today",today)
    print("Type", type(today))
    bd_str3 = BetterDate.from_datetime(today)
    print("-----Date Datetime-----")
    print("Year:",bd_str3.year)
    print("Month:",bd_str3.month)
    print("Day:",bd_str3.day)