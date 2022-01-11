# /e/Fear/Univ/Big_data/Training/python/python-crawling/venv/Scripts/python
# -*- encoding: utf-8 -*-

from bs4 import BeautifulSoup

def main():
    # 객체 초기화
    soup = BeautifulSoup(open("../data/index.html"), "html.parser")
    print(soup)

if __name__ == "__main__":
    main()

