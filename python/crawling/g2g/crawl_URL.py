# /e/Fear/Univ/Big_data/Training/python/python-crawling/venv/Scripts/python
# -*- encoding: utf-8 -*-

from bs4 import BeautifulSoup
from selenium import webdriver
import time

driver = webdriver.Firefox(executable_path="E:\\Fear\\Univ\\Big_data\\Training\\python\\python-crawling\\geckodriver.exe")

def get_page_list():
    #url = "https://www.g2g.com/categories/new-world-coins"
    url = "https://www.g2g.com/categories/path-of-exile-global-currency?fa=lgc_19398_tier%3Algc_19398_tier_42693,lgc_19398_tier_42698"

    soup = get_soup_time(url)

    a_list = soup.find_all("a", class_="full-height column rounded-borders cursor-pointer g-card-no-deco g-card-hover g-border-light")

    href_list = []
    for a in a_list:
        href_list.append(a.get("href"))


    i = 1
    if bool(soup.find("div", class_="row justify-center q-mt-xl q-mb-lg")):
        while True:
            print("page"+str(i))
            i += 1
            url_page = url+"?page="+str(i)
            soup = get_soup_time(url_page)
            if soup.find("a", class_="full-height column rounded-borders cursor-pointer g-card-no-deco g-card-hover g-border-light") is None:
                print("exit")
                break

            a_list = soup.find_all("a", class_="full-height column rounded-borders cursor-pointer g-card-no-deco g-card-hover g-border-light")

            for href in a_list:
                href_list.append(href.get("href"))

    else:
        print("URL has single page")

    print(href_list)
    return href_list

def get_data(page):
    soup = get_soup(page)

    seller =  soup.find("a", class_ = "seller__name").get_text()

    region_right_tolist = soup.select("div.region_right-detail")
    data_col = []
    for list in region_right_tolist:
        data_col.append(list.string)

    price = soup.find("span", id = "precheckout_ppu_amount").get_text()
    stock = soup.find("span", id = "precheckout_offer_stock").get_text()

    data = [seller,data_col[0],data_col[1],price,stock]

    return data


def get_soup_time(URL):
    driver.get(URL)
    time.sleep(7)
    html = driver.page_source
    soup = BeautifulSoup(html)

    return soup

def get_soup(URL):
    driver.get(URL)
    time.sleep(1)
    html = driver.page_source
    soup = BeautifulSoup(html)

    return soup


if __name__ == "__main__":
    page_list = get_page_list()
    for page in page_list:
        print(get_data(page))
    driver.close()