class Person{
    private Date birthDate;
    private static Date startDate, endDate;
    static{
        startDate = Date.valueOf("1946");
        endDate = Date.valueOf("1964");
    }

    public Person(Date birthDate){
        this.birthDate = birthDate;
    }
    /*
    boolean isBornBoomer(){
        Date startDate = Date.valueOf("1946");
        Date endDate = Date.valueOf("1964");

        return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate) < 0;
    }
*/
    boolean isBoenBoomer(){
        return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;
    }
}
