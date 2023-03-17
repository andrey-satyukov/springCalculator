package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorSericeImpl implements CalculatorService{

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else {
            return Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(num1 + num2);
        }
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else {
            return Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + Integer.toString(num1 - num2);
        }
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else {
            return Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + Integer.toString(num1 * num2);
        }
    }

    public String divide(Double num1, Double num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else if (num2 == 0) {
            return "На ноль делить нельзя";
        } else {
            return Double.toString(num1) + " / " + Double.toString(num2) + " = " + Double.toString(num1 / num2);
        }
    }
}