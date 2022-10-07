package io.checknft.api.pojo.tokenPojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TokenPeriodStatisticPojo {
    public String startDate;
    public String endDate;
    public Double avgUSDPrice;
    public Double avgETHPrice;
    public Double minUSDPrice;
    public Double minETHPrice;
    public Double maxUSDPrice;
    public Double maxETHPrice;
    public Double usdVolume;
    public Double ethVolume;
}
