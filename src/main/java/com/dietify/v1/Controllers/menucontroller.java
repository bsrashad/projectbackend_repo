package com.dietify.v1.Controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dietify.v1.DTO.Week.WeekResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class menucontroller {
    @PostMapping("/menu")
    public String getMenu(Model model) {
        String jsonString = "{\"week\":{\"monday\":{\"meals\":[{\"id\":664280,\"imageType\":\"jpg\",\"title\":\"Vanilla Bean Cherry Granola Bars\",\"readyInMinutes\":45,\"servings\":8,\"sourceUrl\":\"https://spoonacular.com/vanilla-bean-cherry-granola-bars-664280\"},{\"id\":642585,\"imageType\":\"jpg\",\"title\":\"Farfalle with fresh tomatoes, basil and mozzarella\",\"readyInMinutes\":15,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/farfalle-with-fresh-tomatoes-basil-and-mozzarella-642585\"},{\"id\":643786,\"imageType\":\"jpg\",\"title\":\"Fried Rice - Chinese comfort food\",\"readyInMinutes\":45,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/fried-rice-chinese-comfort-food-643786\"}],\"nutrients\":{\"calories\":1897.12,\"protein\":55.4,\"fat\":65.78,\"carbohydrates\":273.45}},\"tuesday\":{\"meals\":[{\"id\":650485,\"imageType\":\"jpg\",\"title\":\"Luscious Orange Cardamom Smoothie\",\"readyInMinutes\":45,\"servings\":2,\"sourceUrl\":\"https://spoonacular.com/luscious-orange-cardamom-smoothie-650485\"},{\"id\":667701,\"imageType\":\"jpg\",\"title\":\"salmon fried rice\",\"readyInMinutes\":25,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/salmon-fried-rice-667701\"},{\"id\":649718,\"imageType\":\"jpg\",\"title\":\"Lemon Pasta Alfredo (Vegan)\",\"readyInMinutes\":45,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/lemon-pasta-alfredo-vegan-649718\"}],\"nutrients\":{\"calories\":1933.77,\"protein\":58.18,\"fat\":65.12,\"carbohydrates\":278.17}},\"wednesday\":{\"meals\":[{\"id\":655212,\"imageType\":\"jpg\",\"title\":\"Peanut Butter and Apple Oatmeal Breakfast Bars\",\"readyInMinutes\":45,\"servings\":8,\"sourceUrl\":\"https://spoonacular.com/peanut-butter-and-apple-oatmeal-breakfast-bars-655212\"},{\"id\":1697625,\"imageType\":\"jpg\",\"title\":\"Light and Tasty Tomato Basil Mozzarella Pasta for a Hot Summer Evening\",\"readyInMinutes\":25,\"servings\":2,\"sourceUrl\":\"https://spoonacular.com/light-and-tasty-tomato-basil-mozzarella-pasta-for-a-hot-summer-evening-1697625\"},{\"id\":639535,\"imageType\":\"jpg\",\"title\":\"Citrusy Pecan Garbanzo Couscous: A Salad For Cold Weather\",\"readyInMinutes\":45,\"servings\":2,\"sourceUrl\":\"https://spoonacular.com/citrusy-pecan-garbanzo-couscous-a-salad-for-cold-weather-639535\"}],\"nutrients\":{\"calories\":1892.62,\"protein\":54.75,\"fat\":69.56,\"carbohydrates\":268.29}},\"thursday\":{\"meals\":[{\"id\":782598,\"imageType\":\"jpg\",\"title\":\"Toasted Coconut Pancakes with Toasted Coconut Sauce\",\"readyInMinutes\":45,\"servings\":9,\"sourceUrl\":\"https://spoonacular.com/toasted-coconut-pancakes-with-toasted-coconut-sauce-782598\"},{\"id\":664565,\"imageType\":\"jpg\",\"title\":\"Vegetable Minestrone Soup\",\"readyInMinutes\":30,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/vegetable-minestrone-soup-664565\"},{\"id\":634404,\"imageType\":\"jpg\",\"title\":\"Basic Risotto\",\"readyInMinutes\":45,\"servings\":2,\"sourceUrl\":\"https://spoonacular.com/basic-risotto-634404\"}],\"nutrients\":{\"calories\":1977.66,\"protein\":53.17,\"fat\":66.82,\"carbohydrates\":296.82}},\"friday\":{\"meals\":[{\"id\":665257,\"imageType\":\"jpg\",\"title\":\"Whole Grain Pumpkin Bread\",\"readyInMinutes\":45,\"servings\":24,\"sourceUrl\":\"https://spoonacular.com/whole-grain-pumpkin-bread-665257\"},{\"id\":606953,\"imageType\":\"jpg\",\"title\":\"Cajun Chicken Pasta\",\"readyInMinutes\":30,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/cajun-chicken-pasta-606953\"},{\"id\":634404,\"imageType\":\"jpg\",\"title\":\"Basic Risotto\",\"readyInMinutes\":45,\"servings\":2,\"sourceUrl\":\"https://spoonacular.com/basic-risotto-634404\"}],\"nutrients\":{\"calories\":1863.8,\"protein\":51.96,\"fat\":71.58,\"carbohydrates\":254.58}},\"saturday\":{\"meals\":[{\"id\":634206,\"imageType\":\"jpg\",\"title\":\"Banana Zucchini Muffins\",\"readyInMinutes\":45,\"servings\":8,\"sourceUrl\":\"https://spoonacular.com/banana-zucchini-muffins-634206\"},{\"id\":982371,\"imageType\":\"jpg\",\"title\":\"Instant Pot Quinoa Grain Bowl\",\"readyInMinutes\":13,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/instant-pot-quinoa-grain-bowl-982371\"},{\"id\":634404,\"imageType\":\"jpg\",\"title\":\"Basic Risotto\",\"readyInMinutes\":45,\"servings\":2,\"sourceUrl\":\"https://spoonacular.com/basic-risotto-634404\"}],\"nutrients\":{\"calories\":1895.19,\"protein\":48.23,\"fat\":62.34,\"carbohydrates\":285.95}},\"sunday\":{\"meals\":[{\"id\":640337,\"imageType\":\"jpg\",\"title\":\"Cracked Wheat Cereal\",\"readyInMinutes\":45,\"servings\":8,\"sourceUrl\":\"https://spoonacular.com/cracked-wheat-cereal-640337\"},{\"id\":667701,\"imageType\":\"jpg\",\"title\":\"salmon fried rice\",\"readyInMinutes\":25,\"servings\":4,\"sourceUrl\":\"https://spoonacular.com/salmon-fried-rice-667701\"},{\"id\":642121,\"imageType\":\"jpg\",\"title\":\"Easy Tabouleh\",\"readyInMinutes\":45,\"servings\":1,\"sourceUrl\":\"https://spoonacular.com/easy-tabouleh-642121\"}],\"nutrients\":{\"calories\":1842.97,\"protein\":54.57,\"fat\":59.17,\"carbohydrates\":282.77}}}}"; // JSON string containing the menu data
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            WeekResponse weekresponse = objectMapper.readValue(jsonString, WeekResponse.class);
            model.addAttribute("weekresponse", weekresponse);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle parsing exception
        }
 
        return "menu";
    }
}