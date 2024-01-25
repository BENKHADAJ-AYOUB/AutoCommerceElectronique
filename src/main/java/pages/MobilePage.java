package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobilePage extends PageBase {
    //Ttile page
    public String titlePage;
    public MobilePage(WebDriver driver) {
        super(driver);
        titlePage = driver.getTitle();
    }
    //Web Elements

    // localiser liste déroulante
    @FindBy(xpath = "(//select[@title=\"Sort By\"])[1]")
    WebElement listElement;

    //localiser les element de la liste déroulant par leur nom
    @FindBy(css = "h2.product-name > a")
    List<WebElement> productElements;

    public boolean isSortedByName()
    {
        //Choise name on listElement
        select = new Select(listElement);
        select.selectByVisibleText("Name");
        //récuperer les noms de la liste
        //ArrayList ou je vais mettre mes noms
        List<String> listesNames = new ArrayList<>();
        for (WebElement element : productElements) {
            //ajouter les nomsà la liste //trim() est une méthode de la classe String qui supprime tous les espaces blancs
            listesNames.add(element.getText().trim());
        }
        //List à trier et comparer en mettant dedans les elemeent de listNames
        List<String> sorteddList = new ArrayList<>(listesNames);
        //list à trier
        Collections.sort(sorteddList);
        //comparer
        return listesNames.equals(sorteddList);
    }
}
