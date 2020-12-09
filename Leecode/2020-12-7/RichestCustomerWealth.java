class RichestCustomerWealth {
    int[][] acounts = new int [50][50];

    public RichestCustomerWealth(int[][] acounts){
        this.acounts = acounts;
    }

    public int maximumWealth(int [][] acounts){
        int max_wealth = 0;
        int[] wealths = new int[50];
       
        for(int i = 0; i < acounts.length; i++){
            for(int j = 0; j < acounts[i].length; j++){
                wealths[i] += acounts[i][j];
            }
        }
        for(int i = 0; i < acounts.length; i++){
            if(wealths[i] > max_wealth){
                max_wealth = wealths[i];
            }
        }

        return max_wealth;
    }
}