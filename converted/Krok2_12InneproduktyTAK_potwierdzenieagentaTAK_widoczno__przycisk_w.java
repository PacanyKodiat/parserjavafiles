@Test
  public void krok2_12_InneProduktyTAKPotwierdzenieAgentaTAKWidocznoscPrzyciskow() throws Exception {
    System.out.println("Start - krok2_12_InneProduktyTAKPotwierdzenieAgentaTAKWidocznoscPrzyciskow");

    driver.findElement(By.id("price[max]")).clear();
    driver.findElement(By.id("price[max]")).sendKeys("200");


    // ERROR: Caught exception [ERROR: Unsupported command [dragAndDrop | css=img.right-slider | 75,0]]
    // ERROR: Caught exception [ERROR: Unsupported command [focus | document.forms['search-form'].text | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [fireEvent | document.forms['search-form'].text | blur]]
    // ERROR: Caught exception [ERROR: Unsupported command [getSelectedId | css=a[name="drop_link"] | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getSelectedLabel | css=a[name="drop_link"] | ]]
    System.out.println("End - krok2_12_InneProduktyTAKPotwierdzenieAgentaTAKWidocznoscPrzyciskow");
}