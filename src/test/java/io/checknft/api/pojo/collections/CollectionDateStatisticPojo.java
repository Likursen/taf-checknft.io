package io.checknft.api.pojo.collections;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CollectionDateStatisticPojo {
    public Integer numOfOwners;
    public Integer numOfTransfers;
    public double marketCapUSD;
    public double marketCapETH;
    public DayPeriodStats dayPeriodStats;
    public WeekPeriodStats weekPeriodStats;
    public MonthPeriodStats monthPeriodStats;
    public AllPeriodStats allPeriodStats;

    @Getter
    @Setter
    @ToString
    public static class AllPeriodStats {
        public Double avgUSDPrice;
        public Double avgETHPrice;
        public Double minUSDPrice;
        public Double minETHPrice;
        public Double maxUSDPrice;
        public Double maxETHPrice;
        public Double usdVolume;
        public Double ethVolume;
        public Double lastUSDPrice;
        public Double lastETHPrice;
        public Integer sales;
        public String period;
        public Double priceDiffUSD;
        public Double priceDiffETH;
    }

    @Getter
    @Setter
    @ToString
    public static class DayPeriodStats {
        public Double avgUSDPrice;
        public Double avgETHPrice;
        public Double minUSDPrice;
        public Double minETHPrice;
        public Double maxUSDPrice;
        public Double maxETHPrice;
        public Double usdVolume;
        public Double ethVolume;
        public Double lastUSDPrice;
        public Double lastETHPrice;
        public Integer sales;
        public String period;
        public String startDate;
        public String endDate;
        public Object priceDiffUSD;
        public Object priceDiffETH;
    }

    @Getter
    @Setter
    @ToString
    public static class MonthPeriodStats {
        public Double avgUSDPrice;
        public Double avgETHPrice;
        public Double minUSDPrice;
        public Double minETHPrice;
        public Double maxUSDPrice;
        public Double maxETHPrice;
        public Double usdVolume;
        public Double ethVolume;
        public Double lastUSDPrice;
        public Double lastETHPrice;
        public Integer sales;
        public String period;
        public String startDate;
        public String endDate;
        public Double priceDiffUSD;
        public Double priceDiffETH;
    }

    @Getter
    @Setter
    @ToString
    public static class WeekPeriodStats {
        public Double avgUSDPrice;
        public Double avgETHPrice;
        public Double minUSDPrice;
        public Double minETHPrice;
        public Double maxUSDPrice;
        public Double maxETHPrice;
        public Double usdVolume;
        public Double ethVolume;
        public Double lastUSDPrice;
        public Double lastETHPrice;
        public Integer sales;
        public String period;
        public String startDate;
        public String endDate;
        public Double priceDiffUSD;
        public Double priceDiffETH;
    }
}