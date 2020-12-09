class TestRCW{
    public static void main(String args[]){
        int [][] acounts = {{1, 2, 3},{4, 5, 6}};
        RichestCustomerWealth test = new RichestCustomerWealth(acounts);
        int wth = test.maximumWealth(acounts);
        
        System.out.println(wth);
    }
}