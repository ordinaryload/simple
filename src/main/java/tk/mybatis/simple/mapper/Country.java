package tk.mybatis.simple.mapper;

public class Country {
    private Integer id;
    private String countryname;
    private String countrycode;

    public Integer getId() {
        return id;
    }

    public String getCountryname() {
        return countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
