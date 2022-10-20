public class Main {
    public static void main(String[] args) {
    Driver driver1 = new Driver();
    Passanger passanger1 = new Passanger();
    driver1.car = "Mercedes Benz Maybach S-klasse";
    driver1.rating = driver1.fullRate;
    driver1.fullName = "Putin Vladimir Ivanovich";
    driver1.workExperience = "5 years";

    passanger1.fullName = "Karpov Daniil Vladimirovich";
    passanger1.phoneNumber = "+79147620918";
    passanger1.theNumberOfOrders = "7 orders";
    passanger1.yearOfRegistration = "2021";

    InformationAboutCompany info = new InformationAboutCompany();
    info.numberOfDrivers = (info.driver2020 + info.driver2021 + info.driver2022);   //Total driver for 3 years
    info.numberOfPassengers = (info.pass2020 + info.pass2021 + info.pass2022);   //Total pass for 3 years
    info.totalNumberOfOrders = (info.orders2020 + info.orders2021 + info.orders2022);   //Total orders for 3 years
    info.totalTurnover = (info.summa2020 + info.summa2021 + info.summa2022);   //Total Turnover for 3 years

        System.out.println("Statistic of Company:");
        System.out.println("Number of drivers: " + info.numberOfDrivers);
        System.out.println("Number of passangers: " + info.numberOfPassengers);
        System.out.println("Total number of orders: " + info.totalNumberOfOrders);
        System.out.println("Total Turnover: " + info.totalTurnover + "                                                                 ");
        System.out.println("Info of Driver:");
        System.out.println("Car: " + driver1.car);
        System.out.println("Rating: " + driver1.rating);
        System.out.println("Name: " + driver1.fullName);
        System.out.println("Work Experience: " + driver1.workExperience);
        System.out.println("Info of lastet Passenger: ");
        System.out.println("Name: " + passanger1.fullName);
        System.out.println("Phone: " + passanger1.phoneNumber);
        System.out.println("Number of Orders: " + passanger1.theNumberOfOrders);
        System.out.println("Year of Reg: " + passanger1.yearOfRegistration);


}
}
