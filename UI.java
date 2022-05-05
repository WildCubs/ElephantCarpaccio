public class UI {

    private double getDiscount(double value){
        if(value < 5000)
            return 1;
        if(value < 7000)
            return 1 - 0.03;
        if(value 10000)
        return 1 - 0.05;
        if(value < 50000)
            return 1 - 0.1;
        return 0.15;
    }

    private double getTax(String code){
        switch (code){
            "UT" : return 1 + 0.0685;
            "NV" : return 1 + 0.08;
            "TX" : return 1 + 0.0625;
            "AL" : return 1 + 0.04;
            "CA" : return 1 + 0.0825;
            default -> return 1;
        }
    }

    private double calculatePrice(int quantity, double price, String code){
        var accumulated = quantity*price;
        var discount = getDiscount(accumulated);
        var tax = getTax(code);
        var total = accumulated*discount*tax;
        return total;
    }

    public Order createOrder(){
        int quantity;
        double price;
        String stateCode;

        Scanner keybdINput = new Scanner(System.in);

        System.out.println("Enter quantity of articles:");
        quantity = keybdINput.nextInt();

        System.out.println("Enter price of each:");
        price = keybdINput.nextDouble();

        System.out.println("Enter state code:");
        stateCode = keybdINput.next();

    }

    public void addOrderToList(Order toAdd) {

        public class UI {

            private double getDiscount(double value){
                if(value < 1000)
                    return 1;
                if(value < 5000)
                    return 1 - 0.03;
                if(value < 7000)
                    return 1 - 0.05;
                if(value < 10000)
                    return 1 - 0.07;
                if(value < 50000)
                    return 1 - 0.1;
                return 0.15;
            }

            private double getTax(String code){
                switch (code){
                    "UT" : return 1 + 0.0685;
                    "NV" : return 1 + 0.08;
                    "TX" : return 1 + 0.0625;
                    "AL" : return 1 + 0.04;
                    "CA" : return 1 + 0.0825;
                    default -> return 1;
                }
            }

            private double calculatePrice(int quantity, double price, String code){
                var accumulated = quantity*price;
                var discount = getDiscount(accumulated);
                var tax = getTax(code);
                var total = accumulated*discount*tax;
                return total;
            }

            public Order createOrder(){
                int quantity;
                double price;
                String stateCode;

                Scanner keybdINput = new Scanner(System.in);

                System.out.println("Enter quantity of articles:");
                quantity = keybdINput.nextInt();

                System.out.println("Enter price of each:");
                price = keybdINput.nextDouble();

                System.out.println("Enter state code:");
                stateCode = keybdINput.next();

            }

            public void addOrderToList(Order toAdd) {

            }


        }
    }


}
