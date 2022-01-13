from bs4 import BeautifulSoup
from selenium import webdriver

def main():
    url = "https://www.g2g.com/categories/new-world-coins"
    #url = "https://www.g2g.com/categories/path-of-exile-global-currency?fa=lgc_19398_tier%3Algc_19398_tier_42693,lgc_19398_tier_42698"
    driver = webdriver.Firefox(executable_path="E:\\Fear\\Univ\\Big_data\\Training\\python\\python-crawling\\geckodriver.exe")
    driver.get(url)
    html = driver.page_source
    soup = BeautifulSoup(html)

    a_list = soup.find_all("a", class_="full-height column rounded-borders cursor-pointer g-card-no-deco g-card-hover g-border-light")
    #print(a_list)
    href_list = []
    for href in a_list:
        #print(href)
        #print(href.get("href"))
        href_list.append(href.get("href"))

    print(href_list)


if __name__ == "__main__":
    main()