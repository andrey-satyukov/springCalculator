package pro.sky.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    //    CalculatorSericeImpl calculatorSerice = new CalculatorSericeImpl();
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @RequestMapping(path = "/calculator/plus")
    public String addition(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else {
            return Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + calculatorService.addition(num1, num2);
        }
    }

    @RequestMapping(path = "/calculator/minus")
    public String minus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else {
            return Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + calculatorService.minus(num1, num2);
        }
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiply(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else {
            return Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + calculatorService.multiply(num1, num2);
        }
    }

    @RequestMapping(path = "/calculator/divide")
    public String divide(
            @RequestParam(value = "num1", required = false) Double num1,
            @RequestParam(value = "num2", required = false) Double num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else {
            return Double.toString(num1) + " / " + Double.toString(num2) + " = " + calculatorService.divide(num1, num2);
        }
    }
//      Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.
}
