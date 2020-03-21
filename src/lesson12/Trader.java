package lesson12;

public class Trader {

    private final String name;
    private final String city;

    public Trader(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trader trader = (Trader) o;

        if (name != null ? !name.equals(trader.name) : trader.name != null) return false;
        return city != null ? city.equals(trader.city) : trader.city == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
