# /e/Fear/Univ/Big_data/Training/python/python-crawling/venv/Scripts/python
# -*- encoding: utf-8 -*-

from bs4 import BeautifulSoup


def main():
    # 객체 초기화
    soup = BeautifulSoup(open("../data/index3.html"), "html.parser")

    # 원하는 데이터 출력 -> 함수
    print(soup.find("div", id = "main").find("p"))


if __name__ == "__main__":
    main()


