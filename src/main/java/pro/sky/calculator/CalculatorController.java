package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    CalculatorSerice calculatorSerice = new CalculatorSerice();
@GetMapping(path = "/calculator")
public String hello() {
    return calculatorSerice.hello();
}
@GetMapping(path = "/calculator/plus")
    public String addition(@RequestParam("num1"), @RequestParam {
        return calculatorSerice.addition(num1, num2);
    }
//    Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.
}
