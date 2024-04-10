package support;

import com.github.javafaker.Faker;

public class DataFaker {

    private static final Faker faker = new Faker();

    public static String gerarRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String gerarRandomFirstName() {
        return faker.name().firstName();
    }

    public static String gerarRandomLastName() {
        return faker.name().lastName();

    }

    public static String gerarRandomPassword() {
        return faker.internet().password(5, 5, false, false);
    }

    public static String gerarRandomDia() {
        int diaAleatorio = faker.number().numberBetween(1, 32);
        return String.valueOf(diaAleatorio);

    }

    public static String gerarRandomMonths() {
        int mesAleatorio = faker.number().numberBetween(1, 12);
        return String.valueOf(mesAleatorio);

    }

    public static String gerarRandomAno() {
        // Definir o intervalo de anos desejado (por exemplo, de 1900 a 2022)
        int anoInicial = 1900;
        int anoFinal = 2024;

        // Gerar um número aleatório dentro do intervalo
        int anoAleatorio = faker.number().numberBetween(anoInicial, anoFinal + 1);

        // Converter o número para String
        String anoAleatorioStr = String.valueOf(anoAleatorio);

        return anoAleatorioStr;


    }


    public static String gerarRandomCompany() {
        return faker.company().name();
    }

    public static String gerarRandomAdress() {
        return faker.address().fullAddress();
    }


    public static String gerarRandomCity() {
        return faker.address().cityName();
    }

    public static String gerarRandomState() {
        return faker.address().state();
    }

    public static String gerarRandomPhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public static String gerarRandomCellPhone() {
        return faker.phoneNumber().cellPhone();
    }
}