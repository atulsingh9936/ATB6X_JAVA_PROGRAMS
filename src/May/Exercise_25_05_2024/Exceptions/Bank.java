package May.Exercise_25_05_2024.Exceptions;

public class Bank {
    private String Currency;
    private Integer Amount;

    public Bank(String currency, Integer amount) {
        Currency = currency;
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }


    public Integer add(Bank bankname)  {
        try {
            if(!bankname.Currency.equalsIgnoreCase("INR")){
                throw new Exception("Curreny doesnt match");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Integer sum = this.Amount +bankname.Amount;
        return sum;



    }
    public Integer add1(Bank bankname) throws Exception {

            if(!bankname.Currency.equalsIgnoreCase("INR")){
                throw new Exception("Curreny doesnt match");
            }

        Integer sum = this.Amount +bankname.Amount;
        return sum;
    }







}
