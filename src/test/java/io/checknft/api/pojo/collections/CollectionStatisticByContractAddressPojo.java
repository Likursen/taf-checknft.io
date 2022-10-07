package io.checknft.api.pojo.collections;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CollectionStatisticByContractAddressPojo {
    public int id;
    public int highestPriceUSD;
    public int lowestPriceUSD;
    public long usdVolume;
    public int highestPriceETH;
    public int lowestPriceETH;
    public double ethVolume;
    public int sales;
    public double lastDayHighestPriceUSD;
    public double lastDayLowestPriceUSD;
    public double lastDayUSDVolume;
    public int lastDayHighestPriceETH;
    public double lastDayLowestPriceETH;
    public double lastDayETHVolume;
    public int lastDaySales;
}
