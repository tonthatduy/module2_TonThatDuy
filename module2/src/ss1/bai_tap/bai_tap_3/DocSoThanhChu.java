package ss1.bai_tap.bai_tap_3;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (0-999): ");
        int number = Integer.parseInt(sc.nextLine());

        String result = "";
        if (number < 0 || number > 999) {
            result = "Nhập lại trong khoảng (0-999)";
        } else if (number <= 10) {
            switch (number) {
                case 0:
                    result = "Zero";
                    break;
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
                    break;
                case 10:
                    result = "Ten";
                    break;
            }
        } else if (number <= 19) {
            switch (number) {
                case 11:
                    result = "Eleven";
                    break;
                case 12:
                    result = "Twelve";
                    break;
                case 13:
                    result = "Thirteen";
                    break;
                case 14:
                    result = "Fourteen";
                    break;
                case 15:
                    result = "Fifteen";
                    break;
                case 16:
                    result = "Sixteen";
                    break;
                case 17:
                    result = "Seventeen";
                    break;
                case 18:
                    result = "Eighteen";
                    break;
                case 19:
                    result = "Nineteen";
                    break;
            }
        } else if (number <= 99) {
            int tens = number / 10;
            int units = number % 10;

            switch (tens) {
                case 2:
                    result = "Twenty";
                    break;
                case 3:
                    result = "Thirty";
                    break;
                case 4:
                    result = "Forty";
                    break;
                case 5:
                    result = "Fifty";
                    break;
                case 6:
                    result = "Sixty";
                    break;
                case 7:
                    result = "Seventy";
                    break;
                case 8:
                    result = "Eighty";
                    break;
                case 9:
                    result = "Ninety";
                    break;
            }

            if (units != 0) {
                result += " ";
                switch (units) {
                    case 1:
                        result += "One";
                        break;
                    case 2:
                        result += "Two";
                        break;
                    case 3:
                        result += "Three";
                        break;
                    case 4:
                        result += "Four";
                        break;
                    case 5:
                        result += "Five";
                        break;
                    case 6:
                        result += "Six";
                        break;
                    case 7:
                        result += "Seven";
                        break;
                    case 8:
                        result += "Eight";
                        break;
                    case 9:
                        result += "Nine";
                        break;
                }
            }
        } else if (number <= 999) {
            int hundreds = number / 100;
            int remainder = number % 100;
            int tens = remainder / 10;
            int units = remainder % 10;

            switch (hundreds) {
                case 1:
                    result = "One hundred";
                    break;
                case 2:
                    result = "Two hundred";
                    break;
                case 3:
                    result = "Three hundred";
                    break;
                case 4:
                    result = "Four hundred";
                    break;
                case 5:
                    result = "Five hundred";
                    break;
                case 6:
                    result = "Six hundred";
                    break;
                case 7:
                    result = "Seven hundred";
                    break;
                case 8:
                    result = "Eight hundred";
                    break;
                case 9:
                    result = "Nine hundred";
                    break;
            }

            if (remainder != 0) {
                result += " and";

                if (remainder <= 10) {
                    switch (remainder) {
                        case 1:
                            result += " One";
                            break;
                        case 2:
                            result += " Two";
                            break;
                        case 3:
                            result += " Three";
                            break;
                        case 4:
                            result += " Four";
                            break;
                        case 5:
                            result += " Five";
                            break;
                        case 6:
                            result += " Six";
                            break;
                        case 7:
                            result += " Seven";
                            break;
                        case 8:
                            result += " Eight";
                            break;
                        case 9:
                            result += " Nine";
                            break;
                        case 10:
                            result += " Ten";
                            break;
                    }
                } else if (remainder <= 19) {
                    switch (remainder) {
                        case 11:
                            result += " Eleven";
                            break;
                        case 12:
                            result += " Twelve";
                            break;
                        case 13:
                            result += " Thirteen";
                            break;
                        case 14:
                            result += " Fourteen";
                            break;
                        case 15:
                            result += " Fifteen";
                            break;
                        case 16:
                            result += " Sixteen";
                            break;
                        case 17:
                            result += " Seventeen";
                            break;
                        case 18:
                            result += " Eighteen";
                            break;
                        case 19:
                            result += " Nineteen";
                            break;
                    }
                } else {
                    switch (tens) {
                        case 2:
                            result += " Twenty";
                            break;
                        case 3:
                            result += " Thirty";
                            break;
                        case 4:
                            result += " Forty";
                            break;
                        case 5:
                            result += " Fifty";
                            break;
                        case 6:
                            result += " Sixty";
                            break;
                        case 7:
                            result += " Seventy";
                            break;
                        case 8:
                            result += " Eighty";
                            break;
                        case 9:
                            result += " Ninety";
                            break;
                    }

                    if (units != 0) {
                        switch (units) {
                            case 1:
                                result += " One";
                                break;
                            case 2:
                                result += " Two";
                                break;
                            case 3:
                                result += " Three";
                                break;
                            case 4:
                                result += " Four";
                                break;
                            case 5:
                                result += " Five";
                                break;
                            case 6:
                                result += " Six";
                                break;
                            case 7:
                                result += " Seven";
                                break;
                            case 8:
                                result += " Eight";
                                break;
                            case 9:
                                result += " Nine";
                                break;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}





