# /e/Fear/Univ/Big_data/Training/python/python-crawling/venv/Scripts/python
# -*- encoding: utf-8 -*-

from bs4 import BeautifulSoup
from selenium import webdriver

def main():
    url = "https://www.g2g.com/offer/-PC--Standard---Exalted-Orb?service_id=lgc_service_1&brand_id=lgc_game_19398&fa=lgc_19398_tier%3Algc_19398_tier_42693%7Clgc_19398_server%3Algc_19398_server_24104"
    driver = webdriver.Firefox(executable_path="E:\\Fear\\Univ\\Big_data\\Training\\python\\python-crawling\\geckodriver.exe")
    driver.get(url)
    html = driver.page_source
    soup = BeautifulSoup(html)
    #print(soup)
    #print("=========================")

    print("Seller Name: "+soup.find("a", class_ = "seller__name").get_text())
    seller =  soup.find("a", class_ = "seller__name").get_text()

    region_left_tolist = soup.select("div.region_left-detail")
    #print(region_left_tolist, ":", type(region_left_tolist))

    data_col_name = []
    for list in region_left_tolist:
        print('list = ', list.string)
        data_col_name.append(list.string)

    print()

    region_right_tolist = soup.select("div.region_right-detail")
    #print(region_right_tolist, ":", type(region_right_tolist))

    data_col = []
    for list in region_right_tolist:
        print('list = ', list.string)
        data_col.append(list.string)

    #def soup_find(tag, ID = None, Class = None):
    #    if ID is not None:
    #        SF = soup.find(tag, id = ID)
    #    elif Class is not None:
    #        SF = soup.find(tag, class_ = Class)
    #    return SF

    print("Price: "+soup.find("span", id = "precheckout_ppu_amount").get_text())
    price = soup.find("span", id = "precheckout_ppu_amount").get_text()
    print("Stock: "+soup.find("span", id = "precheckout_offer_stock").get_text())
    stock = soup.find("span", id = "precheckout_offer_stock").get_text()


    #print(soup.find("div", class_="region_left-detail").get_text())
    #print(soup.find("div", class_="region_left-detail").get_text())
    #print(soup.find("div", class_="region_right-detail").get_text())
    #print(soup.find_all("div", class_="region_left-detail"))
    #print(soup.find_all("div", class_="region_right-detail"))

    data = [seller,data_col[0],data_col[1],price,stock]
    print(data)
    table = []
    table.append(data)
    print(table)
    col_name = ["seller",data_col_name[1],data_col_name[2],"price","stock"]

    db_main(col_name, data)


import pandas as pd
from psycopg2 import connect, extensions
import psycopg2.extras as extras
import psycopg2


def db_main(col_name, data):
    #conn = connecting0()
    #print(conn)

    dbname = "G2GtestDB"

    conn = connecting(dbname)
    tablename = "poe"


def connecting(dbname):
    # DB Connect
    conn = connect(
        host="localhost",  # SQL 서버 주소
        dbname = dbname,
        user="postgres",
        password="1210",
        port="5432"
    )

    # print(conn)
    return conn



if __name__ == "__main__":
    main()

